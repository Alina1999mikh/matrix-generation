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

//        NoSymmetric noS = new NoSymmetric(6);
//        noS.generation();
//        noS.printMatrix();
    }
}