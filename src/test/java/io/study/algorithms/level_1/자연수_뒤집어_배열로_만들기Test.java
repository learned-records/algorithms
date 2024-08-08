package io.study.algorithms.level_1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("자연수_뒤집어_배열로_만들기")
class 자연수_뒤집어_배열로_만들기Test {
    @ParameterizedTest
    @MethodSource
    void solution(long given, int[] expected) {
        // When
        int[] actual = new 자연수_뒤집어_배열로_만들기().solution(given);

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(12345, new int[]{5, 4, 3, 2, 1})
        );
    }
}
