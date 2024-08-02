package io.study.algorithms.level_1;

import java.util.Arrays;
import java.util.stream.Stream;

public class 자릿수_더하기 {
    private static final String EMPTY = "";

    public int solution(int n) {
        return sumSingleDigits(n);
    }

    private int sumSingleDigits(int origin) {
        return Arrays.stream(Stream.of(splitToDigit(origin))
            .mapToInt(Integer::parseInt)
            .toArray()).sum();
    }

    private String[] splitToDigit(int origin) {
        return String.valueOf(origin)
            .split(EMPTY);
    }
}
