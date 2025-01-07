package com.belajarJava;

public class DemoContinue {
    public static void main(String[] args) {
      int mobilNum = 0;
      int sumMobil = 0;
  
      while (mobilNum < 5) {
        mobilNum++;
        if (mobilNum == 2) {
          continue;
        }
        sumMobil++;
      }
  
      System.out.println("Total Mobil = " + sumMobil);
    }
  }