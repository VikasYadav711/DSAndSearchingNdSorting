import java.util.*;
public class selection_sort {
    public static void slct_sort(int arr[],int size)
    {
        for(int i=0;i<size-1;i++)
        {
            int min_pos=i;
            for(int j=i+1;j<size;j++)
            {
                if(arr[min_pos]>arr[j])
                {
                min_pos=j;
                }
            }
            
            int temp;
            temp=arr[min_pos]; 
            arr[min_pos]=arr[i];
            arr[i]=temp;
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
        slct_sort(arr, size);
        print_arr(arr, size);
    }
}
