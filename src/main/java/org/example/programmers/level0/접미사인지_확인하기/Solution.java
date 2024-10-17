package org.example.programmers.level0.접미사인지_확인하기;

public class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int strIndex = my_string.length()-1;
        int suffixIndex = is_suffix.length()-1;

        char strEnd = my_string.charAt(strIndex);
        char suffixEnd = is_suffix.charAt(suffixIndex);

        if(my_string.contains(is_suffix) && (strEnd==suffixEnd)){
            //String끼리는 equals()메서드로 비교하지만 char는 그냥 ==로만 비교(String은 주소값이어서)
            answer = 1;
        }
        return answer;
    }
//my_string.endsWith(is_suffix) 접미사인지 확인하는 메서드가 있었다
}
