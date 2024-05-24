package uk.sauch.sudoku.domain;


import java.util.UUID;

public record BoardId(String value) {
    public static BoardId from(final String raw) {
        return new BoardId(raw);
    }

    public static BoardId from(final UUID uuid) {
        return new BoardId(uuid.toString());
    }
}