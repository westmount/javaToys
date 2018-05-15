package chap5;

/**
 * Created by Song on 2018/5/14.
 */
public class Tank {
  boolean isFull = false;
  void emtpy() {
    isFull = true;
  }
  protected void finalize() {
    if(isFull) {
      System.out.println("Error, must be empty");
    }
  }

  public static void main(String[] args) {
    new Tank().emtpy();
    new Tank();
    System.gc();
    //System.runFinalization();
  }
}
