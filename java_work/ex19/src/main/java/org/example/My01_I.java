package org.example;

import java.util.Locale;

public class My01_I {
    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.solution("aaa","bbb"));
    }


}

class Solution {
    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (i%2 ==0 || i==0){
                return new String[]{strArr[i].toLowerCase()};
            }
            if (i%2 !=0){
                return new String[]{strArr[i].toUpperCase()};
            }
        }
        return strArr;
    }
}