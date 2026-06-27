class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;

    }
}

public class Gen {
    public static void main(String args[]){
        Node root = new Node(10);
        System.out.println("Root:-" + root.data);
    }
}