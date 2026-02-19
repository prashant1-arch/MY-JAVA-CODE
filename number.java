import java.util.Scanner;
public class number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        if(num%7==0 && num%11==0){
            System.out.println("number is divisible by 7 and 11");
        }
        else{
            System.out.println("number is not divisible by 7 and 11");
        }
    }
}
