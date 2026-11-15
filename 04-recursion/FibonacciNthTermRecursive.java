
import java.util.Scanner;

public class FibonacciNthTermRecursive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of the term you want from the Fibonacci Series: ");
        int n = sc.nextInt();
        System.out.println(fibRecurrTillN(n));
    }

    static int fibRecurrTillN(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fibRecurrTillN(n-1)+fibRecurrTillN(n-2);
    }
}