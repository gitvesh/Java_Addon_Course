package day5;

 class mythread extends Thread {
    public void run() {
        for(int i=0;i<1000;i++)
        {


        System.out.println("Running Thread......");}
    }

}
public class multithreading {
    public static void main(String[] args) {
        mythread th=new mythread();
        th.start();
        for(int i=0;i<2000;i++)
        {


        System.out.println("Parent Thread>>>>>>");}
    }
}
