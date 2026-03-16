package Lab9;

class BankAccount {
    String accountNumber;
    double balance;
    BankAccount(String acc, double bal) { this.accountNumber = acc; this.balance = bal; }
    void deposit(double amount) { balance += amount; System.out.println("Депозит: " + amount); }
    void withdraw(double amount) { if(balance >= amount) balance -= amount; System.out.println("Остаток: " + balance); }
}
class SavingsAccount extends BankAccount {
    SavingsAccount(String acc, double bal) { super(acc, bal); }
}
class CreditAccount extends BankAccount {
    CreditAccount(String acc, double bal) { super(acc, bal); }
}
public class Task4 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 1000);
        sa.deposit(500);
        sa.withdraw(200);
    }
}