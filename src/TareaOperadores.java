import javax.swing.*;
import java.util.Scanner;

public class TareaOperadores {
    public static void main(String[] args) {

        // Tarea 3: Obtener nombre más largo
        String person1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de la primera persona");
        String person2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de la segunda persona");
        String person3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de la tercera persona");

        String[] person1Arr = person1.split(" ");
        String[] person2Arr = person2.split(" ");
        String[] person3Arr = person3.split(" ");

        String[] longerName;

        longerName = person1Arr[0].length() > person2Arr[0].length() ? person1Arr : person2Arr;
        longerName = person3Arr[0].length() > longerName[0].length() ? person3Arr : longerName;

        System.out.println(longerName[0] + " " + longerName[1] + " tiene el nombre más largo");


        // Tarea 2: Estanque Gasolina
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Por favor ingrese la capacidad actual");
//        double capacity = scanner.nextDouble();
//
//        String message = "Insuficiente";
//        message = capacity <= 0.0 || capacity > 70.0 ? "ERROR. Valor invalido de capacidad." : message;
//        message = capacity >= 20.0 && capacity < 35.0 ? "Suficiente" : message;
//        message = capacity >= 35.0 && capacity < 40.0 ? "Medio Estanque" : message;
//        message = capacity >= 40.0 && capacity < 60.0 ? "Estanque 3/4" : message;
//        message = capacity >= 60.0 && capacity < 70.0 ? "Estanque casi lleno" : message;
//        message = capacity == 70.0 ? "Estanque lleno" : message;
//
//        System.out.println(message);

        // Tarea 1:
//        int maxNumber, minNumber;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digita el primer número");
//        int num1 = scanner.nextInt();
//        System.out.println("Digita el segundo número");
//        int num2 = scanner.nextInt();
//
//        maxNumber = (num1 > num2) ? num1 : num2;
//        minNumber = num2 == maxNumber ? num1 : num2;
//
//        System.out.println("El orden númerico es el siguiente: Máximo: " + maxNumber + " Mínimo: " + minNumber);
    }
}
