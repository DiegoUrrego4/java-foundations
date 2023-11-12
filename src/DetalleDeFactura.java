import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre o descripción de la factura:");
        String invoiceDescription = scanner.nextLine();

        System.out.println("Ingrese el precio del primer producto:");
        double firstProductPrice = 0;

        try {
            firstProductPrice = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("¡ERROR! El precio debe ser de tipo numérico.");
            main(args);
            System.exit(0);
        }

        System.out.println("Ingrese el precio del segundo producto");
        double secondProductPrice = 0;

        try {
            secondProductPrice = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("¡ERROR! El precio debe ser de tipo numérico.");
            main(args);
            System.exit(0);
        }

        double tax = 0.19;
        double priceBeforeTaxes = firstProductPrice + secondProductPrice;
        double priceAfterTaxes = priceBeforeTaxes + (priceBeforeTaxes * tax);

        System.out.println(invoiceDescription + " tiene un total bruto de $" + priceBeforeTaxes + " pesos, con un impuesto de " + tax + "% y el monto después de impuestos es: $" + priceAfterTaxes + " pesos");

    }
}
