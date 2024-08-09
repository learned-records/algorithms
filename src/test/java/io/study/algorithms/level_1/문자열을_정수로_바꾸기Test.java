package io.study.algorithms.level_1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("문자열을 정수로 바꾸기")
class 문자열을_정수로_바꾸기Test {
    @ParameterizedTest
    @MethodSource
    void solution(String given, int expected) {
        // When
        int actual = new 문자열을_정수로_바꾸기().solution(given);

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of("1234", 1234),
            Arguments.of("-1234", -1234)
        );
    }
}
