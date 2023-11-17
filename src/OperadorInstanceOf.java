public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase String ... que tal!";
        Integer num = 7;

        Boolean b1 = texto instanceof Object; // Todas las clases son del tipo Object
        System.out.println("texto es del tipo Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

//        b1 = num instanceof Short; --> // No se puede realizar el casting
        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);

        Double decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("decimal es de tipo Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);

    }
}
