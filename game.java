import java.util.Scanner;
public class game {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("guess the lucky  game!");
        int number=sc.nextInt();
        if(number==18){
            System.out.println("guess the lucky  number!");
        }
        else if(number>18){
            System.out.println("It is two high. try again!");
        }
        else{
            System.out.println("It is too low. try again!");
        }

    }
}