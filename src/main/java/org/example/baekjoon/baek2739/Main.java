package org.example.baekjoon.baek2739;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i = 1;
        while(i<10){
            System.out.println(num + " * " + i + " = " + num*i);
            i++;
        }
    }

}
