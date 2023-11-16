import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        // Tarea:
        // Mi solución:
        // 1. Obtención nombres
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del primer integrante familiar:");
        String firstRelative = scanner.nextLine();
        System.out.println("Ingresa el nombre del segundo integrante familiar:");
        String secondRelative = scanner.nextLine();
        System.out.println("Ingresa el nombre del tercer integrante familiar:");
        String thirdRelative = scanner.nextLine();

        // Conversión nombres
        char secondCharacterFirstRelative = Character.toUpperCase(firstRelative.charAt(1));
        char secondCharacterSecondRelative = Character.toUpperCase(secondRelative.charAt(1));
        char secondCharacterThirdRelative = Character.toUpperCase(thirdRelative.charAt(1));

        // Obtención dos últimas letras
        String twoFinalLettersFirstRelative = firstRelative.substring(firstRelative.length() - 2);
        String twoFinalLettersSecondRelative = secondRelative.substring(secondRelative.length() - 2);
        String twoFinalLettersThirdRelative = thirdRelative.substring(thirdRelative.length() - 2);

        // Unión nombres separados por punto
        String firstResult = secondCharacterFirstRelative + "." + twoFinalLettersFirstRelative + "_";
        String secondResult = secondCharacterSecondRelative + "." + twoFinalLettersSecondRelative + "_";
        String thirdResult = secondCharacterThirdRelative + "." + twoFinalLettersThirdRelative;

        String finalResult = firstResult.concat(secondResult).concat(thirdResult);

        System.out.println(finalResult);


        // Solución profesor:
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre de un familiar:");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        System.out.println(resultado);*/

    }
}
