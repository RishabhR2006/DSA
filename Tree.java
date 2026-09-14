public class Tree {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    Node root = null;

    void inorder(Node node){
        if(node == null){
            return;
        }
        else{
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    void preorder(Node node){
        if(node == null){
            return;
        }
        else{
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    void postorder(Node node){
        if(node == null){
            return;
        }
        else{
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data+" ");
        }
    }

    void addRight(Node node, int data){
        if(node == null){
            System.out.println("Child node cannot be added to a null parent node");
        }
        else{
            node.right = new Node(data);
        }
    }

    void addLeft(Node node, int data){
        if(node==null){
            System.out.println("Child node cannot be added to a null parent node");
        }
        else{
            node.left = new Node(data);
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.left.right = new Node(30);
        tree.root.left.left = new Node(55);
        tree.root.right = new Node(15);
        tree.root.right.left = new Node(23);
        tree.root.right.right = new Node(52);

        tree.inorder(tree.root);

        tree.preorder(tree.root);

        tree.postorder(tree.root);

    }
}
