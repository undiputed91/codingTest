package org.example.baekjoon.baek2480;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dice = sc.nextLine();
        String[] diceArray = dice.split(" ");
        int firstDice = Integer.parseInt(diceArray[0]);
        int secondDice = Integer.parseInt(diceArray[1]);
        int thirdDice = Integer.parseInt(diceArray[2]);

        if(firstDice == secondDice && secondDice ==thirdDice){
            System.out.println(10000+firstDice*1000);
        } else if ((firstDice != secondDice)&& (secondDice != thirdDice) &&(firstDice !=thirdDice)) {
            int temp = Math.max(firstDice,secondDice);
            temp = Math.max(temp,thirdDice);
            System.out.println(temp*100);
        } else{
            if(firstDice == secondDice){
                System.out.println(1000+firstDice*100);
            }else if(secondDice == thirdDice){
                System.out.println(1000+secondDice*100);
            }else {
                System.out.println(1000+firstDice*100);
            }
        }
    }
}

//같은 눈이 두개만 나오는 경우는
//    else if (firstDice == secondDice || firstDice == thirdDice) {
//
//    } else if (secondDice == thirdDice) {
//
//    } 로 더 간단히 표현가능

//    int temp = Math.max(firstDice,secondDice);
//    temp = Math.max(temp,thirdDice);
// 위 두 줄을 int temp = Math.max(firstDice,Math.max(secondDice,thirdDice))로 한 줄로 표현가능
