import friend.ComFriend;
import friend.UniFriend;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int ucnt = 0;
        int ccnt = 0;
        UniFriend uniFriend[] = new UniFriend[10];
        ComFriend comFriend[] = new ComFriend[10];

        uniFriend[ucnt++] = new UniFriend("홍길동", "010-1234-5678", "한국문학");

        System.out.println(Arrays.toString(uniFriend));
        System.out.println(Arrays.toString(comFriend));

        for (int i = 0; i < ucnt; i++) {
            uniFriend[i].showInfo();
        }
        for (int i = 0; i < ccnt; i++) {
            comFriend[i].showInfo();
        }
    }
}
