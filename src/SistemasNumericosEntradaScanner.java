import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
//        String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;
        try {
//            numeroDecimal = Integer.parseInt(numeroStr);
            numeroDecimal = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("ERROR. Debe Ingresar un número entero");
            main(args);
            System.exit(0);
        }

        String resultadoBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String ResultadoOctal = "\nNúmero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHex = "\nNúmero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String mensaje = resultadoBinario + ResultadoOctal + resultadoHex;
        System.out.println(mensaje);

    }
}
