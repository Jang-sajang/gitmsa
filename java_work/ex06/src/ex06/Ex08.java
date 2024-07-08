package ex06;

public class Ex08 {

public static void main(String[] args) {
	doA(3);
	doB("안녕하세요");
	int result = doA(4);
	String temp = doB("안녕하세요");
	System.out.println(doA(3) + doB("ㅎㅇ"));
	System.out.println(result + temp);
}
public static int doA(int num) {
	return num * num;
}
	public static String doB(String str) {
		return str + str;
	}
	
}
