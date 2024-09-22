package org.example.programmers.level0.주사위게임2;

public class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a==b && b==c){
            answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        }else if(a!=b && b!=c && c!=a){
            answer = a+b+c;
        }else {
            answer = (a+b+c)*(a*a+b*b+c*c);
        }
        return answer;
    }
}
// int sum = a + b + c;
// int sumSquares = a * a + b * b + c * c;으로 미리 변수 설정하고
//    int sumCubes = a * a * a + b * b * b + c * c * c;
//            return sum * sumSquares * sumCubes;
//        } else if (a != b && b != c && c != a) {
//            return sum;
//        } else {
//            return sum * sumSquares;
//        }
// 이런 식으로 요약 가능

