import java.util.*;
public class check_sort {

    public static boolean check(int arr[],int n,boolean flag)
    {
        if(n==1)
            return flag;

        if(arr[n-1]<arr[n-2])
        {
            flag= false;
            //return flag;
        }
        
        return check(arr,n-1,flag);

    }
    public static boolean check2(int arr[],int i) // 2nd way taking one argument less
    {
        if(i==arr.length-1)
            return true;

        if(arr[i]>arr[i+1])
            return false;

        return check2(arr,i+1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[]{2,34,45,132,355};
        boolean flag=true;
        //System.out.println(check(arr,n,flag));
        System.out.println(check2(arr,0));
    }
}
