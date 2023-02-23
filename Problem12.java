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
    for (int i = 1; i <= x; i++){
      if (x % i == 0){
        counter++;
      }
    }
    return (counter > 500);
  }
}
