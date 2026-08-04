class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Gen {

    public static void travese(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        // Create a node
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(3);

        travese(head);

    }
}