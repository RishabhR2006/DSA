public class AddBeforeNode {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;

    void addBefore(int target,int data) {
        Node newNode=new Node(data);
        if(head==null) return;
        if(head.data==target) {
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.data!=target) {
            temp=temp.next;
        }
        if(temp.next!=null) {
            newNode.next=temp.next;
            temp.next=newNode;
        }
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
        AddBeforeNode list=new AddBeforeNode();
        list.add(1);
        list.add(2);
        list.add(4);
        list.printList();
        list.addBefore(4,3);
        list.printList();
    }
}
