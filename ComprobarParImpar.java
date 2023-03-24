import java.util.Scanner;
public class ComprobarParImpar {
    int dato;
    void Comprobar(int a)
    {
        if(a%2==0)
        {
            System.out.println("El numero: "+a+" es un numero par");
        }
        else
        {
            System.out.println("El numero: "+a+" NO es un numero par");
        }
    }
    public static void main(String args[])
    {
        ComprobarParImpar obj=new ComprobarParImpar();
        Scanner x = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        obj.dato=x.nextInt();
        obj.Comprobar(obj.dato);
        return;
    }
}