public class Aa {
    //ctrl + e 최근 파일 찾기
    //shift + shift 파일 찾기
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; sum<=100 ; i++) {
            System.out.println("i = " + i);

            if (i % 2 == 0){
                sum = sum - i;
            }else {
                sum = sum + i;
            }
            System.out.println("중간sum = "+sum);
        }
        System.out.println(sum);
    }
}
