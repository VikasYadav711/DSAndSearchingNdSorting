
class removeduplicate
{
    public static void remv(String str, StringBuilder sb,boolean map[],int idx)
    {
        if(idx==str.length())
        {
            System.out.println(sb);
            return;
        }
        
          
        char ch= str.charAt(idx);  

        if(map[ch-'a']==false)
        {
            sb.append(ch);
            map[ch-'a']=true;
            remv(str,sb,map,idx+1);
        }
        else
        {
            remv(str,sb,map,idx+1);
        }

    }

    public static void main(String args[])
    {
        String str="appnncollege";
        remv(str, new StringBuilder(""),new boolean[26], 0);
    }
}