package org.example;
// 풀긴 풀었따! 근데 왜 맞는지 모르겠는데? >> static a,b 가 밑에서 비교했을 때 a가 처음부터 젤 작으면 안되지않나 싶음.
/*
1. int형 1차원 배열을 매개변수로 전달 받아서 배열에 저장된 최댓값,최솟값을 찾아서 반환하는 메소드를
각각 다음의 형태로 정의하자
public static int minValue(int[] arr){}
public static int maxValue(int[] arr){}

단 반복문을 사용할때 minValue의 정의에서는 일반적인 for문을 사용하고 maxValue의 정의에서는
새로운 for(enhanced for문)을 사용하기로 하자
*/
public class Hw01 {
    public static void main(String[] args) {
        Value val = new Value();
        System.out.println("최솟값은 = " + val.minValue(val.arr));
        System.out.println("최댓값은 = " + val.maxValue(val.arr));
    }
}

class Value {
    int[] arr = {40,-20,10,7,50,12};
    static int a;                    //💛이거 아닌것 같은 부분!💛 >> a와 비교하는데 a를 그냥 큰 수로 잡음
    static int b;            // 범위로 두면 이상하진 않을듯

    public static int minValue(int[] arr) {     //최소값을 출력한다! >> 어떻게할까? 배열을 받고 두수 비교해서 작은거 출력
        for (int i = 0; i < arr.length; i++) {
            if (a <= arr[i]) {
                a = a;
            } else {
                a = arr[i];
            }
        }
        return a;
    }

    public static int maxValue(int[] arr) {
        for (int j : arr) {
            if (j <= b) {
                b = b;
            } else {
                b = j;
            }
        }
        return b;
    }
}