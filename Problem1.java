public class Problem1{
  public static void main(String[] args){
    System.out.println(recursive53(0, 0, 1000));
    //System.out.println(recursive53(0, 0, 1000000)); //Recursion would lead to stack overflow at bigger values
    System.out.println(recursive53loop(1000));
    System.out.println(recursive53loop(1000000)); // Loop is faster for this than recursion
    //System.out.println(recursive53loop(1000000000)); //Slow for bigger numbers, real runtime is ~2.2 seconds
    System.out.println(SumDivisibleBy(3, 1000000000) + SumDivisibleBy(5, 1000000000) - SumDivisibleBy(15, 1000000000)); // Runtime of 0.12 seconds, much faster
  }

  public static int recursive53(int sum, int current, int limit){
    if (current >= limit){
      return sum;
    }
    else{
      if (current % 5 == 0 || current % 3 == 0){
        return recursive53(sum + current, current + 1, limit);
      }
      else{
        return recursive53(sum, current + 1, limit);
      }
    }
  }

  // set type to long because these methods can handle bigger limits
  public static long recursive53loop(long limit){
    long sum = 0;
    for (long i = 0; i < limit; i++){
      if (i % 5 == 0 || i % 3 == 0){
        sum += i;
      }
    }
    return sum;
  }

  public static long SumDivisibleBy(long divisor, long limit){
    long sum = (limit - 1) / divisor;
    return divisor * (sum * (sum + 1)) / 2;
  }
}
