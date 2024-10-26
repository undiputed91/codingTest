package org.example.programmers.level0.리스트자르기;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        if(n == 1){
            for(int i=0; i<b+1;i++){
                list.add(num_list[i]);
            }
        }else if(n == 2){
            for(int i=a; i<num_list.length;i++){
                list.add(num_list[i]);
            }
        }else if(n == 3){
            for(int i=a; i<=b;i++){
                list.add(num_list[i]);
            }
        }else{
            int i=a;
            while(i<=b){
                list.add(num_list[i]);
                i = i+c;
            }
        }
        int[] answer = new int[list.size()];
        for(int j=0;j<list.size();j++){
            answer[j]= list.get(j);
        }
        return answer;
    }
}
class Main{

    public static void main(String[] args) {
        int n = 3;
        int[] slicer = 	{1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(n,slicer,num_list)));
    }
}
