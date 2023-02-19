public class Problem4{
  public static void main(String[] args){
    int greatestValue = 10000;
    for (int i = 100; i < 1000; i++){
      for (int j = 100; j < 1000; j++){
        int checking = j * i;
        boolean isPalindrome = true;
        if (checking > greatestValue && IsPalindrome(checking)){
          greatestValue = checking;
        }
      }
    }
    System.out.println(greatestValue);
  }

  public static boolean IsPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int halfNumber = 0;
        while(x > halfNumber) {
            halfNumber = halfNumber * 10 + x % 10;
            x /= 10;
        }
        return x == halfNumber || x == halfNumber/10;
    }
}
