public class Add_Overload
{
    static int add(int a, int b){return a+b;}
    static double add(double a, double b){return a+b;}
    static String add(String a, String b){return a+b;}
}

class TestOverloading
{
    public static void main(String[] args)
    {
        System.out.println("Sum: " + Add_Overload.add(1,23));
        System.out.println("Sum: " + Add_Overload.add(22.3,11.2));
        System.out.println("Sum: " + Add_Overload.add("Hello"," World"));
    }
}
