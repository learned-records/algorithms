package io.study.algorithms.level_1;

public class x만큼_간격이_있는_n개의_숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num;
            num = num + x;
        }

        return answer;
    }
}
