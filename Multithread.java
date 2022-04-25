// Java code for thread creation
class Multithreading extends Thread {
    public void run() {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e)
        {
            //Exception Handling
            System.out.println ("Exception is caught");
        }
    }
}
// Main Class
public class Multithread
{
    public static void main(String[] args)
    {
        // Number of threads
        int n = 7;

        //For loop to create multiple threads
        for (int i=0; i<n; i++)
        {
            Multithreading object = new Multithreading();
            object.start();
        }
    }
}
