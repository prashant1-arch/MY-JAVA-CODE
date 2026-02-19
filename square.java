import java.util.Scanner;
public class square {

    public static void main(String args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        if(num*num==num){
            System.out.println("number is a square");
        }
        else{
            System.out.println("number is not a square");
        }
    }
}