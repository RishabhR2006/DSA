public class CircularLinkedListOperations {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head = null;
    Node tail = null;

    public void addAtBeginning(int data){

        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }
        else{
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void addAtEnd(int data){
         
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void addAtIndex(int data, int index){
        
        Node newNode = new Node(data);

        if(index == 0){
            addAtBeginning(data);
            return;
        }

        Node temp = head;
        int count = 0;

        while(temp.next!=head && count < index - 1){
            temp = temp.next;
            count++;
        }

        if(count<index-1){
            System.out.println("Index out of range");
            return;
        }
        else{
            newNode.next = temp.next;
            temp.next = newNode;
        }

        if(temp==tail){
            tail = newNode;
        }
    }

    
    public void display(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while(temp != head);
        System.out.println("(back to " + head.data + ")");
    }

    public static void main(String[] args) {
        CircularLinkedListOperations list = new CircularLinkedListOperations();
        list.addAtEnd(20);
        list.addAtEnd(40);
        list.addAtBeginning(10);
        list.addAtIndex(30, 2);
        list.addAtIndex(50, 4);
        list.display();
    }

}
