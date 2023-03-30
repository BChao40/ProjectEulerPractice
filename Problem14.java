import java.util.*;
import java.io.*;

@SuppressWarnings("unchecked")

public class Problem14{
  public static void main(String[] args){
    //System.out.println(recursion(1));
    System.out.println(naive());
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
}
