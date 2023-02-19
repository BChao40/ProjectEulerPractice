import java.lang.Math;
public class Problem7{
  /*
  Some things to note:
  -The value of the nth prime number is always at least 2x greater than n, exceptions being the first 4 prime numbers. Because we are looking at a
  large n value, we can expect the value of the nth prime to be at least 2n.
  -There is no need to check even numbers, thus we can increment by 2.
  -To check if a number is prime, we only have to check factors up until its square root.
  -Because we need to find the nth prime number, it's reasonable to assume that we have to know every prime number before it.
  */

  int n = 0;
  int i = 1;
  while (n < 10001){
    i++;
    boolean isPrime = true;
    for (int j = 0; j < Math.sqrt(i); j++){
      if (i % j == 0){
        isPrime = false;
      }
    }

  }
}
