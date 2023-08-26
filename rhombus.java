import java.util.*;
public class rhombus {
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
        print_rhombus(num);
    }
}
