import java.util.Scanner;

public class atmProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // define variables
        String password;
        String userName;
        int right;
        int process = 0;
        int deposit;
        int withdraw;
        int transfer;
        int press;
        double balance = 1000;

        // prompt of user information
        System.out.println("*****************");
        System.out.println("SIGNING SECTION");
        System.out.print("Please define your username: ");
        userName = input.nextLine();

        System.out.print("Please define your password: ");
        password = input.nextLine();
        System.out.println("*****************");

        // showing user information
        System.out.println("\n*****************");
        System.out.printf("USER INFORMATION \nUsername: %s\nPassword: %s\n", userName, password);
        System.out.println("*****************\n");

        // logging section
        System.out.println("LOGGING SECTION");
        for (right = 1; right <= 3; right++) {
            System.out.print("Please enter your username: ");
            String checkUserName = input.nextLine();
            System.out.print("Please enter your password: ");
            String checkPassword = input.nextLine();

            if ((checkUserName.equals(userName) && checkPassword.equals(password))) {
                System.out.println("Correct! You have successfully logged in .");
                while (process == 0) {
                    System.out.println("1- Deposit\n2- Withdraw\n3- Transfer\n4- Exit ");
                    System.out.println("Please, enter the number of process you want to to: ");
                    process = input.nextInt();
                    switch (process) {
                        case 1: // deposit
                            System.out.println("How much money do you want to deposit?");
                            deposit = input.nextInt();
                            balance += deposit;
                            System.out.println("Your current balance is: " + balance);
                            process = 0;
                            break;

                        case 2: // withdraw
                            System.out.println("How much money do you want to withdraw?");
                            withdraw = input.nextInt();
                            while (withdraw > balance) {
                                System.out.println("You don't have enough money. Please press 1 to try again or press 2 to go back to main menu: ");
                                press = input.nextInt();
                                if (press == 2) {
                                    process = 0; // Ana menüye dön
                                    break;
                                } else if (press == 1) {
                                    System.out.println("How much money do you want to withdraw?");
                                    withdraw = input.nextInt();
                                } else {
                                    System.out.println("You have made an incorrect selection.");
                                    break; // Geçersiz bir seçimde ana menüye dönme
                                }
                            }
                            if (withdraw <= balance) {
                                balance -= withdraw;
                                System.out.println("Your current balance is: " + balance);
                                process = 0; // İşlem tamamlandığında ana menüye dön
                            }
                            break;

                        case 3: // transfer
                            System.out.println("How much money do you want to transfer?");
                            transfer = input.nextInt();
                            while (transfer > balance) {
                                System.out.println("You don't have enough money. Please press 1 to try again or press 2 to go back to main menu: ");
                                press = input.nextInt();
                                if (press == 2) {
                                    process = 0; // Ana menüye dön
                                    break;
                                } else if (press == 1) {
                                    System.out.println("How much money do you want to transfer?");
                                    transfer = input.nextInt();
                                } else {
                                    System.out.println("You have made an incorrect selection.");
                                    break;
                                }
                            }
                            if (transfer <= balance) {
                                balance -= transfer;
                                System.out.println("Your current balance is: " + balance);
                                process = 0;
                            }
                            break;
                        case 4:
                            return;
                    }
                }
            } else {
                if (right != 3) {
                    System.out.println("Wrong! Your username or password is incorrect, please try again.");
                    System.out.println("Your remaining right: " + (3 - right));
                } else {
                    System.out.println("Your remaining right: 0");
                }
            }
        }
        System.out.println("You have entered incorrectly 3 times. Your account has been locked.");
    }
}
