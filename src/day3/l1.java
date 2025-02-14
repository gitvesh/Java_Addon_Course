package day3;
class animanl
{
   String name;
   public void eat()
   {
       System.out.println("i can eat but iam animal ");
   }
   public void bark(int c)
   {
       System.out.println("i am barking "+c+" times!!!");
   }
}
 class dog extends animanl
 {
     public void display()
     {
         System.out.println("my name is : "+name);
     }
     public void eat(int i)
     {
         System.out.println("i can eat but iam dog and iam  "+i+" years old");
     }
     public void bark()
     {
         System.out.println("i am barking");
     }

 }
public class l1 {
    public static void main(String[] args) {
        dog d=new dog();

        d.name="jay kadam";
        d.eat(2);
        d.bark();
        d.bark(2);
        d.display();
    }
}
