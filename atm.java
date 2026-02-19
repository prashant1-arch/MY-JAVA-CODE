import java.util.Scanner;
 class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        int balance = 10000;

        System.out.print("Enter ATM PIN: ");
        int upin = sc.nextInt();

        if (upin == pin) {

            System.out.print("Enter withdraw amount: ");
            int amount = sc.nextInt();

            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Transaction Successful");
                System.out.println("Remaining Balance: " + balance);
            }
            else {
                System.out.println("Insufficient Balance");
            }

        }
        else {
            System.out.println("Wrong PIN");
        }

        sc.close();
    }
}
