public class Problem5{
  public static void main(String[] args){
    /*
    Divisble by 1-20 implies the following:
    -Must be even
    -There is no need to check if it can be divided by 2, 3, 4, 5, 6, 7, 8, 9, 10, 15 because those are checked when dividing by 12, 14, 16, 18, 20
    -Must still check if divisible by 11, 13, 17, 19 (notably, they are primes)
    */

    int i = 20;
    while (i % 20 + i % 18 + i % 16 + i % 14 + i % 12 + i % 19 + i % 17 + i % 13 + i % 11 != 0){
      i += 20;
    }
    System.out.println(i);
  }
}
