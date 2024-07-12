class Box{
    String conts;

    public Box(String conts) {
        this.conts = conts;
    }

    @Override
    public String toString() {
        return "Box{" +"conts='" + conts + '\'' +'}';
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Box[] boxs = new Box[5];
        boxs [0] = new Box("사과");
//        System.out.println(boxs[0]);
//        System.out.println(boxs[1]);
//        System.out.println(boxs[2]);
//        System.out.println(boxs[3]); 이것을 반복문으로 바꾸면!
        for(int i = 0; i < boxs.length; i++) {
            System.out.println(boxs[i]);
        }
    }
}
