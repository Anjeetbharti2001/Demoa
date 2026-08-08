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
    Node First = new Node(10);
    Node second = new Node(29);
    Node third = new Node(19);

    First.next = second;
    second.next = third;

    Node temp = First;

    while (temp != null) {
      System.out.println(temp.data + " ");
      temp = temp.next;
    }
  }
}