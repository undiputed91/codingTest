package org.example.programmers.level0.왼쪽오른쪽;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String[] solution(String[] str_list) {
        String[] answer;
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                answer = Arrays.copyOfRange(str_list,0,i);
                return answer;
            }else if(str_list[i].equals("r")){
                answer = Arrays.copyOfRange(str_list,i+1,str_list.length);
                return answer;
            }
        }
        answer = new String[]{};
        return answer;
    }

}
