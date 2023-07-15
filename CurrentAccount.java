package BankingSystem;

public class CurrentAccount extends Account{
    String AccountType = getClass().getSimpleName();
    public CurrentAccount(String name){
        super(name);
    }

    public String getAccountType(){
        return AccountType;
    }

}
