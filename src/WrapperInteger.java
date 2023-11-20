public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo); // Forma Explicita
        Integer intObjeto2 = 32768; // Estas dos formas son equivalentes --> forma implicita.
        System.out.println("intObjeto = " + intObjeto);


        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue(); // Estas dos formas son equivalentes
        System.out.println("num2 = " + num2);

        // Convertir de string a valor entero
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto); // Perdida de datos

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto); // Perdida de datos

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}
