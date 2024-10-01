package org.example.baekjoon.baek2588;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        int hundredNum = secondNum/100;
        int tenNum = (secondNum%100)/10;
        int oneNum = secondNum%10;

        System.out.println(firstNum*oneNum);
        System.out.println(firstNum*tenNum);
        System.out.println(firstNum*hundredNum);
        System.out.println(firstNum*secondNum);
    }

}


