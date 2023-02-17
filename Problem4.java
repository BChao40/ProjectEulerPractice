public class Problem4{
  public static void main(String[] args){
    int greatestValue = 10000;
    for (int i = 100; i < 1000; i++){
      for (int j = 100; j < 1000; j++){
        int checking = j * i;
        System.out.println(checking);
        boolean isPalindrome = true;
        if (checking > greatestValue){
          int checkingLength = (int) (Math.log10(checking) + 1);
          System.out.println(checkingLength);
          for (int k = 0; k < checkingLength; k++){
            if (!(i % Math.pow(10, checkingLength - k) == j % Math.pow(10, k))){
              isPalindrome = false;
            }
          }
          if (isPalindrome){
            greatestValue = checking;
          }
        }
      }
    }
    System.out.println(greatestValue);
  }
}
