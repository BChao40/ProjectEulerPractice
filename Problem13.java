import java.util.*;
import java.io.*;

public class Problem13{
  public static void main(String[] args) throws FileNotFoundException{
    File myFile = new File("Input13.txt");

    int[] fiftyDigits = new int[52]; // This is to save time, but if I had a different sample size that I didn't know the size of, I'd use an array list that resizes to make room for a sum with more digits than the addends
    //Additionally, I'd change specific checks to work with a changing arraylist.
    for (int i = 1; i <= fiftyDigits.length; i++){
      Scanner myScanner = new Scanner(myFile);
      while (myScanner.hasNextLine()){
        String currentLine = myScanner.nextLine();
        if (i > 2){
          int currentDigit = Integer.parseInt(currentLine.substring(fiftyDigits.length - i, fiftyDigits.length - i + 1));
          fiftyDigits[i - 3] += currentDigit;
        }

        /*
        if (fiftyDigits[i - 1] > 9){
          if (i - 1 != 0){
            fiftyDigits[i] += fiftyDigits[i - 1] / 10;
          }
          fiftyDigits[i - 1] %= 10;
        }
        */
      }
    }

    for (int i = 0; i < fiftyDigits.length; i++){
      carryOver(fiftyDigits, i);
    }
    System.out.println(Arrays.toString(fiftyDigits));
  }

  public static void carryOver(int[] arr, int index){
    int BiggestDigitPlace = 10;
    int value = arr[index];

    System.out.println(value);
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
