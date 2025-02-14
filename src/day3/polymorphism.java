package day3;

public class polymorphism {
    void sum(int x,int y)
    {
        int s=x+y;
        System.out.println("Addition of two number "+s);
    }
    void sum(int x,int y,int z)
    {
        int su=x+y+z;
        System.out.println("Addition is "+su);
    }

    public static void main(String[] args) {
        polymorphism p=new polymorphism();
        p.sum(1,4);
        p.sum(1,4,8);
    }
}
