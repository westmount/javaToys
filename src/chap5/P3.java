package chap5;

/**
 * Created by Song on 2018/5/12.
 */
public class P3 {
  P3() {
    System.out.println("construct P3");
  }

  P3(String str) {
    System.out.println("construct P3 " + str);
  }

  public static void main(String[] args) {
    P3 p3 = new P3("overload");
  }
}
