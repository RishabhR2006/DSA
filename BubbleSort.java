import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int arraySize = sc.nextInt();

        int[] Arr = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter the element you want at index '"+i+"'");
            Arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arraySize-1; i++) {
            for (int j = 0; j < arraySize - 1 - i; j++) {
                if(Arr[j]>Arr[j+1]){
                    int temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1]= temp;
                }
            }
        }

        for(int i=0 ; i<arraySize; i++){
            System.out.println("The element at index '"+i+"' is "+Arr[i]);
        }
    }
}

