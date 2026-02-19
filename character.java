import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = sc.next().charAt(0);
        if(ch>='a'&& ch<='z'){
            System.out.println("it is a lowercase letter");
        }
        else if(ch>='A'&& ch<='Z'){
            System.out.println("it is an uppercase letter");
        }
        else if(ch>='0'&& ch<='9'){
            System.out.println("it is a digit");
        }
        else{
            System.out.println("it is a special character");
        }
    }
      
}
