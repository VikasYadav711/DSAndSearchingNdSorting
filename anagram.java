import java.util.Arrays;
import java.util.*;
public class anagram
{
    public static boolean check_ana(String str1, String str2)  //using inbuilt functions
    {
        char char_arr1[]=str1.toCharArray();
        char char_arr2[]=str2.toCharArray();
        Arrays.sort(char_arr1);
        Arrays.sort(char_arr2);
        

        return Arrays.equals(char_arr1,char_arr2);
    }   
    
    public static boolean manually_check_ana(String str1, String str2)
    {
        int count=0;
        if(str1.length()==str2.length())
        {
            for(int i=0;i<str1.length();i++)
            {
                for(int j=0;j<str1.length();j++)
                {
                    char temp1,temp2;
                    temp1=str1.charAt(i);
                    temp2=str2.charAt(j);
                    if(temp1==temp2)
                    {
                        count++;
                        break;
                    }
                }
            }
            System.out.println(count);
            if(count==str1.length())
                return true;
        }
        return false;
    }
    
    public static void main(String args[])
    {
        String str1,str2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the strings str1 and str2 to check anagram:");
        str1=sc.nextLine();
        str2=sc.nextLine();
        System.out.println(check_ana(str1, str2));
        System.out.println(manually_check_ana(str1, str2));
    }
}
