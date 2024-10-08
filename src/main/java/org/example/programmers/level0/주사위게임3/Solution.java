package org.example.programmers.level0.주사위게임3;

import java.util.Arrays;

public class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] array = {a, b, c, d};
        Arrays.sort(array);
        if(array[0]==array[3]){
            answer = array[0]*1111;
        }else if(array[0]==array[2]){
            answer = (int)Math.pow(10*array[0]+array[3],2);
        }else if(array[1]==array[3]){
            answer = (int)Math.pow(10*array[1]+array[0],2);
        }else if(array[0]==array[1]&&array[2]==array[3]){
            answer = (array[0]+array[2])*Math.abs(array[0]-array[2]);
        }else if(array[0]==array[1] || array[1]== array[2] || array[2]==array[3]){
            if(array[0]==array[1]){
                answer = array[2]*array[3];
            }else if(array[1]== array[2]){
                answer = array[0]*array[3];
            }else{
                answer = array[0]*array[1];
            }
        }else{
            answer =array[0];
        }
        return answer;
    }
}

//Math.pow(대상,몇 제곱) ->double 타입 반환
//Math.abs() 절대값
