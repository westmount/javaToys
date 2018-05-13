package chap5;

/**
 * Created by Song on 2018/5/13.
 */
public class P9 {
  P9() {
    System.out.println("construct");
  }

  P9(String str) {
    this();
    System.out.println(str);
  }

  public static void main(String[] args) {
    P9 p9 = new P9("test");
  }
}
