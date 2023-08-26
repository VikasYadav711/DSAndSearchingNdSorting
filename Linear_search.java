import java.util.*;
public class Linear_search {
    
    public static Boolean lns(String arr[],String key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals(key)==true)
                return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        int size;
        String key;
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of string array");
            size=sc.nextInt();
            String arr[]=new String[size];
            System.out.println("Enter the elements of String array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.next();
        }
        System.out.println("Enter the key string");
        key=sc.next();
        boolean op=lns(arr, key);
        if(op==true)
            System.out.println("Found the key "+key);
        else
            System.out.println("Not found");
    }
}