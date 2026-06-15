import java.util.ArrayList;

public class Bank {

    ArrayList<BankAccount> accounts =
            new ArrayList<>();

    public void createAccount(
            BankAccount account) {

        accounts.add(account);

        System.out.println(
                "Account Created Successfully.");
    }

    public BankAccount findAccount(
            int accountNumber) {

        for (BankAccount account : accounts) {

            if (account.getAccountNumber()
                    == accountNumber) {

                return account;
            }
        }

        return null;
    }

    public void displayAllAccounts() {

        for (BankAccount account : accounts) {

            account.displayAccount();
        }
    }
}