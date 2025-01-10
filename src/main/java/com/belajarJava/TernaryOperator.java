package com.belajarJava;

public class TernaryOperator {
    public static void main(String[] args) {
    //     int myValueSQA = -1;
    //     int standardCompanyQA = 6;

    //     int salary = (myValueSQA > standardCompanyQA) ? 10000000 :
    //             (myValueSQA > 0) ? 50000000 : 0;
    //     System.out.println(salary);
    // }

    int total = 0;
    for (int i = 1; i <= 5; i++) {
        if ((i % 2) == 0) {
            total += 10;
        } else {
            total -= 5;
        }
    }
    System.out.println(total);
}
}