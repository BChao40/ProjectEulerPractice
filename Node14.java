public class Node14{
  private long head;
  private Node14 tail;
  private int length;

  public Node14(long value){
    head = value;
    tail = null;
    length = 1;
  }

  public long getHead(){
    return head;
  }

  public Node14 getTail(){
    return tail;
  }

  public int getLength(){
    return length;
  }

  public Node14 setTail(Node14 other){
    tail = other;
    length += other.getLength();
    return tail;
  }
}
