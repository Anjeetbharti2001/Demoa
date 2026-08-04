// store data
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Gen {
    public static void traverse(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        // create node
        Node head = new Node(8);
        head.next = new Node(6);
        head.next.next = new Node(5);

        traverse(head);
    }
}