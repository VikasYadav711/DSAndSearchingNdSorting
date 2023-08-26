import java.util.*;
public class first_occurence {

    public static int first_found(int arr[],int key,int i)
    {
        if(i== arr.length-1)
            return -1;
        if(arr[i]==key)
        {
            return i;
        }

        return first_found(arr,key,i+1);
    }
    public static int last_found(int arr[],int key,int i)
    {
        if(i==1)
            return -1;
        
        if(key==arr[i])
            return i;
        
        return last_found(arr,key,i-1);
    }
        
  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{1,4,23,4,5,45,4,5,1};
        int key;
        key=sc.nextInt();

        int res=first_found(arr,key,0);
        if(res==-1)
            System.out.println("Key does not exists");
        else
            System.out.println("key="+res);
        
        int res2= last_found(arr,key,arr.length-1);
        if(res2==-1)
            System.out.println("Key does not exists");
        else
            System.out.println("key="+res2);
        
    }
}
