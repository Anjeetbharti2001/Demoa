class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class Gen {
    public static void main(String args[]){
        Node first = new Node(3);
        Node second = new Node(2);
        Node third = new Node(1);

        first.next = second;
        second.next = third;

        Node temp = first;


        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}