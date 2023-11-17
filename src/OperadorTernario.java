public class OperadorTernario {
    public static void main(String[] args) {
        // variable = condición ? siEsVerdadero : siEsFalso;
        String variable = 7 == 7 ? "Si es verdadero": "Es falso";
        System.out.println("variable = " + variable);

        String estado;
        double promedio =  5.2;
        estado = promedio >= 5.49 ? "Aprobado" : "rechazado";
        System.out.println("promedio = " + estado);
    }
}
