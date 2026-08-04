class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Gen {
    public static void main(String args[]) {

        // create a linked list
        Node first = new Node(3);
        Node second = new Node(8);
        Node third = new Node(6);

        first.next = second;
        second.next = third;

        Node temp = first;

        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}