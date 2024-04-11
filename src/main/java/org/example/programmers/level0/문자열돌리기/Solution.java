package org.example.programmers.level0.문자열돌리기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] charArr = a.toCharArray();
        for(int i=0; i<a.length(); i++){
            System.out.println(charArr[i]);
        }
    }
}
