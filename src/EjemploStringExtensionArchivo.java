public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.js";
//        String extensionArchivo = archivo.substring(archivo.indexOf('.') + 1, archivo.length());
        String extensionArchivo = archivo.substring(archivo.lastIndexOf('.') + 1);
        System.out.println("extensionArchivo = " + extensionArchivo);
    }
}
