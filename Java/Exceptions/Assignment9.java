class InsufficientFundsException extends Exception {
    private final double amount;
    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
}

class Account {
    double balance;
    final int account_no;

    public Account(int number) {
        this.account_no = number;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount <= balance)
            balance -= amount;
        else
            throw new InsufficientFundsException(amount - balance);
    }
}

public class Assignment9 {
    public static void main(String [] args) {
        Account acc = new Account(101);
        System.out.println("Depositing Rs.1000");
        acc.deposit(1000.00);
        try {
            System.out.println("Withdrawing $400");
            acc.withdraw(400.00);
            System.out.println("Withdrawing $300");
            acc.withdraw(300.00);
            System.out.println("Withdrawing $300");
            acc.withdraw(500.00);
        }
        catch(InsufficientFundsException e) {
            System.out.println("Sorry, but you are short $" + e.getAmount());
        }
    }
}
