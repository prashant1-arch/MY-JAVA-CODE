//swap without using third variable
import java.util.Scanner;
public class swap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();
        a = a + b; 
        b = a - b; 
        a = a - b; 
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        scanner.close();
    }
}