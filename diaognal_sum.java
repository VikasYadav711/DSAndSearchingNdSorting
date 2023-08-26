import java.util.*;
public class diaognal_sum {
    //Time complexity: O(n)
    public static int optm_diag_sum(int arr[][])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i][i];
            if(i!= (arr.length-1-i))
                sum+=arr[i][arr.length-i-1];
        }
        return sum;
    }
    
    //Time complexity: O(n^2)
    public static int diag_sum(int arr[][])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(i==j)
                {
                    sum+=arr[i][j];
                }
                else if((i+j)==arr[0].length-1)
                {
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String args[])
    {
        int row,col;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and col size of a matrix");
        row=sc.nextInt();
        col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Diagonal element sum="+diag_sum(arr));
        System.out.println("Diagonal element sum="+optm_diag_sum(arr));
        
    }
}
