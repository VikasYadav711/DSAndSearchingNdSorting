import java.util.*;
//import java.lang.Math;
public class dec_bin {
    public static double dec_conv(int num)
    {
        double bin=0,a=10,p=0;
        while(num>0)
        {
            bin=bin+((num%2)*Math.pow(a, p));
            p+=1;
            num=num/2;
        }
        return bin;
    }

    public static void main(String args[])
    {
        int num;
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        System.out.println((int)dec_conv(num));
    }
}
