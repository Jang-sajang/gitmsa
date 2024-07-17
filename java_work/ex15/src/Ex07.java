public class Ex07 {
    public static void main(String[] args) {
        //속도가 빠르다..
        //안녕하세요.. asdg 같은 짧은 문자는 속도 차이가 없다
        //그래서 String 사용하면 된다.
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        sb.append("asdg");
        sb.append("asdg");

        System.out.println(sb);

        sb.delete(0,2);
        System.out.println(sb);

        sb.replace(0,5,"zzz");
        System.out.println(sb);

        sb.append("qwer");
        sb.reverse();
        System.out.println(sb);
    }
}
