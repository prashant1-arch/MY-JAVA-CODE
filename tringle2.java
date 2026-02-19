import java.util.Scanner;

public class tringle2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first side");
        int a=sc.nextInt();
        System.out.println("enter second side");
        int b=sc.nextInt();
        System.out.println("enter third side");
        int c=sc.nextInt();
        if(a+b+c==180){
            System.out.println("tringle is valid");
        }
        else{
            System.out.println("Tringle is not valid");
        }
        if(a==b && b==c){
            System.out.println("tringle is equilateral");
        }
        else if(a==b || b==c || a==c){
            System.out.println("tringle is isosceles");
        }
        else{
            System.out.println("tringle is scalene");
        }
    }
}
