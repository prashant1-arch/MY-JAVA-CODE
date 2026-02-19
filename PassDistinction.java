import java.util.Scanner;

public class PassDistinction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 40) {
            System.out.println("Student is Pass");

            if (marks >= 75) {
                System.out.println("Student got Distinction");
            }
        }
        else {
            System.out.println("Student is Fail");
        }

        sc.close();
    }
}
