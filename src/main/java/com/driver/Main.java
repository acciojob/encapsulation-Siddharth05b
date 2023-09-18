package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly obj = new RWOnly();
      //obj.name = 4;
      // since name has private access, its value cannot be directly set
      obj.setname("Siddharth");
      System.out.print(obj.getname());
  }
}