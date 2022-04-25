import java.util.*;
import java.util.regex.Pattern;


public class exception_handle_2 {


    public static void main(String args[]) {
        String num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1/2/3: ");
        num = input.nextLine();

        if (!Pattern.matches("[1-3]{1}",num)) {
            System.out.print("Invalid number entered, enter 1/2/3 only....");
        }

        else if (num.equals("1")) {
            try{
                int data = 1/0;
            }
            catch (ArithmeticException e) {
                System.out.print(e);
            }
        }
        else if (num.equals("2")) {
            try{
                String s = null;
                System.out.print(s.length());
            }
            catch (NullPointerException e) {
                System.out.print(e);
            }
        }
        else if (num.equals("3")) {
            try{
                int data[] = new int[1];
                data[5] = 10;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.print(e);
            }
        }
    }
}
