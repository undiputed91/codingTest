package org.example.baekjoon.baek10818;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] intArr = new int[N];
        for (int i = 0; i < intArr.length; i++) {
            int num = sc.nextInt();
            intArr[i] = num;
        }
        int maxNum = intArr[0];
        int minNum = intArr[0];
        for (int num : intArr) {
            if (maxNum < num) {
                maxNum = num;
            }
        }
        for (int num : intArr) {
            if (minNum > num) {
                minNum = num;
            }
        }
        System.out.println(minNum + " " + maxNum);
    }

}
//반복문 통합 가능
//         for (int i = 1; i < N; i++) {
//            intArr[i] = sc.nextInt();
//            if (intArr[i] < minNum) minNum = intArr[i];
//            if (intArr[i] > maxNum) maxNum = intArr[i];
//        }