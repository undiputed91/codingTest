package org.example.baekjoon.baek2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int alarm = minute-45;

        if(alarm<0){
            alarm = 60+alarm;
            hour--;
            if(hour<0){
                hour = 23;
            }
        }
        System.out.println(hour);
        System.out.println(alarm);
    }

}
