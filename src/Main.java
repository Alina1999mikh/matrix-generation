import generation.Symmetric;

public class Main {
    public static void main(String[] args) {
        Symmetric mat = new Symmetric(6);
        mat.generation();
        mat.printMatrix();
    }
}