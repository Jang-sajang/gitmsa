import aa.AAA; // 다른 패키지에 있으면 import 필요

public class ZZZ extends AAA {
    int zzz = 10;
    ZZZ(){
        System.out.println("여기에서 할꺼에요");
        System.out.println(zzz);
        System.out.println(aaa);
    }

    public static void main(String[] args) {
         new ZZZ();
    }
}
