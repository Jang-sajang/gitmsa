package ex06;

//3. 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을때, 
//몇까지 더해야 총합이 100이상이 되는지 구하시오

public class Hex3 {
	public static void main(String[] args) {
		int num = 0; 
		int sum = 0;
		
		while(sum<=100) {
			if(num%2==0){
			sum = num;
			System.out.println("num = " + num);
			num = -(num +1);
		}else if(num%2!=0){
			sum = num;
			System.out.println("("+num+")");
			num= -(num-1);
		} 
		}
		
	}
}