package io.study.algorithms.level_1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("약수의 합")
class 약수의_합Test {
    @ParameterizedTest
    @MethodSource
    void solution(final int given, final int expected) {
        // When
        int actual = new 약수의_합().solution(given);

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(12, 28),
            Arguments.of(5, 6)
        );
    }
}
