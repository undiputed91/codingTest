package org.example.programmers.level0.조건에맞게수열변환하기2;

import java.util.Arrays;

public class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr2;
        boolean flag = true;
        while(flag){
            arr2 = Arrays.copyOf(arr,arr.length);

            for(int i=0; i<arr.length; i++){
                if((arr[i]>=50)&&(arr[i]%2==0)){
                    arr[i]= arr[i]/2;
                }else if((arr[i]<50)&&(arr[i]%2!=0)){
                    arr[i] = arr[i]*2+1;
                }
            }
            if(Arrays.equals(arr, arr2)){
                flag =false;
            }else{
                answer++;
            }
        }
        return answer;
    }
}
//arr2에 현재 arr 복사
//arr을 변환
//변환된 arr과 이전 상태인 arr2를 비교 / 다를 시 count증가
