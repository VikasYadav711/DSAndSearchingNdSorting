import java.util.*;
public class hollow_rhombus {
    public static void print_rhombus(int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=num;j++)
            {
                if(j==1|| j==num || i==1 || i==num)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            
        }
    }
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        print_rhombus(num);
    }
}
