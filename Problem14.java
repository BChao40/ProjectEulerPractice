public class Problem14{
  public static void main(String[] args){
    //System.out.println(recursion(1));
    System.out.println(naive());
  }

  public static int recursion(int x, int counter){
    if (x * 2 >= 1000000 || (x - 1) / 3 >= 1000000){
      return x;
    }
    else{
      if (x % 2 == 0){
        int typeA = recursion(x * 2, counter++);
        int typeB = recursion((x - 1) / 3, counter++);

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

  public static int collatz(int x){
    if (x % 2 == 0){
      return x / 2;
    }
    else{
      return x * 3 + 1;
    }
  }

  public static int naive(){
    int startValue = 0;
    int counter = 0;
    for (int i = 1; i <= 1000000; i++){
      int current = i;
      int tempCount = 0;
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
