package io.study.algorithms.level_1;

public class 짝수와_홀수 {
    public String solution(int num) {
        String answer = "Odd";
        if(num % 2 == 0) {
            return "Even";
        }
        return answer;
    }
}
