class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Gen {
    // Display Linked List 
    public static void display(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        //Create nodes
        Node first = new Node(4);
        Node second = new Node(3);
        Node third = new Node(2);
        Node forth = new Node(1);

        // Connet Nodes
        first.next = second;
        second.next = third;
        third.next = forth;

        //Head of the linked list

        Node head = first;

        // Display the linked list
        System.out.println("Linked list: ");
        display(head);
    }
}