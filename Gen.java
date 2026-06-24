class Node {
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class Gen{
    // Total nodes count
    static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public static void main(String [] args){
        //tree creation
        Node root = new Node(1);
        root.left = new Node(2);

        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int nodes = countNodes(root);
        int edges = nodes - 1;

        System.out.println("Total Nodes = " + nodes);
        System.out.println("Total Edges = " + edges);
    }
}