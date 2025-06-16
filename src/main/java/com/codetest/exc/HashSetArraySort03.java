package com.codetest.exc;

import java.util.HashSet;

/**
 *  문제: 서로 다른 인덱스에 있는 2개의 수를 뽑아서 가능한 모든 경우의 수
 *  int[] inputArr1 = {2, 1, 3, 4, 1}; // 결과 값: [2, 3, 4, 5, 6, 7]
 *  int[] inputArr2 = {5, 0, 2, 7}; // 결과 값 : [2, 5, 7, 9, 12]
 *  [우선 경우의 수 나열] - "0번째 - 2번째까지만 반복 그래서 inputArr2.length - 1 "
 *  -> 5+0 -> 5+2 -> 5+7
 *  -> 0+2 -> 0+7
 *  -> 2+7
 * */
public class HashSetArraySort03 {


    public static int[] Solution(int[]  arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i <  arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                set.add(arr[i] + arr[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
