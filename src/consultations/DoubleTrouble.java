package consultations;

public class DoubleTrouble {
    public static void main(String[] args) {

        // IEEE 754

        double x = 0.1;
        double y = 0.2;
        double z = x + y; // ждем 0.3
        System.out.println(z);

        z = 0.2 + 0.2;
        System.out.println(z);


    }
}
