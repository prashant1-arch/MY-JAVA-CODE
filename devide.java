public class devide {
    public static void main(String[] args) {
// devide using without using division operator
        int a = 10;
        int b = 20;
        int result = 0;
        while (a >= b) {
            a = a - b;
            result++;
        }
        System.out.println("Result: " + result);
    }
}