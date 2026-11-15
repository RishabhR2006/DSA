
import java.util.Scanner;


public class ArrayDeleteAllOccurrences{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int arraySize = sc.nextInt();
        int[] Arr = new int[arraySize];

        System.out.println("Enter each element into the array");
        for(int i=0;i<arraySize;i++){
            System.out.println("Enter the number at index: "+i);
            Arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you're looking for in the array: ");
        int searchValue = sc.nextInt();

        int count=0;

        for(int i=0;i<arraySize;i++){
            if(Arr[i] == searchValue){
                count = count + 1;
            }
        }

        int newArraySize = arraySize-count;

        int[] newArr = new int[newArraySize];
        int k =0;

        for(int i=0;i<arraySize;i++){
            if(Arr[i]!=searchValue){
                newArr[k++]=Arr[i];
            }
        }

        System.out.println("The elements now in the new array are:");
        for (int i = 0; i < newArraySize; i++) {
            System.out.println("At index "+i+": "+newArr[i]);
        }
    }
}