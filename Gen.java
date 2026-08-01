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
    public static int count(Node head){
       int count = 0; 
       while(head != null){
        count++;

        head = head.next;
       }
       return count;
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

        // Count Nodes 
        int totalNodes = count(head);

        // Display the linked list
        System.out.println(" total Count Node: " + totalNodes );
       
    }
}