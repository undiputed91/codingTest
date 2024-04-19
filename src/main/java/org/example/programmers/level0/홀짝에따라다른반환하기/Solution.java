package org.example.programmers.level0.홀짝에따라다른반환하기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%2 == 1){
            for (int i=0; i<=n; i++){
                if(i%2 == 1){
                    answer += i;
                }
            }
        }else {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    answer += i * i;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int answer = solution.solution(10);
        System.out.println(answer);
    }
}
