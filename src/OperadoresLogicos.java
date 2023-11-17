public class OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j && k < l && m == false; // Las dos se deben cumplir
        System.out.println("b1 = " + b1);

        boolean b2 = i == j || k > l;
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && k > l || m == false; // Se evalúa de izquierda a derecha
        System.out.println("b3 = " + b3);

        // NOTA: Siempre va a tener prioridad el operador AND sobre el OR
        boolean b4 = i == j || k < l && m == true; // Acá primero se resuelve el AND
        System.out.println("b4 = " + b4);

        boolean b5 = (true || true) && false; // De esta forma podemos cambiar la precedencia
        System.out.println("b5 = " + b5);

        boolean b6 = true || false && false || false;
        System.out.println("b6 = " + b6);
    }
}
