package day4;

public class exception1 {
    public static void main(String[] args) {
        m3();
    }
    public static void m1()
    {
        m2();
    }
    public static void m2()
    {
        m3();
    }
    public static void m3()
    {int b=0;
        System.out.println(1/b);
    }
}
