package com.gm;

public class Stux {
  public static void main(String[] args){
    System.out.println("Hello gradle!");

    IMessage im = new MessageImpl();
    System.out.println(im.sayHello());
  }
}
