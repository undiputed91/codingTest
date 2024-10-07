package org.example.programmers.level0.배열만들기4;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i =0;

        while(i < arr.length){
            if(stack.isEmpty()){
                stack.add(arr[i]);
                i++;
            }else if(!stack.isEmpty() && stack.peek()<arr[i]){
                stack.add(arr[i]);
                i++;
            }else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    break;
                }
            }
        }
        int[]stk = new int[stack.size()];
        for(int j=0;j<stk.length; j++){
            stk[j]=stack.get(j);
        }
        return stk;
    }
}

class Main{

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};

        Solution sol = new Solution();
        int[]answer = sol.solution(arr);
        System.out.println(Arrays.toString(answer));
    }
}

//public int[] solution(int[] arr) {
//        Stack<Integer> stack = new Stack<>();
//        int i=1;
//        stack.add(arr[0]);
//
//        while(i < arr.length){
//           if(stack.peek()<arr[i]){
//               stack.add(arr[i]);
//               i++;
//           }else {
//               stack.pop();
//           }
//        }
//        int[]stk = new int[stack.size()];
//        for(int j=0;j<stk.length; j++){
//            stk[j]=stack.get(j);
//        }
//
//        return stk;
//    }

// 최초에 제시되는 arr이 애초에 비어있는 채 제시되는 조건을 고려하지 않음
// stack의 peek과 pop 사용 전에 비어있는지 확인하지 않는다면 runtime error 발생
