public class PrimitivosFloat {
    static long varFlotante;

    public static void main(String[] args) {
        float realFloat = 1.5e-10f; //0.00000000015
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a: " + Float.BYTES);
        System.out.println("float corresponde en bits a: " + Float.SIZE);
        System.out.println("Máximo valor para float: " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float: " + Float.MIN_VALUE);
        System.out.println("-------------------------------");

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a: " + Double.BYTES);
        System.out.println("double corresponde en bits a: " + Double.SIZE);
        System.out.println("Máximo valor para double: " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para double: " + Double.MIN_VALUE);
        System.out.println("-------------------------------");

//        float varFlotante = 0.0f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
