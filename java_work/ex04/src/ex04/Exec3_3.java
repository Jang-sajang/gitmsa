package ex04;
//아래는 변수 num의 값에 따라 양수 음수 0을 출력하는 코드이다. 삼항 연산자를 이용해서 코드를 넣으셈

class Exec3_3{
	public static void main(String[] args) {
			int num=10;
			System.out.println( num<0 ? "음수" : (num==0 ? "0" : "양수") );
	}
}