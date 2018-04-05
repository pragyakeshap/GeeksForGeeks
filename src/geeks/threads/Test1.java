package geeks.threads;

public class Test1 extends Thread implements Runnable
{
    public void run()
    {
        System.out.printf("GFG ");
    }
    public static void main(String[] args) throws InterruptedException
    {
        Test1 obj = new Test1();
        obj.run();
        obj.start();
    }
}