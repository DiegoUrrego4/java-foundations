import java.util.ArrayList;
import java.util.Scanner;

public class TareaCiclosNotasAlumnos {
    public static void main(String[] args) {

        ArrayList<Double> notasMayoresACinco = new ArrayList<>();
        ArrayList<Double> notasInferioresACuatro = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        double promedioNotasMayoresACinco = 0.0;
        double promedioNotasInferioresACuatro = 0.0;
        double promedioTotal = 0.0;
        int cantidadNotasUno = 0;
        Scanner s = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingresa la " + i + " nota:");
            double nota = s.nextDouble();

            if (nota == 1.0) {
                cantidadNotasUno++;
            }

            if (nota < 4.0) {
                notasInferioresACuatro.add(nota);
            } else if (nota > 5.0) {
                notasMayoresACinco.add(nota);
            }

            notas.add(nota);
        }

        for (Double nota : notasMayoresACinco) {
            promedioNotasMayoresACinco += nota;
        }
        for (Double nota : notasInferioresACuatro) {
            promedioNotasInferioresACuatro += nota;
        }
        for (Double nota : notas) {
            promedioTotal += nota;
        }
        promedioNotasMayoresACinco /= notasMayoresACinco.size();
        promedioNotasInferioresACuatro /= notasInferioresACuatro.size();
        promedioTotal /= notas.size();

        System.out.println("La cantidad de notas 1.0 es: " + cantidadNotasUno);
        System.out.println("El promedio de notas mayores a 5.0 es: " + promedioNotasMayoresACinco );
        System.out.println("El promedio de notas inferiores a 4.0 es: " + promedioNotasInferioresACuatro);
        System.out.println("El promedio de todas las notas es: " + promedioTotal);

    }
}
