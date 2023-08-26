import java.util.*;
public class Buy_sell {
    public static int max_profit(int prices[],int size)
    {
        int buy_price=Integer.MAX_VALUE,mx_prft=0;

        for(int i=0;i<size;i++)
        {
            if(buy_price<prices[i])
            {
                int temp;
                temp=prices[i]-buy_price;
                mx_prft=Math.max(mx_prft, temp );
            }
            if(buy_price>prices[i])
            {
                buy_price=prices[i];
            }
        }
        return mx_prft;
    }
    public static void main(String args[])
    {
        int price_set;
        
        System.out.println("Enter the number of priceset:");
        Scanner sc=new Scanner(System.in);
        price_set=sc.nextInt();
        int prices[]=new int[price_set];
        System.out.println("Enter the prices:");
        for(int i=0;i<price_set;i++)
        {
            prices[i]=sc.nextInt();
        }
        System.out.println("Max Profit="+max_profit(prices, price_set));
        
    }
}
