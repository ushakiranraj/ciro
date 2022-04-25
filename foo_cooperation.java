import java.util.*;
public class foo_cooperation
{
    String name;
    double basic;
    double basic_over;
    double hour;
    double extra;
    double finalpay;
    double pay;
    foo_cooperation()
    {
        name = "";
        basic= 0.00;
        basic_over = 0.00;
        hour=0.00;
        extra= 0.00;
        finalpay= 0.00;
        pay=0.00;
    }
    void unit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter employee name = ");
        name = sc.next();
        System.out.print("Enter base_pay = ");
        basic = sc.nextDouble();
        System.out.print("hours worked = ");
        hour = sc.nextDouble();
    }
    void calc()
    {

        if(hour>60.00)
            System.out.println("error work hours greater than 60");
        else if(basic<8.00)
            System.out.println("error base pay is less than 8");
        else{
            if (hour < 40){
                finalpay=(basic*hour);
                this.display();
            }
            else if(hour>40)
            {
                extra=(hour - 40.00);
                basic_over=(basic*1.50);
                finalpay=(basic*40.00)+(extra*basic_over);
                this.display();
            }
        }
    }
    void display()
    {
        System.out.println("Name = "+name);
        System.out.println("Basic pay = "+basic);
        System.out.println("Final pay = "+finalpay);
    }
    public static void main(String args[])
    {
        foo_cooperation e = new foo_cooperation();
        e.unit();
        e.calc();
    }
}
