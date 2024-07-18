package org.example;
/*
3. 다음 형태로 표현된 2차원 배열이 존재한다고 가정해보자
1   2    3   //1행
4   5    6   //2행
7   8    9   //3행
이러한 형태를 갖는 int형 2차원 배열이 인자로 전달되면, 다음의 형태로 배열의 구조를 변경시키는 메소드를 정의하자
7   8    9   //1행
1   2    3   //2행
4   5    6   //3행
물론 배열의 가로와 세로길이에 상관없이 위와 같이 동작하도록 메소드를 정의해야 한다.
 */
import java.util.Arrays;

public class Hw03 {

    public static void main(String[] args) {
        //메인에서 필요한 배열 상속시키기


        ArrSwitch as = new ArrSwitch();
        as.arr3to1();
    }
}

class ArrSwitch extends Hw03{
    public void arr3to1(){
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));

    }
}