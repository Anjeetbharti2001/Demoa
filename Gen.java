class Node{
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
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         System.out.println("Print total Node:-" + countNode(root));
    }
}