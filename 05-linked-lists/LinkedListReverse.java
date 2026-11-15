public class LinkedListReverse {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;

    void reverse() {
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null) {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }

    void add(int data) {
        Node newNode=new Node(data);
        if(head==null) {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null) temp=temp.next;
        temp.next=newNode;
    }

    void printList() {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListReverse list=new LinkedListReverse();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printList();
        list.reverse();
        list.printList();
    }
}
