package org.example.baekjoon.baek10951;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);
        }
    }

}

// eof 처리
// end of file
// 입력에서 더이상 읽을 수 있는 데이터가 없을 때
// scanner는 더이상 읽을 수 있는 데이터가 없을 때 nextInt 같은 메서드는 null을 반환하는게 아니라 InputMismatchException 발생
// scanner는 hasNext(), hasNextInt() 같은 메서드로 다음 데이터가 있는지 true false 반환가능
// while문으로 처리
// bufferedReader는 main2에서
