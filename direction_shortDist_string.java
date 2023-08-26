import java.util.*;
public class direction_shortDist_string {
    public static float short_dist(String str,int x1,int y1)
    {
        int x2=0,y2=0;
        for(int i=0;i<str.length();i++)
        {
            //north
            if(str.charAt(i)=='N')
                y2++;
            
            //south
            if(str.charAt(i)=='S')
                y2--;

            //west
            if(str.charAt(i)=='W')
                x2--;
            
            //east
            if(str.charAt(i)=='E')
                x2++;
        }
        
        double shrt_dist;
        shrt_dist=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return (float)shrt_dist;
    }

    public static void main(String args[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the direction string:");
        str=sc.nextLine();
        System.out.println("Enter the initial position as x and y :");
        int x1=sc.nextInt();
        int y1=sc.nextInt();

        System.out.println("Shortest distance="+short_dist(str,x1,y1));
    }
}
