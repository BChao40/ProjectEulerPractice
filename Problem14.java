public class Problem14{
  public static void main(String[] args){
    System.out.println(recursion(1));
  }

  public static int recursion(int x){
    if (x * 2 >= 1000000 || (x - 1) / 3 >= 1000000){
      return x;
    }
    else{
      if (x % 2 == 0){
        int typeA = recursion(x * 2);
        int typeB = recursion((x - 1) / 3);

        if (typeA > typeB){
          return typeB;
        }
        else{
          return typeA;
        }
      }
      else{
        return recursion(x * 2);
      }
    }

  }
}
