import java.util.*;

public class testingjava {

  public static void main(String[] args) {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    // int num = 198;
    int numOfDigits = 0;
    while (num != 0) {
      num = num / 10;
      numOfDigits++;
    }
    int inverseAnswer = 0;
    System.out.println("testing");
    System.out.println("outside"+ "" + num);
    for (int posFromLast = 1; posFromLast <= numOfDigits ; posFromLast++) {

      int lastDigit = num % 10;
      System.out.println("last digit"+ "" + num);
      num = num / 10;
      inverseAnswer = inverseAnswer + posFromLast * (int)Math.pow(10, lastDigit - 1);
      System.out.println("inverse answer inside the loop" + (int)Math.pow(10, lastDigit - 1));
    }
    System.out.println(inverseAnswer);

  }
}