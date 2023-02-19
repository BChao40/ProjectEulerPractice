public class Problem6{
  public static void main(String[] args){
    int sum = 0;
    int sum2 = 0;
    for (int i = 1; i < 101; i++){
      sum += i;
      sum2 += Math.pow(i, 2);
    }

    System.out.printf("%.1f", Math.pow(sum, 2) - sum2);
  }
}
