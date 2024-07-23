package org.example;

import org.example.inter.CMYKPrintable;
import org.example.inter.Printable;
import org.example.print.CMYKPrinter;

public class Ex01 {
    public static void main(String[] args) {
        //2 변수 WIDTH, HEIGHT
        //2 method print(), cmykprint();
        System.out.println(Printable.HEIGHT);
        System.out.println(CMYKPrintable.HEIGHT);
        System.out.println(CMYKPrintable.WIDTH);

        CMYKPrintable prn = new CMYKPrinter();
        prn.print("old-printer");
        prn.printCMYK("my document");

        prn.clean();
        Printable.printLine();

    }
}
