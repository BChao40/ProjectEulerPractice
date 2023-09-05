/*
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
*/

public class Problem3{
  public static void main(String[] args){
    largestPrimeFactor(600851475143L);
  }

  public static long largestPrimeFactor(long n){
    long target = n;
    long largestPrime = 0;
    for (long i = 1; i < target; i+=2){
      if (n % i == 0){
        target = n/i;
        boolean isPrime = true;
        for (long j = 3; j < i/2; j+=2){
          if (i % j == 0){
            isPrime = false;
            j = i/2;
          }
        }
        if (isPrime){
          largestPrime = i;
          System.out.println(i);
        }
      }
    }
    return largestPrime;
  }

}
