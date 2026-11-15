public class ArrayStack{
    int maxSize;
    int[] stackArr;
    int top;

    public ArrayStack(int size){
        maxSize = size;
        stackArr = new int[maxSize];
        top = -1;
    }

    void push(int data){
        if(isFull()){
            System.out.println("Stack Overflow, Value cannot be pushed");
            return;
        }
        else{
            stackArr[++top] = data;
            System.out.println(data+" pushed into stack");
        }
    }

    boolean isFull(){
        return top == maxSize-1;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            return stackArr[top--];
        }
    }

    boolean isEmpty(){
        return top == -1;
    }

    void displayRecursive(){

        if(isEmpty()){
            return;
        }

        int x = pop();
        System.out.print(x+" ");
        displayRecursive();
        push(x);
    }

    boolean searchRecursive(int data){

        if(isEmpty()){
            System.out.println("Stack Empty");
            return false;
        }

        int x = pop();
        if(x==data){
            push(x);
            return true;
        }

        boolean found = searchRecursive(data);
        push(x);
        return found;
    }

   

}

