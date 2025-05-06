package opps;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    //getter setter (Encapsulation)

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount >0){
            balance += amount;
            System.out.println("Deposited $" + amount + ". New Balance: $" + balance);
        }
    }
    public void withdraw(double amount){
        if (amount >0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". Remaining Balance: $" + balance);
        }else {
            System.out.println("Withdrawal failed! Insufficient balance.");
        }
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Future You", 0);
        account.deposit(150000);  // 💸 Your Future Salary
    }
}
