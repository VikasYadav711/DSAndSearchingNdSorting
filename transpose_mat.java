import java.util.*;
public class transpose_mat {
    public static void trans_mat(int arr[][])
    {
        int trans[][]= new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                trans[j][i]=arr[i][j];
            }
        }
        print_mat(trans);
    }

    public static void print_mat(int trans[][])
    {
        System.out.println("Transposed Matrix:");
        for(int i=0;i<trans.length;i++)
        {
            for(int j=0;j<trans[0].length;j++)
            {
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int row ,col;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and col:");
        row=sc.nextInt();
        col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter the elements of matrix");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original matrix:");
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        trans_mat(arr);
    }
}
