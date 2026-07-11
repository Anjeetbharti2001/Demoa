class Node {
        int data;
        Node right, left;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
public class Gen {
    static void printLeaf(Node root){
        if(root == null){
            return ;
        }
        if(root.left == null && root.right == null);
        System.out.print(root.data + " ");

        printLeaf(root.left);
        printLeaf(root.right);
    }
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        printLeaf(root);
    }
}