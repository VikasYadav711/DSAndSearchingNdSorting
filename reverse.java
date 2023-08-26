import java.util.*;
public class reverse {
    public static void rev_arr(int arr[],int size)
    {
        int first,last,temp;
        first=0;
        last=size;
        while(first<last)
        {
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
      

    }

    public static void main(String[] args) 
    {
        int size;
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }    
        
        System.out.println("Array before reverse:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        rev_arr(arr,size-1);
        System.out.println("Array after reverse:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
       
    }
}
