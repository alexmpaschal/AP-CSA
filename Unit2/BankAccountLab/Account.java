package Unit2.BankAccountLab;

public class Account {
    // Instance variables
    double accountBalance;
    double interestRate;
    int accountNumber;

    // Constructor
    public Account ( double ab, double ir, int an ) {
        accountBalance = ab;
        interestRate = ir;
        accountNumber = an;
    }

    // Methods
    public double getBalance() {
        return accountBalance;
    }

    public double getRate() {
        return interestRate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void depositFunds( double depositValue ) {
        accountBalance += depositValue;
    }

    public void setRate ( double newRate ) {
        interestRate = newRate;
    }

    public String withdrawFunds( double withdrawValue ) {
        if ( withdrawValue > accountBalance ) {
            return "Insufficient funds in account " + accountNumber;
        }
        
        accountBalance -= withdrawValue;
        return "Withdrawal successful from account" + accountNumber;
    }
}