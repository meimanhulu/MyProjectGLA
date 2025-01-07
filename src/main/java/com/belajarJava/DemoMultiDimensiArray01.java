package com.belajarJava;

public class DemoMultiDimensiArray01 {
    public static void main(String[] args) {
      int[][] myNumber = {
          // 0 1 2 3
          { 1, 2, 3, 4 }, // index 0
          // 0 1 2
          { 5, 6, 7 } // index 1
      };
  
      int myLapak = myNumber[1][0];
      System.out.println("Lapak parkir = " + myLapak);
    }
  }