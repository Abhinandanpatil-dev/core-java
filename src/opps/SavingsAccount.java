package opps;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String owner, double balance, double interestRate) {
        super(owner, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {

        if (amount > 0 && amount <=getBalance()){
            if (amount >50000){
                System.out.println("Withdrawal limit exceeded for Savings Account!");
            }
            super.withdraw(amount);
        }else {
            System.out.println("Withdrawal failed! Insufficient balance.");
        }

    }
    public void setInterestRate(){
        double interest =getBalance() *interestRate/10;
        deposit(interest);
        System.out.println("Interest added: $" + interest);

    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount =new SavingsAccount("Future You", 0,100);
        savingsAccount.deposit(30000);
        savingsAccount.withdraw(5000);
        savingsAccount.setInterestRate();
    }
}
