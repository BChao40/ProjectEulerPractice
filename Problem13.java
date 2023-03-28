import java.util.*;
import java.io.*;

public class Problem13{
  public static void main(String[] args) throws FileNotFoundException{
    File myFile = new File("Input13.txt");

    int[] tenDigits = new int[10];

    for (int i = 1; i <= 10; i++){
      Scanner myScanner = new Scanner(myFile);
      while (myScanner.hasNextLine()){
        String currentLine = myScanner.nextLine();
        int currentDigit = Integer.parseInt(currentLine.substring(i - 1, i));
        tenDigits[i - 1] += currentDigit;


        /*
        if (tenDigits[i - 1] > 9){
          if (i - 1 != 0){
            tenDigits[i] += tenDigits[i - 1] / 10;
          }
          tenDigits[i - 1] %= 10;
        }
        */
      }
    }

    for (int i = 0; i < tenDigits.length; i++){
      //carryOver(tenDigits, i);
    }
    System.out.println(Arrays.toString(tenDigits));
  }

  public static void carryOver(int[] arr, int index){
    int BiggestDigitPlace = 10;
    int value = arr[index];
    while (arr[index] > BiggestDigitPlace){
      BiggestDigitPlace *= 10;
    }

    for (int i = 0; i < Integer.toString(BiggestDigitPlace).length() - 1; i++){
      if (index + i < arr.length){ // checks if carrying over is valid
        if (i == 0){ // checks if it's complete replacement or not
          arr[index + i] = (value / (int) Math.pow(10, i)) % 10; // carries over/replaces any digits needed to be carried over/replaced
        }
        else{
          arr[index + i] += (value / (int) Math.pow(10, i)) % 10;
        }
      }
    }
  }
}
