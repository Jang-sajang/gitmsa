class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        for (int i = 0; i < ; i++) {


        if(num%n ==0){
            answer = 1;
        } else if(num%n!=0) {
            continue;
        } else {answer=10;}
        }
        return answer;
    }
}


public class Ex02 {
    static Solution sol = new Solution();

    public static void main(String[] args) {
        System.out.println(sol.solution(98,2));
    }
}
