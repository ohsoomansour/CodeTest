package com.codetest.exc;

import java.util.ArrayList;
import java.util.Arrays;


/**
 *  TODO : 시간 복잡도 O(N) ?
 * */
public class BruteForceSearch04 {
  public static int[] solution(int[] answers){
      // 1. '패턴'을 찾자
      int[][] pattern = {
              {1, 2, 3, 4, 5},
              {2, 1, 2, 3, 2, 4, 2, 5},
              {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
      };
      int[] scores = new int[3];
      // 로직 : answers 와 패턴을 비교해서 같으면 scores에 넣는다.
      for(int i = 0; i < answers.length; i++){
          for(int j = 0; j < pattern.length; j++){
              // % : 나머지 계산 응용 -> 패턴을 순회할 수 있도록 작성
              if(answers[i] == pattern[j][i % pattern[j].length]){
                scores[j]++;
              }
          }
      }
      // 가장 높은 점수의 수포자들 점수를 담는다.
      int maxScore = Arrays.stream(scores).max().getAsInt();
      // max 점수가 2명 이상일 경우
      ArrayList<Integer> answer = new ArrayList<>();
      for(int i = 0; i < scores.length; i++){
          if(scores[i] == maxScore){
            answer.add(i + 1);
          }
      }
      return answer.stream().mapToInt(Integer::intValue).toArray();
  }
}
