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
     static int height(Node root){
            if(root == null){
                return 0;
            }
            return 1 + Math.max(height(root.left), height(root.right));
        }
    public static void main(String args[]){
       Node root = new Node(4);

       root.left = new Node(5);
       root.right = new Node(6);

       root.left.left = new Node(7);
       root.left.right = new Node(8);

       root.right.left = new Node(9);
       root.right.right = new Node(10);
       System.out.println("Total Height of Tree:-" + height(root));
    }
}