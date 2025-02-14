package day4;

public class exception {
    public static void main(String[] args) {
        int a=10;
        int b=2;
        System.out.println("do the division");int res=0;
       try
       { res=a/b;}
       catch (Exception e)
       {
           System.out.println("you cannot divide by zero : "+e);
       }
        System.out.println("RES  is "+res);
    }
}
