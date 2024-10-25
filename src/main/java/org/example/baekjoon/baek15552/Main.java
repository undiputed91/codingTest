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

//split을 사용하지 않고 StringTokenizer로 받을 수 있다.
//            for (int i = 0; i < n; i++) {
//            // 한 줄 입력받고 StringTokenizer로 토큰화
//            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//            int firstNum = Integer.parseInt(stringTokenizer.nextToken()); // 첫 번째 숫자
//            int secondNum = Integer.parseInt(stringTokenizer.nextToken()); // 두 번째 숫자
//
//            // 두 숫자의 합을 출력
//            bufferedWriter.write(firstNum + secondNum + "\n");
//        }

//bufferedwriter대신 Stringbuilder를 통해 더 빠른 성능을 보장할 수 있다.
//      StringBuilder sb = new StringBuilder();
//
//		for (int i = 0; i < N; i++) {
//			st = new StringTokenizer(br.readLine()," ");
//			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');
//		}
//		br.close();
//
//		System.out.println(sb);