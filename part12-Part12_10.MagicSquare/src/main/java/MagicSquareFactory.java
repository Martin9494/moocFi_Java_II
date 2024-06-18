public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);
        
        if (size % 2 != 0) {  // Ensure the size is odd
            int[][] magicSquare = new int[size][size];

            int number = 1;
            int row = 0;
            int column = size / 2;
            int curr_row;
            int curr_col;

            while (number <= size * size) {
                magicSquare[row][column] = number;
                number++;
                curr_row = row;
                curr_col = column;
                row -= 1;
                column += 1;
                if (row == -1) {
                    row = size - 1;
                }
                if (column == size) {
                    column = 0;
                }
                if (magicSquare[row][column] != 0) {
                    row = curr_row + 1;
                    column = curr_col;
                    if (row == -1) {
                        row = size - 1;
                    }
                }
            }

            // Set the magic square values in the MagicSquare object
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    square.placeValue(i, j, magicSquare[i][j]);
                }
            }
        }
        
        return square;
    }
}
