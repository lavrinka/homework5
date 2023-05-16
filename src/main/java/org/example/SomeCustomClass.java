package org.example;

import java.util.ArrayList;

public class SomeCustomClass {

  @SuppressWarnings("all")
  public final String hello = "Hello";

  @SuppressWarnings("all")
  public void someMethod(String str) {

  }

  @SuppressWarnings("all")
  public void doSwitch(int day) {
    switch (day) {
      default:
        System.out.println("Default");
        break;
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
  }

  @SuppressWarnings("all")
  public void doWait() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  @SuppressWarnings("all")
  public void doWaitAgain() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  @SuppressWarnings("all")
  public String useAnotherPublic() {
    String s = "TEST";
    return notPrivate(s);
  }

  @SuppressWarnings("all")
  public String notPrivate(String s) {
    return s.toLowerCase();
  }

  @SuppressWarnings("all")
  public ArrayList createArrayList(int size) {
    ArrayList list = new ArrayList<>(size);
    return list;
  }

  @SuppressWarnings("all")
  public String doReturnString(String s) {
    return "This is String";
  }

  @SuppressWarnings("all")
  public String doMethodWithCommentedOut(String s) {
    //    return s;
    return s.toUpperCase();
  }

  @SuppressWarnings("all")
  public String usePublicFinalField() {
    return hello.toLowerCase();
  }

  @SuppressWarnings("all")
  public boolean alwaysReturnTrue() {
    if ("a".equalsIgnoreCase("A")) {
      return true;
    } else {
      return false;
    }
  }

}
