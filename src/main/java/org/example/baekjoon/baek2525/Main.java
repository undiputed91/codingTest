package org.example.baekjoon.baek2525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        int workTime = sc.nextInt();

        String[] timeSplit = time.split(" ");
        int hour = Integer.parseInt(timeSplit[0]);
        int minute = Integer.parseInt(timeSplit[1]);

        minute = minute + workTime;
        hour = hour + minute/60;
        minute = minute%60;

        if(hour>=24){
            hour = hour-24;
        }
        System.out.println(hour + " " + minute);
    }

}
//String.parseInt()가 아니라 Integer.parseInt()
//입력값을 나누고 싶다면 String.split("구분할 것") 을 통해 String[]로 쪼개기 가능


