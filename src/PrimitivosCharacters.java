public class PrimitivosCharacters {
    public static void main(String[] args) {
        var character = '\u0040';
        char decimal = 64;
        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = character " + (decimal == character));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = character " + (simbolo == character));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte:" + nuevaLinea + retornoCarro + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("Character.MAX_VALUE: " + Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE: " + Character.MIN_VALUE);
    }
}
