import java.util.Scanner;

public class InsertPreDefArr {
    public static void main(String[] args) {
        int[] Arr = {12, 47, 5, 33, 89, 21, 56, 3, 78, 64, 17, 29, 90, 8, 42};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to insert into the array:");
        int newElem = sc.nextInt();

        System.out.println("Enter the index at which you want the element to be inserted into:");
        int indexNew = sc.nextInt();

        int[] newArr = InsertArr(Arr, newElem, indexNew);

        for (int i = 0; i < newArr.length; i++) {
            System.out.println("The element at index '"+i+"' is "+newArr[i]);
        }
    }

    public static int[] InsertArr(int[] origArr, int newVal, int index){
        int[] newArr = new int[origArr.length+1];

        for(int i=0; i<newArr.length; i++){
            if(i<index){
                newArr[i]=origArr[i];
            }
            else if(i==index){
                newArr[i] = newVal;
            }
            else{
                newArr[i]=origArr[i-1];
            }
        }

        return newArr;
    }
}
