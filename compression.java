import java.util.*;
public class compression
{
    public static StringBuilder compress_str(String str)
    {
        Integer count=1;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            
            if((i+1)<str.length() && str.charAt(i)==str.charAt(i+1) )
            {
                count++;
                 continue;
            }
            sb.append(str.charAt(i));
            sb.append(count.toString());
            count=1;
        }
        return sb;
    }    

    public static void main(String args[])
    {
        String str;
        Scanner sc=new Scanner( System.in);
        System.out.println("Enter the string to compress");
        str=sc.nextLine();
        System.out.println(compress_str(str));
    }
}
