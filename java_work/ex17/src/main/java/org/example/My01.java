package org.example;

public class My01 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("hellow",3);
    }
}

class Solution {
    public String solution(String my_string, int n) {

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(my_string.charAt(i));
            }

        }
        String answer = "";
        return answer;
    }
}