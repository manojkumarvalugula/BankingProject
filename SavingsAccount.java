public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(int accountNumber,String customerName,
                          double balance,
                          double interestRate)
                           {

        super(accountNumber,
                customerName,
                balance);

        this.interestRate = interestRate;
    }

    public void showInterestRate() {

        System.out.println("Interest Rate : "
                + interestRate + "%");
    }
}