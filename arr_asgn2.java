import java.util.*;

import javax.xml.stream.events.StartElement;
public class arr_asgn2 {
    public static void rotate(int num[],int k,int rtd_arr[],int size)
    {
        int j=0;
        for(int i=k;i<num.length;i++)
        {
            rtd_arr[j++]=num[i];
        }
        for(int i=0;i<k;i++)
        {
            rtd_arr[j++]=num[i];
        }

    }

    public static int search(int rtd_arr[],int size,int target,int pivot)
    {
        int start=0,end=(size-pivot)-1,mid;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(rtd_arr[mid]==target)
                return mid;
            
            if(target>rtd_arr[mid])
                start=mid+1;
            
            if(target<rtd_arr[mid])
                end=mid-1;
                
        }
        start=(size-pivot);
        end=size-1;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(rtd_arr[mid]==target)
                return mid;
            
            if(target>rtd_arr[mid])
                start=mid+1;
            
            if(target<rtd_arr[mid])
                end=mid-1;
                
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        int size, pivot,target;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nums to be stored in array:");
        size=sc.nextInt();
        System.out.println("Enter the pivot index:");
        pivot=sc.nextInt();
        int num[]=new int[size];
        int rtd_arr[]=new int[size];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
        rotate(num, pivot, rtd_arr, size);  
           
        System.out.print("Array before rotation about pivot:");
        for(int i=0;i<size;i++)
        {
            System.out.print(num[i]+" ");
        }   
        System.out.println();
        System.out.print("Array after rotation about pivot:");
        for(int i=0;i<size;i++)
        {
            System.out.print(rtd_arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the target value:");
        target=sc.nextInt();
        System.out.println("Result="+ search(rtd_arr, size, target,pivot));
    }
}
