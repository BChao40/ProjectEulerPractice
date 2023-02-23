import java.lang.Math;
public class Problem12{
  public static void main(String[] args){
    int triNum = 0;
    int adding = 1;
    while (!overFiveHundred(triNum)){
      triNum += adding;
      adding++;
      System.out.println(triNum);
    }
    System.out.println(triNum);
  }

  public static boolean overFiveHundred(int x){
    int counter = 0;
    for (int i = 1; i <= Math.sqrt(x); i++){
      if (x % i == 0){
        counter++;
      }
    }
    counter *= 2;
    return (counter > 500);
  }
}
