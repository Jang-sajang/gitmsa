public class Ex04 {

    //재귀함수 = 자기자신의 함수를 호출하는 것
    public static int fact(int num) {
        if (num > 0) {
            return num * fact(num - 1);
        } else {
            return 1;
        }

    }


    public static void main(String[] args) {
        int result = fact(5);
        System.out.println(result);
//        String[] strary = {"aa","bb","cc"};
//        System.out.println("배열선언함");
//        main(strary);

        ;
    }
}
