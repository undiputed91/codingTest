package org.example.programmers.level0.길이에따른연산;

import java.util.Arrays;

public class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length>=11){
            answer = Arrays.stream(num_list).sum();
        }else{
            answer = Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
        }
        return answer;
    }
}

//int[] 스트림 사용
//Arrays.stream(int[]) ->IntStream 반환 (DoubleStream, LongStream 등 존재) 참조형 배열일 때 Stream<T> 반환

//List<Integer> 스트림 사용
//list.stream()        ->Stream<Integer> 반환

//reduce()
//종료 연산 하나의 값으로 결합,축(초기값, 람다식)
//reduce(1, (a, b) -> a * b);
//초기값은 해당 배열에 없는 그냥 연산을 처음 시작하는 값 a에 넣고 시작
//배열[i]를 하나씩 b에 넣게됨
//람다식의 연산값을 다시 a에 넣으면서 점점 줄여 나감
