package generation;

import model.Matrix;

public class Symmetric extends Matrix implements Generation {
    public Symmetric(int dimension) {
        super(dimension, dimension);
    }

    @Override
    public void generation() {
        for (int i = 0; i < row(); i++) {
            for (int j = i; j < pill(); j++) {
                matrix[i][j] = (int) (Math.random() * (10 - 1) + 1);
                matrix[j][i] = matrix[i][j];
            }
        }
    }
}