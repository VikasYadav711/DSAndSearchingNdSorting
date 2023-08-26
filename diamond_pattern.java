import java.util.*;
public class diamond_pattern {
    public static void diamond_pat(int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        for(int i=num;i>=1;i--)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
      
    }

    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        diamond_pat(num);
    }
}
