package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
    Solution so = new Solution();
        System.out.println(so.solution("asdh"));
    }
}

class Solution {
    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("김서방")){
                return "김서방은 "+i+"에 있다";
            }
        }

    }
}

