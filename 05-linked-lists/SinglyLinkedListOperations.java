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
            System.out.print(temp.data+" --> ");
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

    public void insertAtIndex(int data, int index){
        if(index <= 0 || head == null){
            insertAtBeginning(data);
            return;
        }
        Node temp = head;
        for(int i = 0; i < index - 1 && temp.next != null; i++){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        if(temp == tail){
            tail = newNode;
        }
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
        if(head==null){
            return null;
        }
        Node removed = tail;
        if(head == tail){
            head = null;
            tail = null;
            return removed;
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return removed;
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

    


    public static void main(String[] args) {
        SinglyLinkedListOperations list = new SinglyLinkedListOperations();
        list.insertAtEnd(30);
        list.insertAtEnd(10);
        list.insertAtBeginning(50);
        list.insertAtIndex(20, 2);
        System.out.print("List: ");
        list.displayLL();

        System.out.println("Number of nodes: " + list.countNodes());
        System.out.println("Is 10 present? " + list.searchNode(10));
        System.out.print("Middle element: ");
        list.middleElement();

        list.sortLL();
        System.out.print("Sorted: ");
        list.displayLL();

        System.out.println("Deleted from beginning: " + list.deleteAtBeginning().data);
        System.out.println("Deleted from end: " + list.deleteAtEnd().data);
        System.out.print("List now: ");
        list.displayLL();
    }
}