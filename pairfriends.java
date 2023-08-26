import java.util.*;

class pairfriends 
{
    public static int pairways(int n)
    {
        if(n==1 || n==2)
            return n;

            //single
            int fn1=pairways(n-1);

            //pair

            int fnpair=pairways(n-2);
            int ways= fn1 + (n-1)*fnpair;

        return ways;
    }   
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(pairways(n));
    }
}
