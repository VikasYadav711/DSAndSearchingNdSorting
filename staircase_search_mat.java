import java.util.*;
public class staircase_search_mat {
    public static boolean str_srch(int arr[][],int key)
    {
        int col=arr[0].length-1, row=0;
        while(col>=0 && row<arr.length)
        {
            if(arr[row][col]==key)
            {
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            else if(key>arr[row][col])
                row++;
            
            else                         //(key<arr[row][col])
                col--;
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[])
    {
        int arr[][]={{10,20,30,40},
        {15,25,35,45},
        {27,29,37,48},
        {32,33,39,50}};
        Scanner sc=new Scanner(System.in);
        int key;
        System.out.println("Enter the key to search in the given matrix");
        key=sc.nextInt();
        str_srch(arr, key);
    }
}
