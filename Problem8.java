import java.io.*;
import java.util.*;
public class Problem8{
  public static void main(String[] args) throws FileNotFoundException{
    File myFile = new File("Input8.txt");
    Scanner myScanner = new Scanner(myFile);
    int[] arr = new int[1000];
    int n = 0;
    while (n < 20){
      String stringOfNums = myScanner.next();
      for (int i = 0 + (n * 50); i < 50 + (n * 50); i++){
        arr[i] = Character.getNumericValue(stringOfNums.charAt(i - (n * 50)));
      }
      n++;
    }
    long greatestValue = 0;
    for (int i = 0; i < 1000 - 13; i++){
      long product = 1;
      for(int j = 0; j < 13; j++){
        product *= arr[i + j];
      }
      if (product > greatestValue){
        greatestValue = product;
      }
    }
    System.out.println(greatestValue);
  }
}
