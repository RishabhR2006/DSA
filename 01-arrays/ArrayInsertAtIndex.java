
import java.util.Scanner;


public class ArrayInsertAtIndex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int arraySize = sc.nextInt();

        int[] origArr = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter the element you want to add at index: '"+i+"'");
            origArr[i]=sc.nextInt();
        }

        int newArraySize = arraySize+1;
        int[] newArr = new int[newArraySize];

        System.out.println("Enter the number you want to insert:");
        int newVal = sc.nextInt();

        System.out.println("Enter the index you want the element to be added to");
        int index = sc.nextInt();

        for (int i = 0; i < newArraySize; i++) {
            
            if (i<index){
                newArr[i]=origArr[i];
            }
            else if(i==index){
                newArr[i]=newVal;
            }
            else{
                newArr[i]=origArr[i-1];
            }
                
            }
        
        for (int i = 0; i < newArraySize; i++) {
            System.out.println("The element at index '"+i+"' is "+newArr[i]);
        }
    }
}