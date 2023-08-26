import java.util.*;
public class sub_arr {
    public static void sub_arrays(int arr[],int size)
    {
        int start,end,sub_count=0,l=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int calc_tsb=(size*(size+1))/2;
        int sum_sub_arr[]=new int[calc_tsb];
        for(int i=0;i<size;i++)
        {
            start=i;
            for(int j=i;j<size;j++)
            {
                end=j;
                int sum=0;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                }
                sub_count++;
                sum_sub_arr[l++]=sum;
                if(sum>max)
                    max=sum;
                if(sum<min)
                    min=sum;
                System.out.println();
            }
        }
        System.out.println("Total subarr="+sub_count);
        
        for(int m=0;m<calc_tsb;m++)
        {
            System.out.print(sum_sub_arr[m]+" ");
        }
        
        System.out.println();
        System.out.println("Max sum of a sub arr="+max);
        System.out.println("Min sum of a sub arr="+min);
    }

    public static void main(String args[])
    {
        int size;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of element array:");
        size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("The sub arrays are :");    
        sub_arrays(arr, size);
       
    }
}
