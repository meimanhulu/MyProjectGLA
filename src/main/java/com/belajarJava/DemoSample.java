package com.belajarJava;

import java.util.ArrayList;
import java.util.List;

public class DemoSample {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");

    // Menggunakan forEach dengan lambda expression untuk mencetak setiap nama
    names.forEach(name -> System.out.println("Hello, " + name + "!"));
  }
}
