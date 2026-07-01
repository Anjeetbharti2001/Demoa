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
    public static void main(String args[]){
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         System.out.println("Print Node:-" + root.data);
    }
}