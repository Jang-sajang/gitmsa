import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.lang.Math.PI;

class AA{
    public static BB bb = new BB();
}
class BB{
    public void doA(){
        System.out.println("BB doA"); // System 변수 안에 out 안에 println함수가 있을것
    }
}

public class Ex07 {
    public static void main(String[] args) {
//        AA.bb.doA();
        System.out.println(PI);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }
}
