public class LinkedList14{
  private Node14 head;
  private Node14 tail;
  private int length;

  public void add(int value) {
    Node node = new Node(value);
    if (head == null) {
      head = node;
      tail = node;
    }
    else {
      tail.getTail() = node;
      tail = node;
    }
    length++;
  }
}
