package org.example.programmers.level0.접미사배열;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        ArrayList<String> list = new ArrayList<>();
        for(int i =my_string.length()-1; i>=0; i--){
            String str = my_string.substring(i,my_string.length());
            list.add(str);
        }
        for(int j=0; j<list.size(); j++){
            answer[j] = list.get(j);
        }
        Arrays.sort(answer);
        return answer;
    }

}
