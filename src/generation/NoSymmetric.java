package generation;


import model.Matrix;

public class NoSymmetric extends Matrix implements Generation {
    public NoSymmetric(int dimension) {
        super(dimension, dimension);
    }

    @Override
    public void generation() {
        char[] random = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '∞'};
        for (int i = 0; i < row(); i++) {
            for (int j = 0; j < pill(); j++) {
                matrix[i][j] = random[(int) (Math.random() * random.length)];
            }
        }
    }
}