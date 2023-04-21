public class BankAccount {

    private double balance;
    private double minimumBalance;
    private boolean isActive = true;

    private String bankAccountHolder;

    public BankAccount(double balance, double minimumBalance) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getBankAccountHolder() {
        return bankAccountHolder;
    }

    public void setBankAccountHolder(String bankAccountHolder) {
        this.bankAccountHolder = bankAccountHolder;
    }

    public double withdraw(double amount) {
        if (balance - amount > minimumBalance) {
            balance -= amount;
            return amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    public double deposit(double amount) {
        balance += amount;
        return amount;
    }
}
