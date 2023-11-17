import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

//        String[] usernames = new String[2];
//        String[] passwords = new String[2];
//        usernames[0] = "diego";
//        passwords[0] = "12345";
//
//        usernames[1] = "admin";
//        passwords[1] = "12345";

        String[] usernames = {"diego", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el usuario:");
        String usernameTyped = scanner.next();
        System.out.println("Ingrese la contraseña");
        String passwordTyped = scanner.next();

        boolean isAuthenticated = false;

        for (int i = 0; i < usernames.length; i++) {
            isAuthenticated = usernames[i].equals(usernameTyped) && passwords[i].equals(passwordTyped) ? true : isAuthenticated;
            //            if (usernames[i].equals(usernameTyped) && passwords[i].equals(passwordTyped)) {
//                isAuthenticated = true;
//                break;
//            }


        }

//        if (usernameTyped.equals(username) && passwordTyped.equals(password) || usernameTyped.equals(username2) && passwordTyped.equals(password2)) {
//            isAuthenticated = true;
//        } else {
//            System.out.println("Username o contraseña incorrecta");
//        }

        String message = isAuthenticated
                ?
                "Bienvenido usuario ".concat(usernameTyped).concat("!")
                :
                "Username o contraseña incorrecta!\nLo sentimos, requiere autenticación. Verifica las credenciales de acceso digitadas.";
        System.out.println(message);

        /*if (isAuthenticated) {
            System.out.println("Bienvenido usuario ".concat(usernameTyped).concat("!"));
        } else {
            System.out.println("Username o contraseña incorrecta");
            System.out.println("Lo siento, requiere autenticación. Verifica las credenciales de acceso digitadas.");
        }*/
    }
}
