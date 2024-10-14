package org.example.programmers.level0.배열만들기5;

import java.util.ArrayList;

public class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<intStrs.length; i++){
            String str = intStrs[i];
            String strPart = str.substring(s,s+l);
            int intStr = Integer.parseInt(strPart);

            if(intStr>k){
                list.add(intStr);
            }
        }
        answer = new int[list.size()];
        for(int j =0; j< answer.length; j++){
            answer[j]=list.get(j);
        }
        return answer;
    }

}
