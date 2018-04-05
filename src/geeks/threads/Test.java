package geeks.threads;

public class Test implements Runnable
{
    public void run()
    {
        System.out.printf("GFG ");
        System.out.printf("Geeks ");
    }
    public static void main(String[] args)
    {
        Test obj = new Test();
        Thread thread = new Thread(obj);
         
        thread.start();
        System.out.printf("Geeks ");
        try
        {
            thread.join();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("for ");
    }
}
