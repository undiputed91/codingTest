package org.example.baekjoon.baek2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
        String space = " ".repeat(n-i);
        String star = "*".repeat(i);

        System.out.println(space+star);
    }
}

}
