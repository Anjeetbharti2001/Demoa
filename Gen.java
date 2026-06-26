// class Node {
//     int data;
//     Node left, right;
//     Node(int data){
//         this.data = data;
//         left = null;
//         right = null;
//     }
// }
// public class Gen {
//     public static void main(String args[]){
//         Node root = new Node(1);

//         root.left = new Node(2);
//         root.right = new Node(3);

//         root.left.left = new Node(4);
//         root.left.right = new Node(5
class Node {
    int data;
    Node left,right;
    Node(int data){
       this.data = data;
       left = null;
       right = null;
    }
}
public class Gen {
    public static void main(String args[]){
       Node root = new Node(5);

       root.left = new Node(6);
       root.right = new Node(7);

       root.left.left = new Node(8);
       root.left.right = new Node(8);

       System.out.println("root:- " + root.data);
    }
}