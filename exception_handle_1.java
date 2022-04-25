import java.util.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exception_handle_1
{
    static void validate(String r, String n)
    {
        if(r.length() != 9)
        {
            System.out.println("Invalid");
            throw new IllegalArgumentException("Register Number does not contain exactly 9 characters");
        }


        if(n.length() != 10)
        {
            System.out.println("Invalid");
            throw new IllegalArgumentException("Mobile Number does not contain exactly 10 characters");
        }


        boolean m1;
        m1 = Pattern.matches("\\d+",n);
        if(!m1)
        {
        throw new NumberFormatException("Mobile Number cannot contain any character other than a digit");
        }

        boolean m2;
        m2 = Pattern.matches("[0-9]{2}[A-Z]{3}[0-9]{4}",r);
        if(!m2)
        {
        throw new NoSuchElementException("Registration Number cannot contain any character other than digits and alphabets");
        }

    }

    public static void main(String args[])
    {
        validate("20BCE1680","1234567899");
        System.out.println("Valid");
    }
}
