public class LinkedListDeleteAtPosition {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;

    void deleteAtPos(int pos) {
        if(head==null) return;
        if(pos==0) {
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=0;temp!=null && i<pos-1;i++) {
            temp=temp.next;
        }
        if(temp==null || temp.next==null) return;
        temp.next=temp.next.next;
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
        LinkedListDeleteAtPosition list=new LinkedListDeleteAtPosition();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printList();
        list.deleteAtPos(2);
        list.printList();
    }
}
