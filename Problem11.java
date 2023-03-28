
import java.util.*;
import java.io.*;
public class Project11{
  public static void main(String[] args) throws FileNotFoundException{
    File myFile = new File("Input11.txt");
    Scanner myScanner = new Scanner(myFile);
    int[][] arr = new int[20][20];
    for (int i = 0; i < 20; i++){
      for (int j = 0; j < 20; j++){
        arr[i][j] = myScanner.nextInt();
      }
    }
    int greatestProduct = 0;
    for (int i = 0; i < 20; i++){
      for (int j = 0; j < 20; j++){
        if (checkAdj(i, j, arr) > greatestProduct){
          greatestProduct = checkAdj(i, j, arr);
        }
      }
    }
    System.out.println(greatestProduct);
  }

  public static int checkAdj(int r, int c, int[][] arr){
    int tempGreatestProduct = 0;
    if (r - 3 > 0 && c - 3 > 0){
      if (checkDiagonal(1, r, c, arr) > tempGreatestProduct){
        tempGreatestProduct = checkDiagonal(1, r, c, arr);
      }
      if (checkStraight(3, r, c, arr) > tempGreatestProduct){
        tempGreatestProduct = checkStraight(1, r, c, arr);
      }
      if (checkStraight(1, r, c, arr) > tempGreatestProduct){
        tempGreatestProduct = checkStraight(3, r, c, arr);
      }
    }
    if (r - 3 > 0 && c + 3 < 20){
      if (checkDiagonal(2, r, c, arr) > tempGreatestProduct){
        tempGreatestProduct = checkDiagonal(2, r, c, arr);
      }
      if (checkStraight(3, r, c, arr) > tempGreatestProduct){
        tempGreatestProduct = checkStraight(3, r, c, arr);
      }
      if (checkStraight(2, r, c, arr) > tempGreatestProduct){
        tempGreatestProduct = checkStraight(2, r, c, arr);
      }
    }
    if (r + 3 < 20 && c - 3 > 0){
      if (checkDiagonal(3, r, c, arr) > tempGreatestProduct){
        tempGreatestProduct = checkDiagonal(3, r, c, arr);
      }
      if (checkStraight(4, r, c, arr) > tempGreatestProduct){
        tempGreatestProduct = checkStraight(4, r, c, arr);
      }
      if (checkStraight(1, r, c, arr) > tempGreatestProduct){
        tempGreatestProduct = checkStraight(1, r, c, arr);
      }
    }
    if (r + 3 < 20 && c + 3 < 20){
      if (checkDiagonal(4, r, c, arr) > tempGreatestProduct){
        tempGreatestProduct = checkDiagonal(4, r, c, arr);
      }
      if (checkStraight(4, r, c, arr) > tempGreatestProduct){
        tempGreatestProduct = checkStraight(4, r, c, arr);
      }
      if (checkStraight(2, r, c, arr) > tempGreatestProduct){
        tempGreatestProduct = checkStraight(2, r, c, arr);
      }
    }
    return tempGreatestProduct;
  }

  //1 upperleft, 2 upperright, 3 bottomleft, 4 bottomright
  public static int checkDiagonal(int mode, int r, int c, int[][] arr){
    int product = 1;
    if (mode == 1){
      for (int i = 0; i < 4; i++){
        product *= arr[r - i][c - i];
      }
    }
    if (mode == 2){
      for (int i = 0; i < 4; i++){
        product *= arr[r - i][c + i];
      }
    }
    if (mode == 3){
      for (int i = 0; i < 4; i++){
        product *= arr[r + i][c - i];
      }
    }
    if (mode == 4){
      for (int i = 0; i < 4; i++){
        product *= arr[r + i][c + i];
      }
    }
    return product;
  }

  //1 left, 2 right, 3 up, 4 down
  public static int checkStraight(int mode, int r, int c, int[][] arr){
    int product = 1;
    if (mode == 1){
      for (int i = 0; i < 4; i++){
        product *= arr[r][c - i];
      }
    }
    if (mode == 2){
      for (int i = 0; i < 4; i++){
        product *= arr[r][c + i];
      }
    }
    if (mode == 3){
      for (int i = 0; i < 4; i++){
        product *= arr[r - i][c];
      }
    }
    if (mode == 4){
      for (int i = 0; i < 4; i++){
        product *= arr[r + i][c];
      }
    }
    return product;
  }
}
