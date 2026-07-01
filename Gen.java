class Node {
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class Gen {
    static int countNode(Node root){
        if(root == null){
            return 0;
        }
        return 1 + countNode(root.left) + countNode(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(9);

        root.left = new Node(10);
        root.right = new Node(11);

        root.left.left = new Node(12);
        root.left.right = new Node(13);

        root.right.left = new Node(14);
        root.right.right = new Node(15);
       
        System.out.println("Total Node print :- " + countNode(root));
        System.out.println("Print root:-" + root.data);
    }
}