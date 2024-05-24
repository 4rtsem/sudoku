package uk.sauch.sudoku.infra;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.atIndex;

class StringTo2DIntArrayConvertorTest {

    @Test
    void should_convert() {
        // given
        var raw = """
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
        var parsed = StringTo2DIntArrayConvertor.convert(raw);

        // then
        Assertions.assertThat(parsed)
                .hasSize(9)
                .contains(new int[]{0,7,0,0,0,0,0,0,0}, atIndex(2));
    }
}