package day3;
interface vehicle
{
    public void drive();
}
class car
{
    public void wheel()
    {
        System.out.println("MRF wheels.......");
    }
}
class interfaces extends car implements vehicle
{

    @Override
    public void drive() {
        System.out.println("i am drive method which is implemented!!!!");
    }

    public static void main(String[] args) {
        interfaces intf= new interfaces();
        intf.drive();
        intf.wheel();

    }
}
