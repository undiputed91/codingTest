package org.example.programmers.level0.수조작하기1;

class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] charArray = control.toCharArray();
        for(int i=0; i<charArray.length;i++){
            if(charArray[i]=='w'){
                n++;
            }else if(charArray[i]=='s'){
                n--;
            }else if(charArray[i]=='d'){
                n+=10;
            }else if(charArray[i]=='a'){
                n-=10;
            }
        }
        answer = n;
        return answer;
    }
}