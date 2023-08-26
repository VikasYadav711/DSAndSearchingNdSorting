
public class recuStrlen {

    public static void printlen(int count, String str, String newstr)
    {
        if(str.equals(newstr))
        {
            System.out.println(count);
            return;
        }
        printlen(count+1, str, newstr+str.charAt(count));
    
    }
    

    
    public static void main(String args[])
    {
        printlen(0, "abcab","");
    }
}

/* 
public class recuStrlen {

    public static void printlen(int count, String str, String newstr)
    {
        try{
        // if(newstr==str)
        // {
        //     System.out.println(count);
        //     return;
        // }

        printlen(count+1, str, newstr+str.charAt(count));
    
    }
    catch(StringIndexOutOfBoundsException e)
    {
        System.out.println(count);
    }
}
    
    public static void main(String args[])
    {
        printlen(0, "abcab","");
    }
}

*/

/*
public class recuStrlen {

    public static int printlen(int count, String str, String newstr)
    {
        


        newstr=newstr+str.charAt(count);
        System.out.println(newstr+" "+count);
        printlen(count+1, str, newstr);
        if(str==newstr)
        {
           // System.out.println(count);
            return count;
        }
        return count;
    }
    
    public static void main(String args[])
    {
        System.out.println(printlen(0,"abcab","")); //       printlen(0, "abcab","");
    }
}
 */