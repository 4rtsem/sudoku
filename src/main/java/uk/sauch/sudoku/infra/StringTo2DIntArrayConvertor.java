package uk.sauch.sudoku.infra;

public final class StringTo2DIntArrayConvertor {

    public static int[][] convert(final String string) {
        final var result = new int[9][9];

        var array = string.chars()
                .filter(i -> i >= 48 && i <= 57)
                .map(i -> i - 48)
                .toArray();

        assert array.length == 81;

        for (int i = 0; i < 9; i++) {
            System.arraycopy(array, i * 9, result[i], 0, 9);
        }
        return result;
    }
}
