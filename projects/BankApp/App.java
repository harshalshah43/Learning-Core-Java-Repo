package BankApp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankManager bm = new BankManager();
        Customer cust = new Customer();

        System.out.println("1. Bank Manager\n2. Customer");
        int userType = sc.nextInt();

        if (userType == 1) {
            while (true) {
                System.out.print("Enter Customer ID: ");
                int id = sc.nextInt();
                System.out.println("1. View Customer Details\n2. View Transaction History\n3. Exit");
                int opt = sc.nextInt();

                if (opt == 1)
                    bm.viewCustomerDetails(id);
                else if (opt == 2)
                    bm.viewTransactionHistory(id);
                else if (opt == 3)
                    break;
                else
                    System.out.println("Invalid option.");
            }
        } else {
            System.out.print("Enter your Customer ID: ");
            int id = sc.nextInt();

            while (true) {
                System.out.println("\n1. Deposit\n2. Withdraw\n3. Display Balance\n4. Last 5 Transactions\n5. Exit");
                int opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        System.out.print("Amount: ");
                        cust.deposit(id, sc.nextDouble());
                        break;
                    case 2:
                        System.out.print("Amount: ");
                        cust.withdraw(id, sc.nextDouble());
                        break;
                    case 3:
                        cust.displayBalance(id);
                        break;
                    case 4:
                        cust.last5transactions(id);
                        break;
                    case 5:
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid option.");
                }
            }
        }
    }
}
