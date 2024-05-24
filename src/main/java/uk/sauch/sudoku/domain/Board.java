package uk.sauch.sudoku.domain;

import lombok.Value;
import uk.sauch.sudoku.infra.StringTo2DIntArrayConvertor;

import java.util.UUID;

@Value
public class Board {
    BoardId id;
    int[][] raw;

    static Board of(final String string) {

        return new Board(
                BoardId.from(UUID.randomUUID()),
                StringTo2DIntArrayConvertor.convert(string)
        );
    }

    static Board of(final int[][] int2dArray) {
        return new Board(
                BoardId.from(UUID.randomUUID()),
                int2dArray
        );
    }
}
