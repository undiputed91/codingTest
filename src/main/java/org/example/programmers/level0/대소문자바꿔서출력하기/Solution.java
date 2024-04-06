package org.example.programmers.level0.대소문자바꿔서출력하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        char[] charArr = a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(charArr[i])) {
                charArr[i] = Character.toLowerCase(charArr[i]);
            } else {
                charArr[i] = Character.toUpperCase(charArr[i]);
            }
            answer += charArr[i];
        }
        System.out.println(answer);
    }
}


