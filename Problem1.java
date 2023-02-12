public class Problem1{
  public static void main(String[] args){
    System.out.println(recursive53(0, 0));
  }

  public static int recursive53(int sum, int current){
    if (current >= 1000){
      return sum;
    }
    else{
      if (current % 5 == 0 || current % 3 == 0){
        return recursive53(sum + current, current + 1);
      }
      else{
        return recursive53(sum, current + 1);
      }
    }
  }
}
