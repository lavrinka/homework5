package org.example;

@SuppressWarnings("all")
public class Main {

  public static void main(String[] args) {
    SomeCustomClass someCustomClass = new SomeCustomClass();
    someCustomClass.doSwitch(3);
    someCustomClass.doWait();
    someCustomClass.doWaitAgain();
    someCustomClass.useAnotherPublic();
    someCustomClass.createArrayList(3);
    someCustomClass.doReturnString("test");
    someCustomClass.doMethodWithCommentedOut("Test");
    someCustomClass.usePublicFinalField();
    someCustomClass.alwaysReturnTrue();


  }
}