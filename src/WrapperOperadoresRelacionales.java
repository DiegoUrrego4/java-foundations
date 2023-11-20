public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto?: " + (num1 == num2));

//        num2 = 127; // Hasta 127 Java compara por valor siempre. A los valores mayores, el escenario cambia.
        num2 = 1000;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto?: " + (num1 == num2)); // Esto compara por el objeto, más no por el valor.
        System.out.println("tienen el mismo valor?: " + (num1.equals(num2)));
        System.out.println("tienen el mismo valor?: " + (num1.intValue() == num2.intValue()));

        num2 = 500;
        boolean condicion = num1 > num2; // En estos casos Java compara por valor. Incluyendo los operadores aritméticos
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() < num2.intValue();
        System.out.println("condicion2 = " + condicion2);
    }
}
