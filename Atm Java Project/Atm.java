
/**
 * ATM internal working project
 * 
 */
import java.util.*;

public class Atm {

    public static void main(String[] args) {

        int pin = 1234;
        int balance = 10000;

        /**
         * Basic ATM Functions
         * Amount withdraw
         * Amount Deposit
         * Balance Check
         */

        int AddAmount = 0;
        int TakeAmount = 0;

        String name;

        Scanner scanner = new Scanner(System.in);

        // Taking input from the user

        System.out.println("Enter Your Pin:");

        int password = scanner.nextInt();

        if (password == pin) {
            System.out.println("Enter Your name");
            name = scanner.next();
            System.out.println("Welcome" + name);

            while (true) {
                System.out.println("Press 1 to check your balance: ");
                System.out.println("Press 2 to add amount: ");
                System.out.println("press 3 to take amount: ");
                System.out.println("Press 4 to print receipt :");
                System.out.println("press 5 to EXIT: ");

                int opt = scanner.nextInt();

                switch (opt) {
                    case 1:
                        System.out.println("Your current balance is:" + balance);
                        break;

                    case 2:
                        System.out.println("How much amount you need to Add");
                        AddAmount = scanner.nextInt();
                        System.out.println("Sucessfully Credited");
                        balance = AddAmount + balance;
                        break;

                    case 3:
                        System.out.println("How much amount you need to withdraw: ");
                        TakeAmount = scanner.nextInt();
                        if (TakeAmount > balance) {
                            System.out.println("Insufficinat balance");
                            System.out.println("Try less than your available balance:");
                        } else {
                            System.out.println("Amount withdraw sucessfull");
                            balance = balance - TakeAmount;
                        }
                        break;
                    case 4:
                        System.out.println("Wellcome to SBI ATM");
                        System.out.println("Available balance: " + balance);
                        System.out.println("Amount Deposited" + AddAmount);
                        System.out.println("Amount Withdrawn:" + TakeAmount);
                        System.out.println("Thank for coming ");
                        break;
                }
                if (opt == 5) {
                    System.out.println("Thank You");
                    break;
                }

            }
        } else {
            System.out.println("Enter Correct Pin");
        }

    }
}