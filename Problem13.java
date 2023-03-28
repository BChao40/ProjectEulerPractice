import java.util.*;
import java.io.*;

public class Problem13{
  public static void main(String[] args) throws FileNotFoundException{
    File myFile = new File("Input13.txt");

    int[] tenDigits = new int[10];

    for (int i = 1; i <= 10; i++){
      Scanner myScanner = new Scanner(myFile);
      String printLine = "";
      while (myScanner.hasNextLine()){
        String currentLine = myScanner.nextLine();
        int currentDigit = Integer.parseInt(currentLine.substring(currentLine.length() - i, currentLine.length() - i + 1));
        printLine = printLine + currentDigit;
      }
      System.out.println(printLine);
    }
  }
}
