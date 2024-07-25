import friend.Friend;
import friend.UniFriend;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int cnt = 0;
        Friend friend[] = new Friend[10];

        friend[cnt++] = new UniFriend("홍길동", "010-1234-1567","컴퓨터");
        friend[cnt++] = new UniFriend("회사친구", "전화번호","개발팀");

        System.out.println(Arrays.toString(friend));

        for (int i = 0; i < cnt; i++) {
            friend[i].showInfo();
            System.out.println();

        }
    }
}