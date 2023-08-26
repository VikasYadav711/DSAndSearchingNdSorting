import java.math.*;
import java.util.*;
public class binary_to_dec 
{
    public static double binary_to_dec(int num)
    {
        double a=2,i=0,dec=0;
        while(num>0)
        {
            
            dec=dec+((num%10)*(Math.pow(a,i)));
            i=i+1;
            num=num/10;
        }
        return dec;
    }    
    public static void main(String args[])
    {
        int num;
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        System.out.println((int)binary_to_dec(num));
    }
}
