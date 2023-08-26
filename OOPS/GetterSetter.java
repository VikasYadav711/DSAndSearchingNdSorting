public class GetterSetter {

    public static void main(String args[])
    {

        BankAccount b1= new BankAccount();
        b1.new_user("vikas");
        System.out.println(b1.User_name);
        b1.set_pswd("heelo");
        System.out.println(b1.get_pswd("heelo"));
        BankAccount b2=new BankAccount();
        b2.new_user("savy");
        System.out.println(b2.User_name);
        b2.set_pswd("hiiii");
        System.out.println(b2.get_pswd("hiiii"));
        // String n1,n2;
        // n1=b1.User_name;
        // n2=b2.User_name;
        // System.out.println(n1+" "+n2);

    }
        
}
    
    

class BankAccount
{
    public String User_name;
    private String Password;
    
    //here paswords can be stored in an array only;

    void set_pswd(String pswd)
    {
        Password=pswd;
        // System.out.println(Password);
    }

    void new_user(String usr_name)
    {
        User_name=usr_name;
    }    

    String get_pswd(String paswd)
    {
        return this.Password;
    }
}
