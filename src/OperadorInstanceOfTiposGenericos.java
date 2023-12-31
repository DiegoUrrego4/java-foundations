public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {
        Object texto = "Creando un objeto de la clase String ... que tal!";
        Number num = Integer.valueOf(7);  //7; // Está sería la forma correcta de crear una instancia de la clase Integer

        Boolean b1 = texto instanceof Object; // Todas las clases son del tipo Object
        System.out.println("texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

//        b1 = num instanceof Short; --> // No se puede realizar el casting
        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);

        b1 = num instanceof  Long;
        System.out.println("num es del tipo Long = " + b1);

        b1 = num instanceof Double;
        System.out.println("num es del tipo Double = " + b1);

        Number decimal = 45.54f;

        b1 = decimal instanceof Double;
        System.out.println("decimal es de tipo Double = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es de tipo Float = " + b1);


        b1 = decimal instanceof Number;
        System.out.println("decimal es de tipo Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);
    }
}
