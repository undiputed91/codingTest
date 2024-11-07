package org.example.programmers.level0.n개간격의원소들;

import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<num_list.length; i+=n){
            list.add(num_list[i]);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]= list.get(i);
        }
        return answer;
    }

}
//for 문 3번째는 다음 i 정의 i++ 만 사용할 생각 버리기 i+=n

//다른 사람 풀이
//사이즈 계산을 3항연산자로 풀이
//int N = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;
//if(num_list.length%n == 0){
//            cnt = num_list.length%n;
//        }else {
//            cnt = num_list.length%n+1;
//        }
//로 접근했었는데 쉽게 표현 가능
