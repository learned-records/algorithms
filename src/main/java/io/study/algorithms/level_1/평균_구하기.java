package io.study.algorithms.level_1;

import java.util.Arrays;

public class 평균_구하기 {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElseThrow();
    }
}
