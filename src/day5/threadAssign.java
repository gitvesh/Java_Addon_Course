package day5;
class th1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
        System.out.println("===========================================");
    }
}
class th2 extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {if(i%2==0) {
            System.out.println(i);
        }
        }
        System.out.println("====================================");
    }
}
class th3 extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {if(i%2!=0) {
            System.out.println(i);
        }
        }
        System.out.println("=======================================");
    }
}
public class threadAssign {
    public static void main(String[] args) {
        th1 t1=new th1();
        th2 t2=new th2();
        th3 t3=new th3();
        System.out.println("=========================================");
        t1.start();
        System.out.println("==========================================");
        t2.start();
        System.out.println("===========================================");
        t3.start();

    }
}
