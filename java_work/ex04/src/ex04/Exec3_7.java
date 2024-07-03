package ex04;

//아래는 화씨F를 섭씨C로 변환하는 코드이다 변환공식'C=(F-32)/1.8'. 단,결과값은 셋째자리에서 반올림(형변환)

class Exec3_7{
	public static void main(String[] args) {
		int F = 100;
		float C = (F-32)/1.8f;
		System.out.println("F = " + F);
		System.out.println("C = " + Math.round(C*100)/100.0);
		
//		Math.round(숫자)  -> 반올림
//		Math.ceil(숫자)     -> 올림
//		Math.floor(숫자)    -> 내림
//		둘째 자리면 (숫자 * 10) / 10.0
//		셋째 자리면 (숫자 * 100) / 100.0
	}
}
