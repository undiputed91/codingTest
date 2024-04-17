package org.example.programmers.level0.더크게합치기;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = "" + a;
        String strB = "" + b;
//        String ab = strA + strB;
//        String ba = strB + strA; 그냥 통째로 넣자
        int abNum = Integer.parseInt(strA + strB);
        int baNum = Integer.parseInt(strB + strA);

        if(abNum>baNum){
            answer = abNum;
        } else if(abNum<baNum){
            answer = baNum;
        } else {
            answer = abNum;
        }
        return answer;
    }

    //너무 코드가 불필요하게 긴 것 같다.
    //Math.max(abNum,baNum) 으로 if문 해결가능

    public static void main(String[] args) {
        Solution solution = new Solution();
        int answer =solution.solution(58,4);
        System.out.println(answer);
    }
}
