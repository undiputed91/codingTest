package org.example.programmers.level0.마지막두원소;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        for(int i=0; i<num_list.length; i++){
            answer[i]=num_list[i];
        }
        int lastNum = num_list[num_list.length-1];
        int secondLastNum = num_list[num_list.length-2];
        if(lastNum>secondLastNum){
            answer[answer.length-1] = lastNum-secondLastNum;
        }else{
            answer[answer.length-1] = lastNum*2;
        }
        return answer;
    }

}
