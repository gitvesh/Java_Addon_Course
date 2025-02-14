package day3;

public class finalizeDemo {
    protected void finaliz()
    {
        System.out.println("call the finalize method");
    }

    public static void main(String[] args) {
        finalizeDemo fd=new finalizeDemo();
        System.out.println("hashcode is "+fd.hashCode());
        fd=null;
        System.gc();
        System.out.println("End of the Garbage Collection!!!!!!!!!!!");
    }
}
