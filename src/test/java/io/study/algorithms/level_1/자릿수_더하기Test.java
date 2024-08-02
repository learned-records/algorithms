package io.study.algorithms.level_1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("자릿수_더하기")
class 자릿수_더하기Test {
    @ParameterizedTest
    @MethodSource
    void solution(int given, int expected) {
        // When
        int actual = new 자릿수_더하기().solution(given);

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(123, 6),
            Arguments.of(987, 24)
        );
    }
}
