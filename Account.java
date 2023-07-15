package BankingSystem;

public abstract class Account implements Operation {
    private int balance;
    private String name;

    public Account(String name){
        balance =0;
        this.name = name;
    }

    public void deposit(int money){
        balance += money;
        System.out.println("The money has been successfully deposited. Now your balance is "+balance);
    }
    public void withdraw(int money){
        if(balance < money){
            System.out.println("The money is insufficient");
        }else{
            balance -= money;
            System.out.println("The money has been withdrawn from the account. Now the current balance is "+balance);
        }


    }
    public void transfer(int money,Account recep){
        balance -= money;
        recep.deposit(money);
        System.out.println("the money has been successfully transfered to ");
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }


}
