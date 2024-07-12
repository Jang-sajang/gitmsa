public class Ex05 {

    public static void main(String[] args) {

        String str = "a1b1c1";
                String[] tempstr = str.split("1");  //1을 기준으로 문자를 짤라서 출력
            str.split("1");
        for (int i = 0; i < tempstr.length; i++) {
            System.out.println(tempstr[i]);
        }
        String a = "abcdefghij";
        System.out.println(a.length());

        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));
        System.out.println(a.charAt(3));
       // System.out.println(a.charAt(4));  >> 오류
        System.out.println(a.substring(2)); // 두번째 부터 짤라서 나옴
        System.out.println(a.substring(2,5)); // 두번째 부터 짤라서 나옴
        System.out.println(a.toUpperCase()); // 두번째 부터 짤라서 나옴
        System.out.println("cd를 포함하냐 = " + a.contains("cd"));

        //
        System.out.println("배열출력시작");
        char[] test = a.toCharArray();
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
        System.out.println("배열출력끝");

        test[2] = 'A';
        String testStr = new String(test);
        System.out.println(testStr);

        int[] b = new int[3];
        System.out.println(b.length);
        //oracle??
    }
}
