package BankingSystem;

public class SavingAccount extends Account{
    String AccountType = getClass().getSimpleName();
    public SavingAccount(String name){
        super(name);
        System.out.println("Now u are in saving account");
    }
    public String getAccountType(){
        return AccountType;
    }



}
