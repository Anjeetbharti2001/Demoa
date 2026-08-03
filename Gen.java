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

        first.next = second;
        second.next = third;

        Node temp = first;

        while(temp != null){
            System.out.print (temp.data + " ");
            temp = temp.next;
        }
    }
}