package Unit2.BankAccountLab;

public class Main {
    public static void main(String[] args) {
        // Make two new Account objects, savingsAccount and checkingAccount
        Account savingsAccount = new Account( 5000.00, .02, 12345);
        Account checkingAccount = new Account( 3000.00, .005, 56789 );

        // Display account information for each object
        displayAccountInformation( savingsAccount, checkingAccount );

        // Deposit $500.00 into each account
        System.out.println( "\nDepositing $500.00 into each account" );

        savingsAccount.depositFunds( 500.00 );
        checkingAccount.depositFunds( 500.00 );

        // Change interest rate for each account to 1.5%
        System.out.println( "\nChanging each account's interest rate to 1.5%" );

        savingsAccount.setRate( .015 );
        checkingAccount.setRate( .015 );

        // Display new information for each account
        System.out.println( "\nDisplaying new account information..." );

        displayAccountInformation( savingsAccount, checkingAccount );

        // Withdraw $1000.00 from each account and display new balances
        System.out.println( "\nWithdrawing $1000.00 from each account" );
        savingsAccount.withdrawFunds( 1000.00);
        checkingAccount.withdrawFunds( 1000.00 );

        System.out.println( "\nDisplaying new account balances..." );
        System.out.println( "\nsavingsAccount Balance: " + savingsAccount.getBalance() );
        System.out.println( "checkingAccount Balance: " + checkingAccount.getBalance() );

        // Withdraw $6000.00 from each account to display error message
        System.out.println( "\nAttempting to withdraw $6000.00 from each account" );

        System.out.println( "\n" + savingsAccount.withdrawFunds( 6000.00 ) );
        System.out.println( checkingAccount.withdrawFunds( 6000.00 ) );
    }

    public static void displayAccountInformation( Account savingsAccount, Account checkingAccount) {
        System.out.println( "\nsavingsAccount Balance: " + savingsAccount.getBalance() );
        System.out.println( "savingsAccount Interest Rate: " + savingsAccount.getRate() * 100 + "%" );
        System.out.println( "savingsAccount Account Number: " + savingsAccount.getAccountNumber() );
        
        System.out.println();
        
        System.out.println( "checkingAccount Balance: " + checkingAccount.getBalance() );
        System.out.println( "checkingAccount Interest Rate: " + checkingAccount.getRate() * 100 + "%" );
        System.out.println( "checkingAccount Account Number: " + checkingAccount.getAccountNumber() );
    }
}
