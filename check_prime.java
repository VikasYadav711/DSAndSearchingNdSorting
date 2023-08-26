import java.util.*;
import java.lang.Math;
public class check_prime {
    public static boolean check_prime(int num)
    {
        if(num==2)
            return true;

        for(int i=2;i<Math.sqrt(num);i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static void main(String args[])
    {
        int num;
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        System.out.println(check_prime(num));
        
    }
    
}
