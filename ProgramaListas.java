import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaListas {
    public static void main(String[] args) {
        // Creamos una lista de números enteros
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese los números y los agregamos a la lista
        System.out.print("Ingrese un número (o presione 'q' para terminar la lista): ");
        while (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            numeros.add(numero);
            System.out.print("Ingrese otro número (o presione 'q' para terminar la lista): ");
        }

        // Accedemos a un elemento de la lista por índice
        int primerNumero = numeros.get(0);
        System.out.println("El primer número de la lista es " + primerNumero);

        System.out.println("Los números de la lista son:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Eliminamos un elemento de la lista
        numeros.remove(1);
        System.out.println("La lista después de eliminar el segundo elemento es:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        scanner.close();
    }
}
