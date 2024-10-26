package org.example.baekjoon.baek11021;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for(int i =1; i<=t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            //StringTokenizer는 util 라이브러리에 있음

            int firstNum = Integer.parseInt(st.nextToken());
            int secondNum = Integer.parseInt(st.nextToken());

            bw.write("Case #"+i+": "+(firstNum+secondNum)+"\n");
            //문자열이랑 섞이니까 미리 더해주고 문자열과 결합
        }
        bw.flush();

        br.close();
        bw.close();
    }
}



