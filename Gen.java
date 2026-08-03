class Node{
    int data;
    Node next;
    Node (int data){
      this.data = data;
      this.next = null;
    }
}
public class Gen {
    // traversal Function 
    public static void traverse(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        // Create a linked list 
        Node head  = new Node(4);
        head.next = new Node (5);
        head.next.next = new Node(6);
        head.next.next.next = new Node (7);
        head.next.next.next.next = new Node (8);
        head.next.next.next.next.next = new Node(9);

        // Traversal Function
        
        System.out.println("Linked list :-");
        traverse(head);
    }
}