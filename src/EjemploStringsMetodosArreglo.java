public class EjemploStringsMetodosArreglo {
    public static void main(String[] args) {
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;

        System.out.println("largo = " + largo);

        for (int i = 0; i < largo; i++) {
            System.out.println("trabalenguas[i] = " + arreglo[i]);
        }

        System.out.println("trabalenguas = " + trabalenguas.split("a"));
        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int j = 0; j < l; j++) {
            System.out.println("arreglo2 = " + arreglo2[j]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\.");
        l = archivoArr.length;


        for (int i = 0; i < l; i++) {
            System.out.println(archivoArr[i]);
        }
        System.out.println("archivoArr[archivoArr.length - 1] = " + archivoArr[l - 1]);

    }
}
