public class Problem14{
  public static void main(String[] args){
    //System.out.println(recursion(1));
    System.out.println(naive());

  }

  public static long recursion(long x, int counter){
    if (x * 2 >= 1000000 || (x - 1) / 3 >= 1000000){
      return x;
    }
    else{
      if (x % 2 == 0){
        long typeA = recursion(x * 2, counter++);
        long typeB = recursion((x - 1) / 3, counter++);

        if (typeA > typeB){
          return typeB;
        }
        else{
          return typeA;
        }
      }
      else{
        return recursion(x * 2, counter++);
      }
    }

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
