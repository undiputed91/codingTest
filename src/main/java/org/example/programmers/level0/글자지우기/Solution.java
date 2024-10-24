package org.example.programmers.level0.글자지우기;

import java.util.ArrayList;

public class Solution {
    public String solution(String my_string, int[] indices) {
    String answer = "";
    char[]charArray = my_string.toCharArray();
    ArrayList<Integer> list = new ArrayList<>();
    for(int nums : indices){
        list.add(nums);
    }
    for(int i=0; i<charArray.length; i++){
        if(!list.contains(i)){
            answer += String.valueOf(charArray[i]);
        }
    }
    return answer;
   }
}
//배열에는 contains() 함수가 없음
//배열에서 특정값이 존재하는지 확인하는 방법
//1) for문 사용
//2) 컬렉션으로 변환 후 contains 메서드 사용
//3) 스트림 사용

//1)for문 예시
//         for (int i = 0; i < my_string.length(); i++) {
//            boolean toRemove = false;
//
//            // indices 배열을 순회하면서 i가 지워야 할 인덱스인지 확인
//            for (int j = 0; j < indices.length; j++) {
//                if (i == indices[j]) {
//                    toRemove = true;  // 제거할 인덱스면 플래그를 true로 설정
//                    break;  // 더 이상 확인할 필요가 없으므로 break (첫번째 for문으로 되돌아감)
//                }
//            }
//
//            // 제거할 인덱스가 아닌 경우만 answer에 추가
//            if (!toRemove) {
//                answer+= String.valueOf(my_string.charAt(i));
//            }
//        }

//2) Arrays.asList(array)
// array가 String[], Integer같은 참조형 배열일 때 (int[], char[]는 못함) List(컬렉션)으로 변환하는 메서드
// List와 ArrayList 차이
// 둘 다 배열 형태지만 List는 배열과 동일하게 길이 고정이지만 ArrayList는 가변길이로 add를 통해 추가할 수 있다.
// List는 배열과 다르게 관련 메서드 사용가능 (contains())

//3)스트림 사용
//if(!list.contains(i)) 결국 이 부분을 어떻게 boolean 타입으로 구성하는가가 핵심
//boolean found = Arrays.stream(arr).anyMatch(index -> index == i); 같은 느낌...
// anyMatch -> stream의 각 요소 index를 i와 비교 후 true로 반환
