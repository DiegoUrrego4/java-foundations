public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");

        boolean esIgual =  curso == curso2; // Compara el objeto pero no el valor
        System.out.println("curso == curso2 =" + esIgual);

        esIgual = curso.equals(curso2); // Compara el valor más no el objeto
        System.out.println("curso.equals(curso2) = " + esIgual);

        /*esIgual = curso.equalsIgnoreCase(curso2); // Esto compara las cadenas, pero ignorando si son mayúsculas o minuscules
        System.out.println("esIgual = " + esIgual);*/

        String curso3 = "Programación Java"; // Creación de forma literal
        esIgual = curso == curso3; // true --> No sea crea un nuevo objeto. Asigna la referencia del curso que ya existe.
        System.out.println("curso == curso3 = " + esIgual);
    }
}
