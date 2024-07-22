package org.example;

import java.util.Arrays;

public class Hw03_t {

    public static void main(String[] args) {
        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
//3차원 배열 잘 안쓴다. 파이썬 영상처리할 때. 객체 찾을 때 쓴다
        int temp[] = arr[0];

        arr[0] = arr[2];
        arr[2] = temp;

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        System.out.println("temp");
        System.out.println(Arrays.toString(temp));
    }
}
