import java.util.Scanner;
    public class persentage {
        public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter marks of subject 1:");
         int sub1=sc.nextInt();
         System.out.println("Enter marks of subject 2:");
         int sub2=sc.nextInt();
         System.out.println("Enter marks of subject 3:");
         int sub3=sc.nextInt();
         System.out.println("Enter marks of subject 4:");
         int sub4=sc.nextInt();
         System.out.println("Enter marks of subject 5:");
         int sub5=sc.nextInt();
         
         int totalMarks=sub1+sub2+sub3+sub4+sub5;
         double percentage=(totalMarks/500.0)*100;
         
         System.out.println("Total Marks: "+totalMarks);
         System.out.println("Percentage: "+percentage+"%");
        }
    }
    