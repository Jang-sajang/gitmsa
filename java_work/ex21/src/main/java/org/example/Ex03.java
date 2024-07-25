package org.example;
//copyOf
//copyOfRange 실습

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int[] copynum1 = Arrays.copyOf(num,2);
        int[] copynum2 = Arrays.copyOfRange(num,2,4);

        System.out.println(num);
        System.out.println(copynum1);
        System.out.println(copynum2);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(copynum1));
        System.out.println(Arrays.toString(copynum2));
    }
}
