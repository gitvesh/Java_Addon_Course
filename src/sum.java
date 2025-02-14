class sol
{
    public int luckySum(int arr[])
    {int sum=0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]!=12)
           {
               sum+=arr[i];
           }
           else {
               i++;
           }
        }
        return sum;
    }
}
public class sum {
    public static void main(String[] args) {
        sol s=new sol();
        try{int arr[]={1,12};
            if(arr.length>5)
            {
                return;
            }
            int res=s.luckySum(arr);
            System.out.println(res);}
        catch(Exception e)
        {
            System.out.println("char and String not Allowed!!");
        }

    }
}
