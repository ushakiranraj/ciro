public class PA_Overload
{
    static double perimeter(int r) {return 2*Math.PI*r;}
    static double area(int r) {return Math.PI*r*r;}

    static double perimeter(double r)
    {
        return 2*Math.PI*r;
    }
    static double area(double r)
    {
        return Math.PI*r*r;
    }
}

class TestOverloading2
{
    public static void main(String[] args)
    {
        System.out.println("Perimeter: " + PA_Overload.perimeter(10) + " sq units");
        System.out.println("Area: " + PA_Overload.area(10) + " sq units");
        System.out.println('\n');
        System.out.println("Perimeter: " + PA_Overload.perimeter(3.2) + " sq units");
        System.out.println("Area: " + PA_Overload.area(2.4) + " sq units");
    }
}
