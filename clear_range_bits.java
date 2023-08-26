import java.util.*;
public class clear_range_bits {
    public static int clear_inRange(int n,int i,int j)
    {
        int a,b;
        a=(~0)<<(j+1);
        b=(1<<i)-1;
        return n&(a|b);
    }

    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the n ,ith and jth to clear the ranged bits:");
        n=sc.nextInt();
        i=sc.nextInt();
        j=sc.nextInt();
        System.out.println("After the clearing the bits result="+clear_inRange(n, i, j));
    }
}
