import java.util.Scanner;

public class TareaCiclosNumMinimo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números a comparar");

        int cantidad = s.nextInt();
        int numeroMinimo = Integer.MAX_VALUE;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingresa el numero " + (i + 1));
            int numeroIngresado = s.nextInt();

            numeroMinimo = numeroIngresado < numeroMinimo ? numeroIngresado : numeroMinimo;
        }

        if (numeroMinimo < 10) {
            System.out.println("El menor número es menor que 10!");
        } else {
            System.out.println("El menor número es: " + numeroMinimo);
        }

    }
}
