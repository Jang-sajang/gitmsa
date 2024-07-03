package ex04;
//아래는 변수 num값 중에서 백의 자리 이하를 버리는 코드. ex 456 >> 400

class Exec3_4{

	public static void main(String[] args) {
		int num = 456;
		System.out.println( (int)(num/100)*100 );
	}
}