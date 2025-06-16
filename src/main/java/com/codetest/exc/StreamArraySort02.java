package com.codetest.exc;


import java.util.Arrays;
import java.util.Collections;

/** 코딩테스트 합격자 되기 p.109-02문제
 * #Stream.toArray(IntFunction<A[]>)의 이해
 *  toArray(Integer[]::new) 는 메서드 method reference 문법
 *          > '배열 생성자 참조' : "Integer 타입의 배열을 stream 크기에 맞게 생성해 달라"
 *    -> Integer[]::new 이 조건을 만족하는 '함수형 interface로 자동 변환'
 *      *IntFuntion<A[]> generator (=함수형 interface)
 *     -> toArray(size -> new Integer[size])
 *       -> size는 어디서 계산? "distinct()까지 처리된 스트림에서 요소의 개수를 내부적으로 셈"
 *
 * #mapToInt의 이해
 *  -> Integer[] 를 int[]로 변경
 *    -> Stream<Integer>.(x -> x.intValue());
 * */



public class StreamArraySort02 {
    public static int[] solution(int[] arr){
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder()); // 내림차순 정렬
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }
 }
