package day3;
class solution
{int sum=0;int max=0;
    public void largest(int arr[]) {int j=arr.length;
        for (int i = 0; i < j; i++) {
            while (j>=0) {


                sum += arr[i];
                if (sum > max) {
                    max = sum;
                }
                j--;
            }
    }
        System.out.println(max);

    }
}
public class largestSubarraysumproblem {
    public static void main(String[] args) {
        int arr[]={1,3,5,-2,-1,5};
        solution s=new solution();
        s.largest(arr);
    }

}
