public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);
        if (esNulo) {
            curso = "Programación en Java";
        }

        boolean esVacio = curso.length() == 0;

//        if (curso.isEmpty()) {
//            curso= "Programación en Java";
//        }

        System.out.println("esVacio = " + esVacio);

        // isBlank valida: variable != null, empty & blankSpace
        boolean esBlanco = curso.isBlank();

        if (!esBlanco) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
