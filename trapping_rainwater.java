import java.util.*;
public class trapping_rainwater {

    //Making method to store max boundararies to use them while finding trapped rainwater.
    //  Inside method the comments are done to replace the code length with shorter method/process.
    public static void boundaries(int height[],int size,int rt_max_bound[],int lft_max_bound[])
    {
        lft_max_bound[0]=height[0];
        for(int i=1;i<size;i++)
        {
            lft_max_bound[i]= Math.max(height[i],lft_max_bound[i-1]);
            // if(height[i]>lft_max_bound[i-1])
            //     lft_max_bound[i]=height[i];
            // else
            //     lft_max_bound[i]=lft_max_bound[i-1];
        }

        rt_max_bound[size-1]=height[size-1];
        for(int i=size-2;i>=0;i--)
        {
        //     if(height[i]>rt_max_bound[i+1])
        //         rt_max_bound[i]=height[i];
        //     else
        //         rt_max_bound[i]=rt_max_bound[i+1];
            rt_max_bound[i]= Math.max(rt_max_bound[i+1],height[i]);
        }
        
    }
    
    public static int trapped_rainwater(int height[],int size, int rt_max_bound[],int lft_max_bound[])
    {
        int water_level=0,trapped_water=0;
        for(int i=0;i<size;i++)
        {
            water_level=Math.min(rt_max_bound[i],lft_max_bound[i]);
            trapped_water+=water_level-height[i];
        }
        return trapped_water;
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the no.of Levels:");
        size=sc.nextInt();
        int height[]=new int[size];
        int rt_max_bound[]=new int[size];
        int lft_max_bound[]=new int[size];

        System.out.println("Enter the levels");
        for(int i=0;i<size;i++)
        {
            height[i]=sc.nextInt();
        }
        boundaries(height, size,rt_max_bound,lft_max_bound);
        System.out.println("Right max Boundaries at different levels:");
        for(int i=0;i<size;i++)
        {
            System.out.print(rt_max_bound[i]+" ");
        }
        System.out.println();
        System.out.println("Left max Boundaries at different levels:");
        for(int i=0;i<size;i++)
        {
            System.out.print(lft_max_bound[i]+" ");
        }
        System.out.println();
        int res=trapped_rainwater(height, size, rt_max_bound, lft_max_bound);
        System.out.println("The trapped rainwater="+res);
    }
}
