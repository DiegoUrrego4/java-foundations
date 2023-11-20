import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola,. qué tal!";

        Class strClass = texto.getClass();
        System.out.println("strClass = " + strClass.getName());
        System.out.println("strClass = " + strClass.getSimpleName()); // No incluye package
        System.out.println("strClass = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        for(Method method : strClass.getMethods()) {
            System.out.println("metodos = " + method.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass = " + intClass.getSuperclass()); // Number
        System.out.println("intClass = " + objClass); // Object

        for(Method method : objClass.getMethods()) {
            System.out.println("method = " + method);
        }
    }
}
