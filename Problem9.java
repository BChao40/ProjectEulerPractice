public class Problem9{
  public static void main(String[] args){
    for (double i = 100; i < 1000; i++){
      for(int j = 1; j < i ; j++){
        if ( isSquare(Math.pow(i, 2) - Math.pow(i - j, 2)) ){
          double a = Math.sqrt(Math.pow(i, 2) - Math.pow(i - j, 2));
          double b = i - j;
          double c = i;
          /*
          System.out.println("This is a: " + a + ", this is b: " + b + ", and this is c: " + c);
          System.out.println(a + b + c);
          */
          if (a + b + c == 1000){
            System.out.printf("%f%n", a * b * c);
          }
        }
      }
    }
  }

  public static boolean isSquare(double x){
    return Math.sqrt(x) % 1 == 0;
  }
}
