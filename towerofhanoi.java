public class towerofhanoi {

    public static void main(String args[])
    {
        int n=3;
        char src='A', aux='B', destn='C';
        solvetoh(n,src,aux,destn);
    }

    public static void solvetoh(int n, char src, char aux, char destn)
    {
        if(n==1)
        {
            System.out.println("move disk-1 from"+src+"to"+destn);
            return;
        }

        solvetoh(n-1, src, destn, aux);
        System.out.println("move disk-"+n+" from"+src+"to"+destn);
        solvetoh(n-1, aux, src, destn);
    }
    
}
