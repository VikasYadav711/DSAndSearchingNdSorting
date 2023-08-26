import java.util.*;
public class inverted_rotated_half_pyra {
    public static void print_inverted_half_rotated_pyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //to print spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            
            }
            // to print *
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void print_inverted_num_pyra(int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=(num-i)+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void print_Floyd_triangle(int num)
    {
        int counter=1;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(counter+" ");
                ++counter;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        print_inverted_half_rotated_pyramid(num);
        print_inverted_num_pyra(num);
        print_Floyd_triangle(num);
    }
}
