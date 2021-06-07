import java.util.Scanner;

public class EXP_2_19BCE2186 {
    public static void main(String[] args){
        String name,regno;
        Scanner obj = new Scanner(System.in);
        courses cor[]=new courses[4];
        for (int i=0;i<4;i++)
        {
            cor[i]=new courses();
        }
        for (int i=0;i<4;i++)
        {
            cor[i].getmethod();
        }
        for (int i=0;i<4;i++)
        {
            cor[i].printmethod();
        }
        System.out.println("All courses are present");
        student s1=new student();
        System.out.println("Enter 1st Subject:");
        cor[0].getmethod();
        System.out.println("Enter 2nd Subject:");
        cor[1].getmethod();
        while(true)
        {
            if (cor[0].slot.equals(cor[1].slot))
            {
                System.out.println("Slots Clashed !! enter 2nd again: ");
                cor[1].getmethod();
            }
            else
            {
                break;
            }
        }
        s1.print(s1);
        cor[0].printmethod();
        cor[1].printmethod();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        name=in.nextLine();
        System.out.println("Enter Student Registration Number:");
        regno=in.nextLine();
        student s2=new student(name,regno);
        System.out.println("Enter 1st Subject:");
        cor[0].getmethod();
        System.out.println("Enter 2nd Subject:");
        cor[1].getmethod();
        while(true)
        {
            if (cor[0].slot.equals(cor[1].slot))
            {
                System.out.println("Slots Clashed enter!! 2nd sub again:");
                cor[1].getmethod();
            }
            else
            {
                break;
            }
        }
        s2.print(s2);
        cor[0].printmethod();
        cor[1].printmethod();
    }

}

class student{
    Scanner in = new Scanner(System.in);
    String regno,name;
    static String university="VIT VELLORE";
    static int c=0;
    student()
    {
        System.out.println("Enter Student Name:");
        name=in.nextLine();
        System.out.println("Enter Student Registration Number:");
        regno=in.nextLine();
    }
    student(String name,String regno)
    {
        this.name=name;
        this.regno=regno;
    }

    void print(student s)
    {
        System.out.println("Student Name: "+ name);
        System.out.println("Student Name: "+ regno);
        System.out.println("Student Name: "+ s.university);
    }

}


class courses{
    String course_code,course_name,venue,slot;
    Scanner in = new Scanner(System.in);
    void getmethod()
    {
        System.out.println("Enter the Course Name:");
        course_name=in.nextLine();
        System.out.println("Enter the Course Code:");
        course_code=in.nextLine();
        System.out.println("Enter the Venue:");
        venue=in.nextLine();
        System.out.println("Enter the Slot:");
        slot=in.nextLine();
    }

    void printmethod()
    {
        System.out.print("Course Name: "+course_name);
        System.out.println();
        System.out.print("Course Code: "+course_code);
        System.out.println();
        System.out.print("Slot: "+slot);
        System.out.println();
        System.out.print("Venue: "+venue);
        System.out.println();
    }
}

