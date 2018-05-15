package chap5;

/**
 * Created by Song on 2018/5/14.
 */
public class P10 {
  protected void finalize() {
    System.out.println("finalize");
  }

  public static void main(String[] args) {
    new P10();
    System.gc();
    System.runFinalization();
  }
}
