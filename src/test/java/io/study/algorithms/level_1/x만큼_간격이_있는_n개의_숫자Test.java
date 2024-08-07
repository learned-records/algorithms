package io.study.algorithms.level_1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("x만큼_간격이_있는_n개의_숫자")
class x만큼_간격이_있는_n개의_숫자Test {
    @ParameterizedTest
    @MethodSource
    void solution(final int x, int n, long[] expected) {
        // When
        long[] actual = new x만큼_간격이_있는_n개의_숫자().solution(x, n);

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(2, 5, new long[]{2, 4, 6, 8, 10}),
            Arguments.of(4, 3, new long[]{4, 8, 12}),
            Arguments.of(-4, 2, new long[]{-4, -8})
        );
    }
}
