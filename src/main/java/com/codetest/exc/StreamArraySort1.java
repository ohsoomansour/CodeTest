package com.codetest.exc;


import lombok.extern.slf4j.Slf4j;
import java.util.Arrays;

/*조건: 배열의 길이 2이상, 각 배열의 데이터 값은 -100,000 이상 100,000 이하
  요구사항: 정수 배열을 받고, 배열의 중복 값을 제거, 배열은 '내림차순'
  예)
 * 입력 값 :  [4, 2, 2, 1, 3, 4]     [2, 1, 1, 3, 2, 5, 4]
 * 출력 값  : [4, 3, 2, 1]  			[5, 4, 3, 2, 1]
 * Arrays.stream(input1) : Stream<int>
   Stream<int>.boxed() : Stream<Integer>
  Integer[]::new는 **"길이에 맞는 Integer[] 배열을 생성하는 메서드 레퍼런스
* */

@Slf4j
public class StreamArraySort1 {

public static void solution() {
    //복제의 경우
    int[] input1 = {4, 2, 2, 1, 3, 4};
    Integer[] boxed1 = Arrays.stream(input1).boxed().distinct().toArray(Integer[]::new);
    Arrays.sort(boxed1, (a, b) -> b.compareTo(a));
    int[] input2 = {2, 1, 1, 3, 2, 5, 4};
    Integer[] boxed2 = Arrays.stream(input2).boxed().distinct().toArray(Integer[]::new);
    Arrays.sort(boxed2, (a, b) -> b.compareTo(a));

    log.info("input1={}", Arrays.toString(boxed1));
    log.info("input2={}", Arrays.toString(boxed2));
}
}
