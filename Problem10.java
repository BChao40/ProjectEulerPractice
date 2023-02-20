public class Problem10{
  public static void main(String[] args){
    double sum = 0;
    sum += 5;
    for (int i = 5; i <= 2000000; i += 2){
      boolean isPrime = true;
      for (int j = 2; j < i / 2; j++){
        if (i % j == 0){
          j += i / 2;
          isPrime = false;
        }
      }
      if (isPrime){
        System.out.println(i);
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
