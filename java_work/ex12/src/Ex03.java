public class Ex03 {
    public static void main(String[] args) {

        int[] num = {1,2,3};                //바로 크기와 값을 지정
        int[] num2 =  new int[]{1,2,3};     //크기, 값 지정

        int[] num3 = new int[3];            // 선언 후 하나씩 지정
        num3[0] = 1;                  // 한번에 지정하는 법은 안된다.
        num3[1] = 2;
        num3[2] = 3;

        System.out.println(num2[2]);
    }
}
