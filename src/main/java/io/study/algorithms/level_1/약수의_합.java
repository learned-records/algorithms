package io.study.algorithms.level_1;

import java.util.ArrayList;
import java.util.List;

public class 약수의_합 {
    public int solution(int n) {
        List<Integer> divisors = new ArrayList<>();

        getDivisors(n, divisors);

        return divisors.stream()
            .mapToInt(Integer::intValue)
            .sum();
    }

    private static void getDivisors(int n, List<Integer> divisors) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
    }
}
