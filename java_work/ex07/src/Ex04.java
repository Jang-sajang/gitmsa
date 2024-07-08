
public class Ex04 {

    public static int dice(){
        double ran = (Math.random()*6)+1;
        int num = (int) ran;
        return num;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("주사위를 던집니다. 결과는! " + dice());
        }
    }
}
