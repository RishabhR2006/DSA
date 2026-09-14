
import java.util.Scanner;


public class FibRecurr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term you want the fibonacci series until:  ");
        int n = sc.nextInt();

        for (int i = 0; i <=n; i++) {
            System.out.println(fibRecurr(i));
        }
    }

    static int fibRecurr(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fibRecurr(n-1)+fibRecurr(n-2);
    }
}