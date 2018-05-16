package chap5;

/**
 * Created by Song on 2018/5/16.
 */
public class P19 {
  static void print(String... strs) {
    for (String str : strs) {
      System.out.println(str);
    }
  }

  public static void main(String[] args) {
    print("a", "b", "c");
    print(new String[]{"a", "b", "c"});

  }
}
