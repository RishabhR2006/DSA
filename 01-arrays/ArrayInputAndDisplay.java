
import java.util.Scanner;

public class ArrayInputAndDisplay{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int arraySize = sc.nextInt();

        int[] Arr = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter the element at the index: "+i);
            Arr[i] = sc.nextInt();
        }

        for(int num=0; num<=arraySize;num++){
            System.out.println("The number at index '"+num+"' is "+Arr[num]);
        }
        sc.close();
    }
}
