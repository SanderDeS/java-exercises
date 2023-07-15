package oefeningen;

public class Sudoku {
    public boolean isValid(int[][] sudoku) {
        if (!dimensionsAreValid(sudoku)) {
            return false;
        }

        boolean returnValue = true;

        for (int i = 0; i < 9; i++) {
            if (!isLegalSudokuArray(getRow(sudoku, i))) {
                System.out.println("Row " + i + " is not legal.");
                returnValue = false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (!isLegalSudokuArray(getCol(sudoku, i))) {
                System.out.println("Col " + i + " is not legal.");
                returnValue = false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (!isLegalSudokuArray(getBox(sudoku, i))) {
                System.out.println("Box " + i + " is not legal.");
                returnValue = false;
            }

        }
        if (returnValue) {
            System.out.println("Sudoku is valid :)");
        }
        return returnValue;
    }

    public void print(int[][] sudoku) {
        if (dimensionsAreValid(sudoku)) {
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (sudoku[row][col] >= 1 && sudoku[row][col] <= 9) {
                        System.out.print(sudoku[row][col] + " ");
                    } else {
                        System.out.print("? ");
                    }
                    if ((col+1) % 9 == 0) {
                        System.out.println();
                    } else if ((col+1) % 3 == 0) {
                        System.out.print("| ");
                    }

                }
                if ((row+1) % 3 == 0 && row < 8) {
                    drawHorizontalLine();
                }
            }
        } else {
            System.out.println("Invalid dimensions");
        }
    }

    private void drawHorizontalLine() {
        for (int i = 0; i < 22; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public boolean dimensionsAreValid(int[][] sudoku) {
        int row = sudoku.length;
        int col = sudoku[0].length;

        if (row != 9 || col != 9) {
            return false;
        } else {
            return true;
        }
    }

    public int[] getRow(int[][] sudoku, int row) {
        return sudoku[row];
    }

    public int[] getCol(int[][] sudoku, int col) {
        int[] colarray = new int[9];
        for (int i = 0; i < 9; i++) {
            colarray[i] = sudoku[i][col];
        }
        return colarray;
    }

    public int[] getBox(int[][] sudoku, int box) {
        int[] boxarray = new int[9];
        int row = (box / 3) * 3;
        int col = (box % 3) * 3;
        int i = 0;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                boxarray[i] = sudoku[row+r][col+c];
                i++;
            }
        }
        return boxarray;
    }

    public void printArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private boolean isLegalSudokuArray(int [] array) {
        for (int i = 1; i <= 9 ; i++) {
            if (!arrayContains(array, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean arrayContains(int [] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
