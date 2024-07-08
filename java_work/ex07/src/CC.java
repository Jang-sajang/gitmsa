public class CC {

    //매개변수가 없는 메소드
    public static int add(){
        System.out.println("기본 add");
        return 10;
    }
    //매개변수가 하나인 메소드
    public static int add(int num){
        System.out.println(" add");
        return 10;
    }


    public static void main(String[] args) {
        int result = add();

        System.out.println("result = "+add());
        System.out.println("result = "+add(5));

        // print( add() );도 되고 print(result); 도 된다.
        //앞에건 바로 쓰는거고 / 뒤에건 선언 후 쓰는것
    }
}
