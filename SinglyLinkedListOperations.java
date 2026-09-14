public class SinglyLinkedListOperations{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void displayLL(){
        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int countNodes(){
        int count = 0;
        if(head==null){
            System.out.println("Empty Linked List");
        }
        else{
            Node temp = head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
        }

        return count;
    }

    public boolean searchNode(int key){
        Node temp = head;
        
        while(temp!=null){
            if(temp.data == key){
                return true;
            }
            else{
                temp=temp.next;
            }
        }

        return false;
    }

    public void insertAtIndex(int data, int key){
        
    }

    public Node deleteAtBeginning(){
        Node temp;
        if(head==null){
            return head;
        }
        else{
            temp = head;
            head = head.next;
        }

        return temp;
    }

    public Node deleteAtEnd(){
        Node temp;
        if(head==null){
            return head;
        }
        else{
            temp = tail;
            tail = null;
        }
        return tail;
    }

    public void sortLL(){
        Node i,j;

        for(i = head; i!=null; i=i.next){
            for(j = i.next; j!=null; j=j.next){
                if(i.data>j.data){
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }

    public void middleElement(){
        if(head==null){
            return;
        }
        Node fast = head, slow = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.data);
    }

    


}