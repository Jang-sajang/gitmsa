import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        String arr[] = {"aa", "bb", "cc"};
        System.out.println(arr);  // 이것과
        System.out.println(Arrays.toString(arr)); // 이것의 차이
    }
}
