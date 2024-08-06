package io.study.algorithms.level_1;

import java.util.ArrayList;
import java.util.List;

// TODO '에라토스테네스의 체'를 이용한 풀이
public class 나머지가_1이_되는_수_찾기 {
    private static final int STARTING_RANGE = 3;
    private static final int DIVISOR_CONDITION = 1;

    public int solution(int n) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = STARTING_RANGE; i < n; i++) {
            if (n % i == DIVISOR_CONDITION) {
                divisors.add(i);
            }
        }

        return divisors.stream()
            .mapToInt(Integer::intValue)
            .min()
            .orElseThrow();
    }
}
