import java.util.*;
public class spiral_mat
{
    public static void print_spiral(int arr[][],int row, int col)
    {
        int startcol=0,startrow=0,endcol=col-1,endrow=row-1;
        while(startrow<=endrow && startcol<=endcol)
        {
            //top
            for(int j=startcol; j<=endcol;j++)
            {
                System.out.print(arr[startrow][j]+" ");
            }     
            
            //right
            for(int i=startrow+1;i<=endrow;i++)
            {
                System.out.print(arr[i][endcol]+" ");
            }

            //bottom
            for(int j=endcol-1;j>=startcol;j--)
            {
                System.out.print(arr[endrow][j]+" ");
                if(startrow==endrow)
                    break;
            }

            //left
            for(int i=endrow-1;i>=startrow+1;i--)
            {
                System.out.print(arr[i][startcol]+" ");
                if(startcol==endcol)
                    break;
            }

            startcol++;
            endcol--;
            startrow++;
            endrow--;
        }

    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row,col;
        System.out.println("Enter the row and col:");
        row=sc.nextInt();
        col=sc.nextInt();

        int arr[][]=new int[row][col];
        System.out.println("Enter the element of matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The spiral traversal of matrix elements:");
        print_spiral(arr, row, col);
    }

}