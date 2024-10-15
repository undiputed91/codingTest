package org.example.baekjoon.baek25314;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int length = N/4;
        for(int i =0; i < length; i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }

}
