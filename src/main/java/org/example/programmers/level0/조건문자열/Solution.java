package org.example.programmers.level0.조건문자열;

class Solution {
    // eq.equals 를 eq == 으로 사용 안한 이유
    // eq.equals는 말 그대로 ">" 값을 비교하지만 eq == 사용시 뒤의 문자열 참조변수 주소값과 비교하기에 다른 값이 나옴 비교는 제발 equals()로!!
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals(">")){
            if(eq.equals("=")){
                answer = n>=m ? 1 : 0;
            } else if(eq.equals("!")){
                answer = n>m ? 1 : 0;
            }
        }else if(ineq.equals("<")){
            if(eq.equals("=")){
                answer = n<=m ? 1 : 0;
            }else if(eq.equals("!")){
                answer = n<m ? 1 : 0;
            }
        }
        return answer;
    }
}
