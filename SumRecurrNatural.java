import java.util.Scanner;
public class SumRecurrNatural {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want the sum of natural numbers until: ");
        int n = sc.nextInt();

        System.out.println("The sum of the natural numbers until "+n+" is: ");
        System.err.println(sumNatural(n));
    }
    static int sumNatural(int n){
        if(n==0){
            return 0;
        }
        return n+sumNatural(n-1);
    }
}
