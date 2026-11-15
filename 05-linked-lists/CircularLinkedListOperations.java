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

    
}
