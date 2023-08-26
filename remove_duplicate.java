import java.util.*;
import java.util.Arrays;
public class remove_duplicate {
    
    public static String remv_dplct(StringBuilder sb,int i, String s, boolean alpha)
    {
        if(i==s.length())
            return sb.toString();
        int temp= s.charAt(i)-'a';
        if((int)(s.charAt(i)-'a')== alpha[temp])
        
         
    }
    
    public static void main(String args[])
    {
        StringBuilder sb= new StringBuilder();
        String s="aappanacollege";
        boolean alpha[]=new boolean[26];
        Arrays.fill(alpha,false);
        remv_dplct(sb, 0,s,alpha);
    }    
}
