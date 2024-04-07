package org.example.programmers.level0.특수문출력하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String answer = "!@#$%^&*(\\'\"<>?:;";
        //다른 특수문자들은 그대로 입력해도 되는데, \ 와 " 앞에는 \를 붙여서 입력한 문자 그대로 출력되도록 해야 한다.
        System.out.println(answer);
    }
}
