package org.example.programmers.level0.배열만들기2;

import java.util.ArrayList;

public class Solution {
    public int[] solution(int l, int r) {


        ArrayList<Integer> arr = new ArrayList<>();
        for(Integer i=l; i<=r; i++){
            String str = ""+i;

            boolean one = !str.contains("1");
            boolean two = !str.contains("2");
            boolean three = !str.contains("3");
            boolean four = !str.contains("4");
            boolean six = !str.contains("6");
            boolean seven = !str.contains("7");
            boolean eight = !str.contains("8");
            boolean nine = !str.contains("9");
            //다른 사람의 풀이를 봤을 때 0과 5로만 구성된 것을 찾는데 binary서치를 사용-공부 필요

            if(one && two && three && four && six && seven && eight && nine ){
                arr.add(i);
            }
        }
        int[] answer;
        //블럭 안에서 선언 초기화(new) 하면 블럭 밖에서 사용 불가
        //초기화 내용을 if나 for 블럭안의 요소를 사용해야 한다면 블럭밖에서 선언하고 블럭안에서 초기화 하는 형태로 사용 가능
        if(arr.isEmpty()){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[arr.size()];
            for(int j=0; j<answer.length; j++){
                //컬렉션 안의 요소가 String이라면 컬렉션.toArray()로 바로 배열로 변경 가능 하지만 int일 경우 for문을 통해 하나씩 대입 필요
                answer[j]=Integer.valueOf(arr.get(j));
            }
        }
        return answer;
    }

}
