public class LinkedListSearch {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;

    boolean isPresent(int key) {
        Node temp=head;
        while(temp!=null) {
            if(temp.data==key) return true;
            temp=temp.next;
        }
        return false;
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

    public static void main(String[] args) {
        LinkedListSearch list=new LinkedListSearch();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.isPresent(2));
        System.out.println(list.isPresent(5));
    }
}
