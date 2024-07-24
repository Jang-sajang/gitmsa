//쌤이 풀어준 방법
// split 함수를 쓴다!
//정규표현식!
import java.util.Arrays;

public class Hw01_t {
    public static void main(String[] args) {
        String str = "Hello.java";
        String temp[] = str.split("\\.");

        System.out.println(temp[0]);
        System.out.println(temp[1]);

        str = "안녕하세요1특별히2준비한건없습니3다.";
        temp = str.split("\\d");
        System.out.println(Arrays.toString(temp));

        str = "안녕하세요1특별히2준비한건없습니3다.";
        temp = str.split("\\D");
        System.out.println(Arrays.toString(temp));


    }
}
