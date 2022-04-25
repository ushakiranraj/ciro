import java.util.*;
import java.util.regex.Pattern;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;


public class checked_exception
{


    public static void main(String args[])
    {
        String fileName = "file does not exist";
        File file = new File(fileName);
        try
        {
            FileInputStream stream = new FileInputStream(file);
        }
        catch (FileNotFoundException e)
        {
            System.out.print("File not found exception");
        }
    }
}
