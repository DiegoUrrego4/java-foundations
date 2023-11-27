import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");


        try {
            System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'");
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format.format(fecha) = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            // Formas para comparar fechas:
            // Forma #1:
            if (fecha.after(fecha2)) {
                System.out.println("Fecha (digitada) es después o mayor que la fecha (actual)");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha (digitada) es anterior que la fecha (actual)");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha (digitada) es igual a la fecha (actual)");
            }

            // Forma #2:
            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("fecha digitada mayor a fecha actual");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("fecha digitada menor a fecha actual");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("fecha digitada es igual a fecha actual");
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
