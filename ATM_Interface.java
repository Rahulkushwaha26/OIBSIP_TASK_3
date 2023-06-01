import java.util.Scanner;
public class ATM_Interface {

    public static void main(String[] args) {
        int balance = 50000, withdraw, deposit;

        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        System.out.print(" Please enter the USER NAME   : ");
        String Name = sc.next();
        System.out.print(" Please enter the PIN NUMBER  : ");
        int password = sc.nextInt();
        int i = 1;
        if(password != pin) {
            while (true) {
                i++;
                System.out.println("\n WRONG !! User Name OR Pin Number ");
                System.out.println("\n (Maximum Attempts = 3)");
                System.out.print("\n Please Re-Enter your USER NAME : ");
                Name = sc.next();
                System.out.print(" Please Re-Enter your PIN NUMBER : ");
                password = sc.nextInt();
                if(password == pin) {
                    break;
                }
                if (i == 3) {
                    System.out.println("\n SORRY !! You have exceeded your trials !!! \n Retry After some time !");
                    System.exit(0);
                }
            }
        }
        System.out.print("\n       <*------WELCOME !! "+ Name +" to our BANK ATM Services------*>\n");
        while (true) {
            System.out.print("\n Enter 1 -> To Check your Balance amount");
            System.out.println("\n Enter 2 -> To Withdraw Funds");
            System.out.println(" Enter 3 -> To Deposit Funds");
            System.out.println(" Enter 4 -> To Transfer Funds");
            System.out.println(" Enter 5 -> To QUIT");
            System.out.print("\n Choose one of the option you want to perform : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("\n Your BALANCE is : " + balance);
                    System.out.println(" ");
                }
                case 2 -> {
                    System.out.print("\n Enter the amount for  WITHDRAW : ");
                    withdraw = sc.nextInt();

                    if (withdraw > balance || balance == 0) {
                        System.out.println("\n SORRY ! You have insufficient balance !!\n");
                        break;
                    }
                    System.out.println("\n Transaction SUCCESSFUL collect your amount !!");
                    balance = balance - withdraw;
                    System.out.println(" ");
                }
                case 3 -> {
                    System.out.print("\n Enter money for DEPOSIT : ");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("\n Your Money has been SUCCESSFULLY deposited !!");
                    System.out.println(" ");
                }
                case 4 -> {
                    System.out.print("\n Enter the Account number = ");
                    sc.nextLong();
                    System.out.print(" Enter the amount to be transfer = ");
                    int amount = sc.nextInt();
                    System.out.println("\n Enter 1 -> To confirm\n Enter 2 -> To Stop ");
                    int select = sc.nextInt();
                    if (select == 1) {
                        balance -= amount;
                        System.out.println("\n Amount TRANSFERED Successfully !!");
                    } else if (select == 2) {
                        System.out.println("\n Transaction CANCELLED !!....");
                    }
                }
                case 5 -> {
                    System.out.print("\n THANK YOU !! for using our ATM SERVICES !! \n\n");
                    System.exit(0);
                }
            }
        }
    }
}
