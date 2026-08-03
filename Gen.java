class Node {
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next = null;
    }
}
public class Gen {
    public static void main(String args[]){
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node (4);
        Node forth = new Node (5);
        Node fifth = new Node (6);
        Node sixth = new Node (7);
        Node seventh = new Node(8);
        Node eighth = new Node(9);


        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;
        
        Node temp = first;

        while(temp != null){
            System.out.print (temp.data + " ");
            temp = temp.next;
        }
    }
}