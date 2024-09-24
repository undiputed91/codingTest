package org.example.programmers.level0.이어붙인수;

public class Solution {
    int solution(int[] num_list) {
    int answer = 0;
    String evenChanger ="";
    String oddChanger ="";
    for(int i =0; i< num_list.length; i++){
        if(num_list[i]%2 == 0){
            evenChanger += num_list[i];
            }
        else{
            oddChanger += num_list[i];
        }
    }
    answer = Integer.parseInt(evenChanger)+Integer.parseInt(oddChanger);
    return answer;
}

}
