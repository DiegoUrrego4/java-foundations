import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date(); // Formato por defecto: Sun Nov 26 16:14:34 COT 2023

        System.out.println("fecha = " + fecha);

        // MM: número mes, MMM: Nombre mes, E: nombre día abreviado, EEEE: nombre día completo
        SimpleDateFormat df = new SimpleDateFormat("'fecha: 'dd/MM/yyyy 'hora: 'HH:mm:ss");
        String fechaStr = df.format(fecha);

        long j = 0;
        for (int i = 0; i < 100000000; i++) {
            j += i;
        }
        System.out.println("j = " + j);
        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempo transcurrido en el for = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);
    }
}

