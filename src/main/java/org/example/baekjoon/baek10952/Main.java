package org.example.baekjoon.baek10952;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = 1;
        int b = 1;

        while(!(a==0 && b==0)){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }
            //while문 내부에서 a, b 값이 재 설정되기에 0과 0이 들어왔을 때 이미 while문이 시작함 따라서 0+0이 출력됨 -> 중간에 break을 통해 while문을 빠져나와야 함
            bw.write((a+b)+"\n");

        }
        bw.flush();
        br.close();
        bw.close();
    }

}
