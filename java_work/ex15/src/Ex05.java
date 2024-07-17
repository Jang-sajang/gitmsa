public class Ex05 {
    public static void main(String[] args) {

        String str1 = "new String";
        String str2 = "new String";

        System.out.println(str1==str2);

        String str3 = new String("new String");
        String str4 = new String("new String");  // 새로운 new String을 만듦. 결국 가르키는게 달라서 false

        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));      // 값이 같을 시 비교하는 메소드
        
    }
}
