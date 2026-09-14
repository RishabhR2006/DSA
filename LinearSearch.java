import java.util.Scanner;


public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int arraySize=sc.nextInt();
        int[] Arr = new int[arraySize];

        for(int i=0;i<arraySize;i++){
            System.out.println("Enter the element at index "+i);
            Arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to search:");
        int search = sc.nextInt();

        if(searchLin(Arr,search)>-1){
            System.out.println("The number you're looking for is at index: "+searchLin(Arr,search));
        }
        else{
            System.out.println("Element not found");
        }

        sc.close();
    }

    public static int searchLin(int[] arr, int n){
        for (int i = 0; i<arr.length; i++) {
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
}
