package org.example;

public class My01_I {
    public static void main(String[] args) {
Solution so = new Solution();
        System.out.println(so.solution("aaaa","bbbb"));
    }


}

class Solution {
    public String solution(String str1, String str2) {
        String a;
        String b;
        for (int i = 0; i < str1.length(); i++) {
            a = String.valueOf(str1.charAt(i));
            b = String.valueOf(str2.charAt(i));
        }
//        return ;
    }
}