package chap5;

/**
 * Created by Song on 2018/5/12.
 */
public class Dog {
  void bark(String str) {
    System.out.println("barking");
  }

  void bark(Integer num) {
    System.out.println("howling " + num + " times");
  }

  void bark(Integer num, String str) {
    System.out.println("Integer, String");
  }

  void bark(String str, Integer num) {
    System.out.println("String, Integer");
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.bark(1);
    dog.bark("hahah");
    dog.bark(1, "hahah");
    dog.bark("hahah", 1);
  }
}
