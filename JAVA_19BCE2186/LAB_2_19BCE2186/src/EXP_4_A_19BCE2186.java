import java.util.Scanner;
abstract class vacation2{
    String place, date;
    String act[] = new String[2];
    static int cost[] = new int[2];
    Scanner in = new Scanner(System.in);
    void getMethod(int i) {
        System.out.println("Entry "+(i+1));
        
        System.out.print("/n Enterplace : ");
       place=in.nextLine();
        System.out.print("/n Enter date : ");
        date=in.next();
       in.nextLine();
        System.out.print("Enter Activity : ");
        act[i]=in.nextLine();
        System.out.print("Enter Cost : ");
        cost[i]=in.nextInt();
    }
    abstract void printMethod(int i);
}
class summervacation2 extends vacation2{
    String cor_title;
    String on_pltm;
    int dur;
    void GetCourse(int i) {
        getMethod(i);
       in.nextLine();
        System.out.print("Enter Course Title : ");
        cor_title=in.nextLine();
        System.out.print("Enter Online Platform : ");
        on_pltm=in.nextLine();
        System.out.print("Enter dur of course (hrs) : ");
        dur=in.nextInt();
    }
    @Override
    void printMethod(int i) {
        System.out.println("Place : "+place);
        System.out.println("Cost : "+cost[i]);
        System.out.println("Activity : "+act[i]);
        System.out.println("date : "+date);
        
    }
    void printCourse(int i) {
        printMethod(i);
        System.out.println("Course Title : "+cor_title);
        System.out.println("dur : "+dur);
        System.out.println("Online Platform : "+on_pltm);
    }
    static void Total() {
        int total_amt=cost[0]+cost[1];
        System.out.println("The total cost is : "+total_amt);
    }
}
public class EXP_4_A_19BCE2186{
    public static void main(String[] args) {
        summervacation2 sV1 = new summervacation2();
        summervacation2 sV2 = new summervacation2();
        sV1.GetCourse(0);
        sV2.GetCourse(1);
        sV1.printCourse(0);
        sV2.printCourse(1);
        summervacation2.Total();
    }

}