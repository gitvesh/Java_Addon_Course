package day3;

import org.w3c.dom.ls.LSOutput;

class person1
{ String name;

  int age;
  String email="";
  String add="";


    public void display()
    {
        System.out.println("person name is + "+name+"Age is "+age+"Address is "+add);
    }



}
class person2
{ String name;

    int age;
    String email="";
    String add="";


    public void displays()
    {
        System.out.println("person name is + "+name+"Age is "+age+"Address is "+add);
    }



}
class employee extends person1
{
    int salary=0;
    int id=0;



    public void displayE()
    {
        System.out.println("Employee salary is "+salary+". Employee id is "+id);
    }

}
class employee1 extends person2
{
    int salary=0;
    int id=0;



    public void displayE()
    {
        System.out.println("Employee salary is "+salary+". Employee id is "+id);
    }

}
public class inheritanceMain {
    public static void main(String[] args) {
        employee ep=new employee();
        ep.id=4;
        ep.age=30;
        ep.salary=8900;
        ep.email="bhavesh@";
        ep.name="bhavesh";
        ep.display();
        ep.displayE();


    }


}
