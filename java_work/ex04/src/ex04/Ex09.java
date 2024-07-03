package ex04;
//아래 코드는 사과를 담는데 필요한 바구니의 수를 구하는 코드이다. 만일 사과의 수가 123개이고
//하나의 바구니에는 10개의 사과를 담을 수 있다면 13개의 바구니가 필요할것이다. (1)에 맞는 코드를 넣으시오

public class Ex09 {
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBicket = 10;
		int numOfBucket = (numOfApples / sizeOfBicket) + (0 < numOfApples%sizeOfBicket ? 1 : 0);
		
		System.out.println("필요한 바구니의 수 :"+ numOfBucket);
		
	}
}









