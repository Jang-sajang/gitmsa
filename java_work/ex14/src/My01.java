//배열 복사 연습
//후에 정렬 연습해보기

import java.util.Arrays;

public class My01 {
    public static void main(String[] args) {
        int[] arr1 = {};        //사이즈, 값이 없는 배열
        int[] arr2 = new int[5];  // 사이즈는 있찌만 값이 없는 배열
        int[] arr3 = {1,2,3,4,5}; // 값이 있는 배열! + 사이즈는 자동 지정(5개)
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr3[4]);
        arr2[0] = 1;
//        arr1[1] = 10;   // arr1은 사이즈, 값이 없어서 값을 지정하지 못한다
        System.out.println(arr2[0]);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
