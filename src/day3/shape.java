package day3;
  interface Shape
  {
      public void areaofcircle(int r);
      public void areaoftriangle(int l,int h);
      public void areaofrectangle(int l,int b);



  }
  class shape implements Shape
  {

      @Override
      public void areaofcircle(int r) {
          System.out.println("Area of circle is "+3.14*r*r);
      }

      @Override
      public void areaoftriangle(int l,int h) {
          System.out.println("Area of triangle is "+l*h/2);
      }

      @Override
      public void areaofrectangle(int l,int b) {
          System.out.println("Area of Rectangle is "+l*b);
      }

      public static void main(String[] args) {
           shape s=new shape();
           s.areaofcircle(2);
           s.areaofrectangle(2,6);
           s.areaoftriangle(5,2);

      }


  }
//public class shape {
//    public static void main(String[] args) {
//        calculations cl=new calculations();
//        cl.areaofcircle(3);
//        cl.areaofrectangle(34,7);
//        cl.areaoftriangle(2,8);
//    }}


