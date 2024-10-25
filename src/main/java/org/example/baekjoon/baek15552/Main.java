package org.example.baekjoon.baek15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());

        for(int i=0;i<n;i++){
            String[] str = bufferedReader.readLine().split(" ");
            int firstNum = Integer.parseInt(str[0]);
            int secondNum = Integer.parseInt(str[1]);
            bufferedWriter.write(firstNum + secondNum+"\n");
            //write에 쓰는 값도 문자열이지만 "\n"을 넣어 문자열이 됨
            //prinln처럼 줄바꿈이 없어 \n 넣어야 줄바꿈
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

}
