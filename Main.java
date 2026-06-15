import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();

        while (true) {

            System.out.println("\n===== BANK MENU =====");

            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Account");
            System.out.println("5. View All Accounts");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print(
                            "Account Number : ");

                    int accNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print(
                            "Customer Name : ");

                    String name =
                            sc.nextLine();

                    System.out.print(
                            "Initial Balance : ");

                    double balance =
                            sc.nextDouble();

                    SavingsAccount account =
                            new SavingsAccount(
                                    accNo,
                                    name,
                                    balance,
                                    5.0);

                    bank.createAccount(account);

                    break;

                case 2:

                    System.out.print(
                            "Account Number : ");

                    accNo = sc.nextInt();

                    BankAccount depositAcc =
                            bank.findAccount(accNo);

                    if (depositAcc != null) {

                        System.out.print(
                                "Amount : ");

                        double amount =
                                sc.nextDouble();

                        depositAcc.deposit(amount);

                    } else {

                        System.out.println(
                                "Account Not Found");
                    }

                    break;

                case 3:

                    System.out.print(
                            "Account Number : ");

                    accNo = sc.nextInt();

                    BankAccount withdrawAcc =
                            bank.findAccount(accNo);

                    if (withdrawAcc != null) {

                        System.out.print(
                                "Amount : ");

                        double amount =
                                sc.nextDouble();

                        withdrawAcc.withdraw(amount);

                    } else {

                        System.out.println(
                                "Account Not Found");
                    }

                    break;

                case 4:

                    System.out.print(
                            "Account Number : ");

                    accNo = sc.nextInt();

                    BankAccount viewAcc =
                            bank.findAccount(accNo);

                    if (viewAcc != null) {

                        viewAcc.displayAccount();

                    } else {

                        System.out.println(
                                "Account Not Found");
                    }

                    break;

                case 5:

                    bank.displayAllAccounts();
                      break;

                case 6:

                    System.out.println(
                            "Thank You!");

                    System.exit(0);

                default:

                    System.out.println(
                            "Invalid Choice");
            }
        }
    }
}