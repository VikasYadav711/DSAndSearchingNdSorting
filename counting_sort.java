import java.util.*;
public class counting_sort {
    public static void count_sort(int arr[],int size)
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<size;i++)
        {
            largest=Math.max(largest,arr[i]);
        }
        int freq[]=new int [largest+1];         // kyuki largest number bhi as a index present hona chahiye.
        
        for(int i=0;i<size;i++)
        {
            freq[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<largest+1;i++)
        {
            while(freq[i]>0)
            {
                arr[j]=i;
                j++;
                freq[i]--;
            }
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
        size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        count_sort(arr, size);
        print_arr(arr, size);
    }
}
