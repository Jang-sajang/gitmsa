package ex02;

public class Ex03 {
	
	public static void main(String[] args) {
		
		short a = 11;
		short b = 22;
		// = 뒤에 변수형 지정이 없으면 int로 계산한다
		// 그래서 long float double을 계산할때 선언을 해주는 듯
		
		short c = (short) (a+b);
		System.out.println(c);
	}

}
