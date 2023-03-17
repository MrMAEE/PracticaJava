public class Rectangulo {
    double base=3,altura=2.5;
    double area=0;
    double CalArea (double a, double b, double c)
    {
        c=a*b;
        return(c);
    }
    public static void main (String dos[])
    {
        Rectangulo obj=new Rectangulo();
        double Resp;
        Resp=obj.CalArea(obj.base,obj.altura, obj.area);
        System.out.println("El area del rectangulo es: "+Resp);
    }
}
