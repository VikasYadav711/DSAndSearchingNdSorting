public class Oops_eg {
    public static void main(String args[]) {
    
        Pen p1=new Pen();
        p1.set_color("Blue");
        p1.set_tip(2);
        System.out.println("Pen color:"+p1.color);
        System.out.println("Tip size"+p1.tip);

        Student s1=new Student();
        s1.set_name("Vikas");
        s1.set_age(23);
        s1.result(48, 39, 050);
        System.out.println("Student name:"+s1.name);
        System.out.println("Student age:"+s1.age);
        System.out.println("Student result:"+s1.percentage);
    }
    
}

class Pen
{
    int tip;
    String color;

    void set_color(String newColour)
    {
        color=newColour;
    }

    void set_tip(int newtip)
    {
        tip=newtip;
    }
}

class Student
{
    int age;
    String name;
    float percentage;

    void set_name(String stuName)
    {
        name=stuName;
    }

    void set_age(int stuAge)
    {
        age=stuAge;
    }

    void result(int ph, int ch, int mt)
    {
        percentage= ((ph+ch+mt)*100)/300;
    }
}