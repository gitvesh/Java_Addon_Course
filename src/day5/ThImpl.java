package day5;

 class ThImpl1 implements Runnable{
    public void run()
    {
        System.out.println("thread implementing runnable");
    }

}
public class ThImpl
{
    public static void main(String[] args) {
        Thread t=new Thread(new ThImpl1());
        System.out.println("parent thread running ->");
        t.start();
    }
}
