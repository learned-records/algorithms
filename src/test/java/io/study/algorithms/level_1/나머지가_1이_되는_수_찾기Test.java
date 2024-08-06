package io.study.algorithms.level_1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("나머지가 1이 되는 수 찾기")
class 나머지가_1이_되는_수_찾기Test {
    @ParameterizedTest
    @MethodSource
    void solution(int given, int expected) {
        // When
        int actual = new 나머지가_1이_되는_수_찾기().solution(given);

        System.out.println(10 % 4);
        // Then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(10, 3),
            Arguments.of(12, 11)
        );
    }
}
