package com.belajarJava;

public class DemoDoWhile {
    public static void main(String[] args) {
  
      int y = 0;
      do {
        System.out.println(y);
        y++;
      } while (y == 2);
  
      while (y == 2) {
        System.out.println(y);
        y++;
      }
    }
  }