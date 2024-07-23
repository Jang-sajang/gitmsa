package org.example.print;

import org.example.inter.CMYKPrintable;

public class CMYKPrinter implements CMYKPrintable {

    @Override
    public void printCMYK(String doc) {     // CMYKPrintable 재정의
        System.out.println("color printing~");
        System.out.println(doc);
    }

    @Override
    public void print(String mydoc) {       //PRintable 재정의 (상속받음)
        System.out.println("Black-White~");
        System.out.println(mydoc);
    }
}
