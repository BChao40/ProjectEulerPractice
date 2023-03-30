public class Problem14{
  public static void main(String[] args){
    //System.out.println(recursion(1));
    System.out.println(naive());

  }

  public static long collatz(long x){
    if (x % 2 == 0){
      return x / 2;
    }
    else{
      return x * 3 + 1;
    }
  }

  public static long naive(){
    long startValue = 0;
    long counter = 0;
    for (long i = 1; i <= 1000000; i++){
      long current = i;
      long tempCount = 0;
      while (collatz(current) > 1){
        current = collatz(current);
        tempCount++;
      }
      if (tempCount > counter){
        startValue = i;
        counter = tempCount;
      }
    }

    return startValue;
  }
}
