public class Problem2{
  public static void main(String[] args){
    System.out.println(EvenFib(4000000));
  }

  public static long EvenFib(int limit){
    long sum = 2;
    long first = 1;
    long second = 2;
    int i = 1;
    while (i > 0){
      long temp = first;
      first = second;
      second = temp + second;
      if (second > limit){
        i = -1;
      }
      else if (second % 2 == 0){
        sum += second;
      }
    }
    return sum;
  }
}
