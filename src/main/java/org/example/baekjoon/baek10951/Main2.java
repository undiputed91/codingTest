package org.example.baekjoon.baek10951;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder stb = new StringBuilder();
        String input;

        while ((input = br.readLine()) != null) {
            st = new StringTokenizer(input, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt((st.nextToken()));

            stb.append(a + b).append("\n");

        }
        System.out.println(stb);
    }
}

// bufferedReader는 버퍼에 저장되어 있는 값이 없을 때 readLine()을 호출하면 null을 반환
// br.readLine() != null 로 예외 처리