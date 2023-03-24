import java.util.Scanner;
public class SumNNum {
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int N=0,i=0,N2=0;
        double sum=0;
        System.out.println("Ingresa la cantidad de numeros a leer");
        N=x.nextInt();
        double alm[]=new double[N];
        System.out.println("Ingrese la cantidad de numeros que se van a sumar");
        N2=x.nextInt();
        for(i=0;i<N;i++)
        {
            System.out.println("Ingrese un valor");
            alm[i]=x.nextDouble();
            if(N2>i)
            {
                sum=sum+alm[i];
            }
        }
        System.out.println("La suma es: "+sum); 
    }
    
}
