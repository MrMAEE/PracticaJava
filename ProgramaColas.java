import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ProgramaColas {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de clientes en espera: ");
        int cantidadClientes = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cantidadClientes; i++) {
            System.out.print("Ingrese el nombre del cliente " + (i+1) + ": ");
            String nombreCliente = scanner.nextLine();
            cola.add(nombreCliente);
        }
        while (!cola.isEmpty()) {
           
            System.out.println("Clientes en espera: " + cola);

            
            String clienteActual = cola.remove();
            System.out.println("Atendiendo a " + clienteActual);

            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("No hay más clientes en espera");
        scanner.close();
    }
}
