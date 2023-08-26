import java.util.*;

public class bin_coeff {
    public static int fact(int num)
    {
        int f=1;
        for(int i=1;i<=num;i++)
        {
            f*=i;
        }
        return f;
    } 
    public static int BinoC(int n,int r)
    {
        int n_fact,r_fact,n_r_fact,result;

        n_fact=fact(n);
        r_fact=fact(r);
        n_r_fact=fact(n-r);
        result= n_fact/(r_fact*n_r_fact);

        return result;
    }   

    public static void main(String args[])
    {
        int n,r,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n and r to find binomial coefficient:");
        n=sc.nextInt();
        r=sc.nextInt();

        result=BinoC(n,r);
        System.out.println("Result of Binomial coefficient "+result);
    }
}
