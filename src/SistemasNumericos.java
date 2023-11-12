import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERROR. Debe Ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100;
        System.out.println("NúmeroBinario = " + numeroBinario);

        String ResultadoOctal = "\nNúmero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(ResultadoOctal);

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "\nNúmero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario + ResultadoOctal + resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
