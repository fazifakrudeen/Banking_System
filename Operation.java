package BankingSystem;

public interface Operation {
    public void deposit(int money);
    public void withdraw(int money);
    public void transfer(int money,Account name);
}
