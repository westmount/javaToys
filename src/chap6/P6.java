package chap6;

/**
 * Created by Song on 2018/5/17.
 */

class Test{
  protected String a = "a";
}

public class P6 {
  public static void main(String[] args) {
    Test test = new Test();
    test.a = "b";
    System.out.println(test.a);
  }
}
