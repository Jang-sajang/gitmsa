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
    int sum = 0;
    public int solution(String message) {
           sum = message.length()*2;



        return sum;
    }
}

