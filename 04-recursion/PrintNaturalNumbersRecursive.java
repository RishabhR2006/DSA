
import java.util.Scanner;

public class PrintNaturalNumbersRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want the natural numbers till: ");
        int n = sc.nextInt();

        System.out.println("The natural numbers till "+n+" is: ");
        printNatural(n);
    }

    static void printNatural(int n){
        if(n==0){
            return;
        }
        printNatural(n-1);
        System.out.println(n+" ");
    }
}
