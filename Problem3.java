public class Problem3{
  public static void main(String[] args){
    System.out.println(largestPrimeFactor(600851475143L));
  }

  public static long largestPrimeFactor(long n){
    long i = 1;
    long largestPrime = 0;
    while (i < n){
      boolean shouldCheck = true;
      for (long j = 2; j < i; j++){
        if (i % j == 0 && i != 2){
          shouldCheck = false;
        }
      }
      if (shouldCheck){
        if (n % i == 0){
          largestPrime = i;
          System.out.println(largestPrime);
        }
      }
      i++;
    }

    return largestPrime;
  }
}
