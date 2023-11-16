public class EjemploStringsMetodos {
    public static void main(String[] args) {
        String nombre = "Diego";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Diego\") = " + nombre.equals("Diego"));
        System.out.println("nombre.equals(\"diego\") = " + nombre.equals("diego")); // Java es sensible con mayúsculas y minuscules
        System.out.println("nombre.equalsIgnoreCase(\"diego\") = " + nombre.equalsIgnoreCase("diego"));
        System.out.println("nombre.compareTo(\"diego\") = " + nombre.compareTo("Diana")); // Si es cero, son identicos.
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(2));
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));
        // Recibe dos argumentos (desde, hasta) --> Primer parámetro es incluyente, segundo excluyente.
        System.out.println("nombre.substring(1) = " + nombre.substring(1)); // Este es incluyente.
        System.out.println("nombre.substring(1, 3) = " + nombre.substring(1, 5)); // El segundo parámetro es excluyente.
        System.out.println("nombre.substring(1, 3) = " + nombre.substring(nombre.length() - 1));
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalengua.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalengua = " + trabalenguas);
        System.out.println("trabalengua.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z')); // Si no existe, retorna -1.
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());

    }
}
