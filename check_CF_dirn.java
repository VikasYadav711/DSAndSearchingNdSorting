

import java.util.Scanner;
public class check_CF_dirn {
    

    //package CodeForces;


    public static void main(String args[])
    {
        int x=0,y=0,t,ch_num;
        Scanner sc =new Scanner(System.in);
        String s;
        t=sc.nextInt();
        boolean check=false;

        while(t>0)
        {              
            ch_num=sc.nextInt();
            s= sc.next();
            
            for(int i=0;i<ch_num;i++)
            {
                //up
                if(s.charAt(i)=='U')
                {
                    y++;
                    if(x==1 && y==1)
                        check=true;
                    
                }
            
                //down
                if(s.charAt(i)=='D')
                {
                    y--;
                    if(x==1 && y==1)
                        check=true;
                    
                }
                //right
                if(s.charAt(i)=='R')
                {
                    x++;
                    if(x==1 && y==1)
                        check=true;
                    
                }
            
                //left
                if(s.charAt(i)=='L')
                {
                    x--;
                    if(x==1 && y==1)
                        check=true;
                    
                }
               
                
            }
            boolean temp=true;
            if(check==temp)
                System.out.println("Yes");
            else
                System.out.println("No");

                t=t-1;
        }
    }

       
}


