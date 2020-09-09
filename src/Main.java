import generation.NoSymmetric;
import generation.Symmetric;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Symmetric mat = new Symmetric(7);
            mat.generation();
            mat.diagonal('0');
            System.out.println(i + 1 + ". ");
            mat.printMatrix();
        }

        for (int i = 0; i < 20; i++) {
            NoSymmetric noS = new NoSymmetric(7);
            noS.generation();
            noS.diagonal('∞');
            System.out.println(i + 1 + ". ");
            noS.printMatrix();
        }
    }
}