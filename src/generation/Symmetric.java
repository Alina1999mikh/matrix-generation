package generation;

import model.Matrix;

public class Symmetric extends Matrix implements Generation {
    public Symmetric(int dimension) {
        super(dimension, dimension);
    }

    @Override
    public void generation() {
        char[] random = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '∞'};
        for (int i = 0; i < row(); i++) {
            for (int j = i; j < pill(); j++) {
                matrix[i][j] = random[(int) (Math.random() * random.length)]; //рандом 0-10. 10- бесконечность!
                matrix[j][i] = matrix[i][j];
            }
        }
    }
}