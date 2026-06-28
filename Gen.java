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
    static void printLeaf(Node root) {
    // 1. Base case: If the current node is null, just go back
    if (root == null) {
        return;
    }

    // 2. Leaf check: If it has no children, print it
    if (root.left == null && root.right == null) {
        System.out.print(root.data + " ");
        return; // Optional optimization: no need to check children if it's a leaf
    }

    // 3. Traversal: Keep looking down both sides of the tree
    printLeaf(root.left);
    printLeaf(root.right);
}

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);

        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);

        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);

        root.right.right.left = new Node(14);
        root.right.right.right = new Node(15);

        printLeaf(root);
    } 
}