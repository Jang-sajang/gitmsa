import java.util.Arrays;
public class Ex09 {

    public static void main(String[] args) {

        int ar[] = {1,2,3,4,5};

        //3 가지 출력법
        System.out.println(Arrays.toString(ar)); //1 : 함수사용! 괄호안에 나옴 [ 1,2,3,4,5]

        for (int i = 0; i < ar.length; i++) { // 기존 반복문
            System.out.println(ar[i]);
        }
        System.out.println(    );

        for (int e:ar){                         // 향상된 반복문
            System.out.println(e);
        }
        String str[] = {"aa","bb","cc"};       //String 타입 반복문

        for (String temp :str){
            System.out.println(temp);
        }
    }
}
