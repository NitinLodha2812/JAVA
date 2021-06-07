import java.util.Scanner;

public class EXP_3_19BCE2186{
    public static void main(String[] args) {
        summervacation sum_v1=new summervacation();
        summervacation sum_v2=new summervacation();
        sum_v1.getmethod();
        System.out.println();
        sum_v1.printmethod();
        summervacation.cost(sum_v1);
        System.out.println();
        sum_v2.getmethod();
        System.out.println();
        sum_v2.printmethod();
        summervacation.cost(sum_v2);
    }

}

class vacation{
    String place,date,activity[];

    int activity_cost[],n;

    void getmethod()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Place:");
        place=in.nextLine();
        System.out.println("Enter Date:");
        date=in.nextLine();
        System.out.println("number of activities:");
        n=in.nextInt();
        activity=new String[n];
        activity_cost=new int[n];
        System.out.println(" Activities:");
        for(int i=0;i<n;i++)
        {
            activity[i]=in.next();
        }
        System.out.println("Enter Cost for activities:");
        for(int i=0;i<n;i++)
        {
            activity_cost[i]=in.nextInt();
        }
    }

    void printmethod()
    {
        System.out.println("Place: "+place);
        System.out.println("Date: "+date);
        System.out.println("Activities and their cost : ");
        for(int i=0;i<n;i++)
        {
            System.out.println((i+1)+" activity "+activity[i]+" cost's "+activity_cost[i]);
        }
    }
}


class summervacation extends vacation{
    String course[],platform[],duration[];
    int course_cost[],n1;

    @Override
    void getmethod()
    {
        Scanner in=new Scanner(System.in);
        super.getmethod();
        System.out.println("Enter number of Courses:");
        n1=in.nextInt();
        course=new String[n1];
        course_cost=new int[n1];
        platform=new String[n1];
        duration=new String[n1];
        System.out.println("Enter Course Titles:");
        for(int i=0;i<n1;i++)
        {
            course[i]=in.next();
        }
        System.out.println("Online Platforms:");
        for(int i=0;i<n1;i++)
        {
            platform[i]=in.next();
        }
        System.out.println("Enter the duration:");
        for(int i=0;i<n1;i++)
        {
            duration[i]=in.next();
        }
        System.out.println("Enter the cost of courses:");
        for(int i=0;i<n1;i++)
        {
            course_cost[i]=in.nextInt();
        }
    }
    @Override
    void printmethod()
    {
        super.printmethod();
        System.out.println("Course Titles: ");
        for(int i=0;i<n1;i++)
        {
            System.out.println(course[i]);
        }
        System.out.println("Online Plateform :");
        for(int i=0;i<n1;i++)
        {
            System.out.println(platform[i]);
        }
        System.out.println("durationation of Courses :");
        for(int i=0;i<n1;i++)
        {
            System.out.println(duration[i]);
        }
    }

    static void cost(summervacation sV)
    {
        int sum1=0,sum2=0,s;
        for(int i=0;i<sV.n;i++)
        {
            sum1=sum1+sV.activity_cost[i];
        }
        for(int i=0;i<sV.n1;i++)
        {
            sum2=sum2+sV.course_cost[i];
        }
        s=sum1+sum2;
        System.out.println("Total Cost of courses you Opt is: "+s);
    }
}
