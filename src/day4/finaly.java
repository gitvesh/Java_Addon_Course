package day4;

public class finaly {
    public static void main(String[] args) {
        try
        {
            int arr[]={1,2,3};
            System.out.println(arr[3]);
        }
        catch(Exception e)
        {
            System.out.println("something error occured!!");
        }
        finally
        {
            System.out.println("i am always here !!");
        }

    }
}
