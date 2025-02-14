package day3;
class a
{
   public void Aclass()
   {
       System.out.println("i am from a class");
   }
}
class b extends a
{
    public void bclass()
    {
        System.out.println("i am from b class");
    }
}
class c extends b
{
    public void cclass()
    {
        System.out.println("i am from c class");
    }
}
public class mutipleInher {
    public static void main(String[] args) {
        c C=new c();
        C.Aclass();
        C.bclass();


    }
}
