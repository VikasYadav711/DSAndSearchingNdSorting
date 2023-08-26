import java.util.*;
public class insertion_sort {
    public static void insrt_sort(int arr[],int size)
    {
        for(int i=1;i<size;i++)
        {
            int curr=arr[i],prev=i-1;
            while(prev>=0 && curr<arr[prev])
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void print_arr(int arr[],int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[])
    {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter the elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        insrt_sort(arr, size);
        print_arr(arr, size);
    }
}
