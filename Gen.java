class Node {
    int data;
    Node next;
    Node (int data){
        this.data = data;
        this.next = null;
    }
}
public class Gen {
    public static void main(String args[]){
        Node first = new Node(50);
        Node second = new Node (90);
        Node third = new Node (55);
        Node fourth = new Node (77);
        Node fifth = new Node (40);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;


        Node temp = first;

        while(temp != null){
             System.out.println(temp.data + " ");
             temp = temp.next;
        }
    }
}