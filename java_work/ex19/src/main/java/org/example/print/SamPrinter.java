package org.example.print;

import org.example.inter.Printable;

public class SamPrinter implements Printable {
    @Override
    public void print(String mydoc) {
        System.out.println("SAMSUNG Printer");
        System.out.println(mydoc);
    }
}
