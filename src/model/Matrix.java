package model;

public class Matrix {
    protected char[][] matrix;
    private int pill; //влево
    private int row; //вниз

    public Matrix(int row, int pill) { //-вниз-влево
        this.pill = pill;
        this.row = row;
        this.matrix = new char[row][pill];
    }

    public void printMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < pill; j++) {
                System.out.print(matrix[i][j] + "              ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public int pill() {
        return pill;
    }

    public int row() {
        return row;
    }
}