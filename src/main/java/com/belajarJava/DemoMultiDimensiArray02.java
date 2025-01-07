package com.belajarJava;

public class DemoMultiDimensiArray02 {
    public static void main(String[] args) {
      int[][] myNumber = {
          // 0 1 2 3
          { 1, 2, 3, 4 }, // index 0
          // 0 1 2
          { 5, 6, 7 } // index 1
      };
  
      int[] temp = new int[7];
  
      for (int i = 0; i < myNumber.length; ++i) {
        for (int j = 0; j < myNumber[i].length; ++j) {
          temp[myNumber[i][j] - 1] = myNumber[i][j];
        }
      }
  
      for (int x : temp) {
        System.out.println(x);
      }
    }
  }
  