
import java.util.Scanner;


public class FactorialRecurr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want the factorial of: ");
        int n = sc.nextInt();

        System.out.println(recurrFactorial(n));
    }

    static int recurrFactorial(int n){
        if(n==1){
            return 1;
        }
        return n*recurrFactorial(n-1);
    }
}
