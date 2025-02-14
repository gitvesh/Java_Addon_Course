package day3;
 abstract class abs1
{
    abstract  void calc(int i,int j);
}
 class add extends abs1 {
    @Override
    void calc(int i, int j) {
        int res=i+j;
        System.out.println("Addition is : "+res);
    }
}
class sub extends abs1 {
    @Override
    void calc(int i, int j) {
        System.out.println("substraction is : "+(i-j));
    }
}class mul extends abs1 {
    @Override
    void calc(int i, int j) {
        System.out.println("multiplication is : "+i*j);
    }
}class div extends abs1 {
    @Override
    void calc(int i, int j) {
        System.out.println("division is : "+i/j);
    }
}


public class abstractClass {
    public static void main(String[] args) {
        add a=new add();
        sub s=new sub();
        mul m=new mul();
        div d=new div();
        a.calc(1,6);
        s.calc(7,6);
        m.calc(3,8);
        d.calc(6,3);
    }
}
