package uk.sauch.sudoku.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class BoardTest {

    @Test
    void should_create_board() {
        // given
        var validRaw = """
                [[0,0,1,0,0,0,0,0,0],
                [2,0,0,0,0,0,0,7,0],
                [0,7,0,0,0,0,0,0,0],
                [1,0,0,4,0,6,0,0,7],
                [0,0,0,0,0,0,0,0,0],
                [0,0,0,0,1,2,5,4,6],
                [3,0,2,7,6,0,9,8,0],
                [0,6,4,9,0,3,0,0,1],
                [9,8,0,5,2,1,0,6,0]]""";

        // when
        var board = Board.of(validRaw);

        // then
        assertThat(board)
                .isNotNull()
                .hasNoNullFieldsOrProperties();
    }

    @Test
    void should_not_create_empty_board() {
        // given

        // when
        final Throwable throwable = catchThrowable(() -> Board.of("[]"));

        // then
        assertThat(throwable).isExactlyInstanceOf(AssertionError.class);
    }

    @Test
    void should_not_create_invalid_board() {
        // given
        var invalidRaw = """
                [[0,0,1,0,0,0,0,0,],
                [2,0,0,0,0,0,0,7,0],
                [0,7,0,0,0,0,0,0,0],
                [1,0,0,4,0,6,0,0,7],
                [0,0,0,0,0,0,0,0,0],
                [0,0,0,0,1,2,5,4,6],
                [3,0,2,7,6,0,9,8,0],
                [0,6,4,9,0,3,0,0,1],
                [9,8,0,5,2,1,0,6,0]]""";

        // when
        final Throwable throwable = catchThrowable(() -> Board.of(invalidRaw));

        // then
        assertThat(throwable).isExactlyInstanceOf(AssertionError.class);
    }
}