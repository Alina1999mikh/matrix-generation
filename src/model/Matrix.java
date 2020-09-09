package model;

public class Matrix {
    private double[][] matrix;
    private int dimension;

    public Matrix(int dimension) {
        this.dimension = dimension;
        this.matrix = new double[dimension][dimension];
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public int dimension() {
        return dimension;
    }
}