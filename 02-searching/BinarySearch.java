import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int arraySize = sc.nextInt();
        int[] Arr=new int[arraySize];

        System.out.println("Enter each element of the array");

        for(int i=0;i<arraySize;i++){
            System.out.println("Enter the number you want to add at index: "+i);
            Arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number you want to search: ");
        int searchValue=sc.nextInt();

        if(binaryS(Arr,searchValue)>-1){
            System.out.println("The number was found at index: "+binaryS(Arr,searchValue));
        }
        else{
            System.out.println("Element not found");
        }
    }

    public static int binaryS(int[] arr, int n){
        Arrays.sort(arr);

        int lowerLimit = 0; 
        int upperLimit = arr.length-1;

        while(lowerLimit<=upperLimit){
            int mid = (lowerLimit+upperLimit)/2;

            if(arr[mid]==n){
                return mid;
            }
            else if(arr[mid]<n){
                lowerLimit=mid+1;
            }
            else{
                upperLimit=mid-1;
            }
        }
        return -1;
    }
}

