package org.example.baekjoon.Baek2557;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main_bw {
    //Buffered writer 사용하기
    //vs println
    public static void main(String[] args) throws IOException {
        //데이터를 하나씩 전송하는게 아니라 버퍼라는 임시 공간에 모아두었다가 한번에 전송(더 빠른 속도)
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write("Hello World!"); //입력 줄바꿈 없어서 \n, .newline 입력 필요
        bufferedWriter.flush(); //출력
        bufferedWriter.close(); // 사용한 버퍼 닫아주기 (데이터 남아 있어서 제거 해줘야함)
    }

}
