package chap5;

/**
 * Created by Song on 2018/5/16.
 */
public class P21 {
  public static void main(String[] args) {
    for (Money money : Money.values()) {
      System.out.println(money + ", ordinal " + money.ordinal());
      switch(money) {
        case ONE:
          System.out.println("1");
          break;
        case TWO:
          System.out.println("2");
          break;
        case FIVE:
          System.out.println("5");
          break;
        case TEN:
          System.out.println("10");
          break;
        case TWENTY:
          System.out.println("20");
          break;
        case FIFTY:
          System.out.println("50");
          break;
      }
    }

  }
}
