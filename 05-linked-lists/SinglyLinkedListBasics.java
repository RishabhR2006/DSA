public class SinglyLinkedListBasics {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    Node head=null;

    public void add(int data) {
        Node newNode=new Node(data);
        if(head==null) {
            head=newNode;
        } else {
            Node temp=head;
            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public void display() {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedListBasics list=new SinglyLinkedListBasics();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
        list.add(55);
        list.display();
    }
}
