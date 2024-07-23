package org.example;

import org.example.inter.Printable;
import org.example.print.LGPrinter;
import org.example.print.SamPrinter;

public class Main {
    public static void main(String[] args) {
        System.out.println(Printable.HEIGHT);
        System.out.println(Printable.WIDTH);

        Printable prn = new LGPrinter();
        prn.print("my document");

        prn = new SamPrinter();
        prn.print("my doucument");
        //final 예약어 붙어 있어서 값의 변경이 불가능하다

    }
}