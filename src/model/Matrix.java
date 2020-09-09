package model;

import java.util.Arrays;

public class Matrix {
    protected int[][] matrix;
    private int pill; //влево
    private int row; //вниз

    public Matrix(int row,int pill) { //-вниз-влево
        this.pill = pill;
        this.row=row;
        this.matrix = new int[row][pill];
        for(int i=0;i<row;i++){
            Arrays.fill(matrix[i], 0 );
        }
    }

    public void printMatrix() {
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < pill; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int pill() {
        return pill;
    }

    public int row() {
        return row;
    }
}