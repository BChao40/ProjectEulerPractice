import java.util.*;
import java.io.*;

@SuppressWarnings("unchecked")

public class Problem14{
  public static void main(String[] args){
    /*
    System.out.println(naive());
    */
    System.out.println(smarter(1000000));

  }

  public static long collatz(long x){
    if (x % 2 == 0){
      return x / 2;
    }
    else{
      return x * 3 + 1;
    }
  }

  public static long naive(){
    long startValue = 0;
    long counter = 0;
    for (long i = 1; i <= 1000000; i++){
      long current = i;
      long tempCount = 0;
      while (collatz(current) > 1){
        current = collatz(current);
        tempCount++;
      }
      if (tempCount > counter){
        startValue = i;
        counter = tempCount;
      }
    }

    return startValue;
  }

  /*
  public static long smarter(int range){
    Object[] arr = new Object[range];
    for (int i = 0; i < range; i++){
      long current = i;
      LinkedList<Long> sequence = new LinkedList<Long>();
      while (current > 1){
        sequence.add(current);
        current = collatz(current);
      }
      arr[i] = sequence;
    }

    long start = 0;
    for (int i = 0; i < arr.length; i++){
      LinkedList<Long> sequence = (LinkedList<Long>) arr[i];
      if (sequence.size() > start){
        start = sequence.getFirst();
      }
    }
    return start;
  }
  */
  public static long smarter(int range){
    int longestSequence = 0;
    long sequenceStarter = 0;
    Node14[] arr = new Node14[(int) Math.pow(2, 31)]; // range of ints.
    for (int i = 0; i < (int) Math.pow(2, 31) - 10; i++){ // range of ints.
      arr[i] = new Node14(i);
    }
    for (int i = range - 1; i > 0; i--){
      long next = collatz((long) i);
      arr[i].setTail(arr[(int) next]);

      while (arr[(int) collatz(next)].getTail() == null){
        long temp = next;
        next = collatz(next);
        arr[(int) temp].setTail(arr[(int) next]);
      }

      int currentSequenceLen = arr[i].getLength();
      if (currentSequenceLen > longestSequence){
        longestSequence = currentSequenceLen;
        sequenceStarter = arr[i].getHead();
      }
    }
    return sequenceStarter;
  }
}
