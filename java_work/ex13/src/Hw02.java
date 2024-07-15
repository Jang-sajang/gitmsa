import java.util.Arrays;

public class Hw02 {
    //    2. int[][] arr = {
//        { 5, 5, 5, 5, 5},
//        {10,10,10,10,10},
//        {20,20,20,20,20},
//        {30,30,30,30,30}
//    };
//    arr 배열을 총합과 평균을 구하는 프로그램을 작성하세요
    public static void main(String[] args) {
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}};

        int sum = 0; // 총합 0  선언
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("총합은 = " + sum);
        System.out.println("평균은 = " + (double)sum/(arr.length*arr[0].length));
    }
}
