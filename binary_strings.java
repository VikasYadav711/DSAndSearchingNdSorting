public class binary_strings {

    public static void strprint(int n, String str, int lastPlace)
    {

        if(n==0)
        {
            System.out.println(str);
            return;
        }

        strprint(n-1, str+"0", 0);
        if(lastPlace==0)
        {
            strprint(n-1, str+"1", 1);
            
        }
        // if(n==0)
        // {
        //     System.out.println(str);
        //     return;
        // }
        // if(lastPlace==0)
        // {
        //     str+="0";
        //     strprint(n-1, str, lastPlace=0);
        //     str+="1";
        //     strprint(n-1, str, lastPlace=1);
        // }
        // else
        // {
        //     str+="0";
        //     strprint(n-, str, lastPlace=0);
        // }
        
        // String temp="";
        // temp+=str.charAt(n-1);
        // if(prev!="1" && temp!="1")
        // {
        //     prev="";
        //     prev+=temp;
        //     res+=temp;
        //     strprint(n-1, str, prev,res); 
        // }

        // else
        //  strprint(n-1, str, prev, res);
    }
    
    public static void main(String args[])
    {
        strprint(3,"", 0);
    }
}
