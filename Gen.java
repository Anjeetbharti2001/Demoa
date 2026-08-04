//  class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// // Insert at beginning 
// public static Node insertAtBeginning(Node head, int data){
//     Node newNode = new Node(data);
//     newNode.next = head;
//     head = newNode;
//     return head;
// }
// public class Gen {
//     public static void display(Node head){
//         Node temp = head;

//         while(temp != null){
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
//     public static void main(String args[]){
//       Node head = new Node(5);
//       head.next = new Node(2);
//       head.next.next = new Node(8);

//       System.out.println("Before insertion :");
//       display(head);

//       head = insertAtBeginning(head, 5);

//       System.out.println("After insertion :");
//       display(head);
//     }
// }

public class Gen {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at beginning
    public static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    // Display Linked List
    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;   // Fixed
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(5);
        head.next = new Node(2);
        head.next.next = new Node(8);

        System.out.println("Before insertion:");
        display(head);

        head = insertAtBeginning(head, 10);

        System.out.println("After insertion:");
        display(head);
    }
}