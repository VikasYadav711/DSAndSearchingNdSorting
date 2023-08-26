public class samecharsubstr {


    public static String substr(String s,int start, int end)
    {

        if(start==end)
            return "";

        return s.charAt(start)+ substr(s,start+1,end);
    }

    public static void main(String args[])
    {
        System.out.println(substr("aba", 0, 3));
    }


}
/*
 
    public static void samecharstr(int n, String str, StringBuilder current)
    {
        int start=str.length();
        
        for(int i=start;i<)
        samecharstr(n+1, str, newstr+str.charAt(n));
        samecharstr(n+1, str, newstr);
    }
    
    public static void main(String args[])
    {
        StringBuilder current= new StringBuilder();
        samecharstr(0, "abcab", current);
    }
}


*/
/* 
public class samecharsubstr {

    public static void samecharstr(int n, String str, String newstr)
    {
        if(n==str.length())
        {
           
            System.out.println(newstr);
           // System.out.println(newstr.charAt(0)+" "+newstr.charAt(newstr.length()-1));
            return;
        }
        
        samecharstr(n+1, str, newstr+str.charAt(n));
        samecharstr(n+1, str, newstr);
    }
    
    public static void main(String args[])
    {
        samecharstr(0, "abcab", "");
    }
}

/*
public class samecharsubstr {

    public static int samecharstr(int n, String str, String newstr, int count)
    {
        if(n==str.length()-1)
        {
            int num=newstr.length();
            String temp="",temp2="";
            if(num>0){
            temp+=newstr.charAt(0);
            temp2+=newstr.charAt(num-1);
            if(temp.equals(temp2))
            {
                return count+1;
            }
        }
            System.out.println(newstr);
            
        }
        
        samecharstr(n+1, str, newstr+str.charAt(n),count);
        samecharstr(n+1, str, newstr,count);
        return count;
        
    }
    
    public static void main(String args[])
    {
        System.out.println(samecharstr(0, "abcab", "",0));
    }
}
 */
/* 
public class samecharsubstr {

    public static void samecharstr(int n, String str, String newstr)
    {
        if(n==str.length()-1)
        {
           
            System.out.println(newstr);
            return;
        }
        
        samecharstr(n+1, str, newstr+str.charAt(n));
        samecharstr(n+1, str, newstr);
    }
    
    public static void main(String args[])
    {
        samecharstr(0, "abcab", "");
    }
}
*/