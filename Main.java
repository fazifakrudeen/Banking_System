package BankingSystem;

public class Main {
    public static void main(String[] args){
        SavingAccount fazil = new SavingAccount("Fazil");
        CurrentAccount fazil1 = new CurrentAccount("fazil");
        System.out.println(fazil.getName());
        fazil.deposit(500);
        System.out.println(fazil.getBalance());
        fazil.withdraw(400);
        System.out.println(fazil.getBalance());
        System.out.println(fazil.getAccountType());
        fazil.transfer(100,fazil1);



        System.out.println(fazil1.getBalance());
        System.out.println(fazil1.getAccountType());

        Loan fazil22 = new Loan("home");

    }
}
