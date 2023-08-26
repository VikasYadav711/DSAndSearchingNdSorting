import java.util.*;
public class bubble_sorting {
    public static void b_sort(int arr[],int size)
    {
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[])
    {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the elements of array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before sorting:");
        
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        b_sort(arr, size);
        System.out.println("Array after sorting:");
        
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
