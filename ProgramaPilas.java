import java.util.*;
import java.util.Scanner;
public class ProgramaPilas 
{

    public static String ProgramaPilas(int decimal) 
    {
        Stack<Integer> pila = new Stack<Integer>();
        while (decimal > 0) 
        {
            int residuo = decimal % 2;
            pila.push(residuo);
            decimal /= 2;
        }
        StringBuilder binario = new StringBuilder();
        while (!pila.empty()) 
        {
            binario.append(pila.pop());
        }
        return binario.toString();
    }

    public static void main(String[] args) 
    {
    	Scanner x = new Scanner(System.in);
    	int valor1;
        int valor2;
    	System.out.println("Este programa sirve para convertir numeros en decimales");
    	System.out.println("Digite un valor para convertirlo a binario");
    	valor1=x.nextInt();
    	System.out.println("Digite un segundo valor para convertirlo a binario");
    	valor2=x.nextInt();
        String conversion1 = ProgramaPilas(valor1);
        String conversion2 = ProgramaPilas(valor2);
        System.out.println(valor1 + " en binario es " + conversion1);
        System.out.println(valor2 + " en binario es " + conversion2);
    }
}
