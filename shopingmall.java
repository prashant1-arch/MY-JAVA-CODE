import java.util.Scanner;

public class shopingmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        double totalOriginalPrice = 0;
        double totalDiscount = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\nItem " + i);

            System.out.print("Enter original price: ");
            double price = sc.nextDouble();

            System.out.print("Enter discount amount: ");
            double discount = sc.nextDouble();

            totalOriginalPrice += price;
            totalDiscount += discount;
        }

        double finalAmount = totalOriginalPrice - totalDiscount;

        System.out.println("\n----- BILL DETAILS -----");
        System.out.println("Total Original Price = " + totalOriginalPrice);
        System.out.println("Total Discount = " + totalDiscount);
        System.out.println("Final Amount to Pay = " + finalAmount);

        sc.close();
    }
}
