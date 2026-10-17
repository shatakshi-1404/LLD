class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException(
                "Invalid initial balance"
            );
        }
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Amount must be positive"
            );
        }

        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}