package io.study.algorithms.level_1;

public class 자연수_뒤집어_배열로_만들기 {
    public int[] solution(long n) {
        char[] longToCharArr = String.valueOf(n).toCharArray();
        int[] answer = new int[longToCharArr.length];

        for (int i = 1; i <= longToCharArr.length; i++) {
            int revIdx = longToCharArr.length - i;
            int idx = i - 1;
            answer[idx] = Character.getNumericValue(longToCharArr[revIdx]);
        }
        return answer;
    }
}
