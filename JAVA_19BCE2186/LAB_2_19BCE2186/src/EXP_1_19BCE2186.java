import java.util.Scanner;

public class EXP_1_19BCE2186 {
    public static void main(String[] args) {
        Participants obj[]=new Participants[3];
        for (int i=0;i<3;i++)
        {
            obj[i]=new Participants();
            obj[i].getInput();
        }
        Participants.display(obj);
    }

}
class Participants{
    String name,branch,university,tr;
    String phno;
    Scanner in= new Scanner(System.in);

    void getInput()
    {
        
        System.out.println("Enter Student TestResult Classification[L1,L2,L3,L4,L5]: ");
        tr=in.nextLine();
    }

    static void display(Participants obj[])
    {
        int len=obj.length;
        for (int i=0;i<len;i++)
        {
            switch(obj[i].tr)
            {
                case "L1":
                    System.out.println("Intern and full time job have been offered to you");
                    break;
                case("L2"):
                    System.out.println("You have been selected for Full time internship and Job offer based on performance");
                    break;
                case("L3"):
                    System.out.println("You have been selected for Full time internship and Job offer based on performance");
                    break;
                case("L4"):
                    System.out.println("You have been selected for Internship for 21 days");
                    break;
                case("L5"):
                    System.out.println("You have been selected for Internship for 21 days");
                    break;
                default:
                    System.out.println("Please enter correct input");
            }
        }
    }
}

