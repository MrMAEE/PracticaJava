public class ReemplazarDatos {
    public static void main(String args[])
    {
        int i;
        for(i=0;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
            {
                String convertir = Integer.toString(i);
                convertir="FizzBuzz";
                System.out.println("El numero "+i+" Equivale a "+convertir);
            }
            else
            {
                if(i%3==0)
                {
                String convertir = Integer.toString(i);
                convertir="Fizz";
                System.out.println("El numero "+i+" Equivale a "+convertir);
                }
                else
                {
                    if(i%5==0)
                    {
                        String convertir = Integer.toString(i);
                        convertir="Buzz";
                        System.out.println("El numero "+i+" Equivale a "+convertir);
                    }
                    else
                    {
                        System.out.println("El numero "+i+" equivale a "+i);
                    }
                }
            }
        }
    }
}
