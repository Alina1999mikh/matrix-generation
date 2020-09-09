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

    public void diagonal(char val) {
        for (int i = 0; i < row(); i++) {
            matrix[i][i] = val;
        }
    }

    protected int pill() {
        return pill;
    }

    protected int row() {
        return row;
    }
}