public class recuNumtoString {

    public static void printString(int num, StringBuilder sb)
    {
        if(num==0)
        {
            System.out.println(sb.toString());
            return;
        }

        
        switch(num%10)
        {
            case 1: sb.insert(0,"one "); break;
            case 2: sb.insert(0,"two "); break;
            case 3: sb.insert(0,"three "); break;
            case 4: sb.insert(0,"four "); break;
            case 5: sb.insert(0,"five "); break;
            case 6: sb.insert(0,"six "); break;
            case 7: sb.insert(0,"seven "); break;
            case 8: sb.insert(0,"eight "); break;
            case 9: sb.insert(0,"nine "); break;
            case 0: sb.insert(0,"zero "); break;
        }
        printString(num/10, sb);
    }
    
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("");
        printString(1960, sb);
    }
}
