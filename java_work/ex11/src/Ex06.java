public class Ex06 {
    public static void main(String[] args) {
        // String => char[]
        // char[] => String

        String str = "우리는 할 수 있다."; //문자열
        char[] chars = str.toCharArray(); //문자배열

        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);
        System.out.println(chars[3]);
        System.out.println(chars[4]);
        System.out.println(chars[5]);
        System.out.println(chars[6]);
        System.out.println(chars[10]);
        System.out.println('\n');

//      chars[4] = new String("잘 수");

//        String A = String.valueOf(chars[4]);
//        A = "잘수";


        String aa = new String(chars);
        System.out.println(aa);
    }
}
