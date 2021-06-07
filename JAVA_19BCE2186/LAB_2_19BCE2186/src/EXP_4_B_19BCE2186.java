import java.util.Scanner;

interface parent{
    void getMethod();
    void printMethod();
}

class vacation1 implements parent{
    String place,date,activities[];

    int activities_cost[],n;
    @Override
    public void getMethod() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Place:");
        place=in.nextLine();
        System.out.println("Enter Date:");
        date=in.nextLine();
        System.out.println("Enter number of activities:");
        n=in.nextInt();
        activities=new String[n];
        activities_cost=new int[n];
        System.out.println("Enter the Activities:");
        for(int i=0;i<n;i++)
        {
            activities[i]=in.next();
        }
        System.out.println("Enter Cost of activities:");
        for(int i=0;i<n;i++)
        {
            activities_cost[i]=in.nextInt();
        }
    }

    @Override
    public void printMethod() {
        System.out.println("Place: "+place);
        System.out.println("Date: "+date);
        System.out.println("Activities and there respective cost which you Opt are given below--");
        for(int i=0;i<n;i++)
        {
            System.out.println((i+1)+" activity "+activities[i]+" its cost "+activities_cost[i]);
        }
    }
}

class summerVacation1 extends vacation1 implements parent{
    String course[],platform[],dur[];
    int course_cost[],n1;

    @Override
    public void getMethod() {
        Scanner in=new Scanner(System.in);
        super.getMethod();
        System.out.println("Enter the number of Courses:");
        n1=in.nextInt();
        course=new String[n1];
        course_cost=new int[n1];
        platform=new String[n1];
        dur=new String[n1];
        System.out.println("Enter the Course Titles:");
        for(int i=0;i<n1;i++)
        {
            course[i]=in.next();
        }
        System.out.println("Online Platforms:");
        for(int i=0;i<n1;i++)
        {
            platform[i]=in.next();
        }
        System.out.println("Duration in weeks:");
        for(int i=0;i<n1;i++)
        {
            dur[i]=in.next();
        }
        System.out.println("cost of courses:");
        for(int i=0;i<n1;i++)
        {
            course_cost[i]=in.nextInt();
        }

    }

    @Override
    public void printMethod() {
        super.printMethod();
        System.out.println("Course Titles: ");
        for(int i=0;i<n1;i++)
        {
            System.out.println(course[i]);
        }
        System.out.println("Online Platform :");
        for(int i=0;i<n1;i++)
        {
            System.out.println(platform[i]);
        }
        System.out.println("Duration of Courses :");
        for(int i=0;i<n1;i++)
        {
            System.out.println(dur[i]);
        }

    }
    static void cost(summerVacation1 sV)
    {
        int sum1=0,sum2=0,s;
        for(int i=0;i<sV.n;i++)
        {
            sum1=sum1+sV.activities_cost[i];
        }
        for(int i=0;i<sV.n1;i++)
        {
            sum2=sum2+sV.course_cost[i];
        }
        s=sum1+sum2;
        System.out.println("Total Cost of courses you chose is: "+s);
    }
}




public class EXP_4_B_19BCE2186 {
    public static void main(String[] args){
        summerVacation1 sum_vac1=new summerVacation1();
        summerVacation1 sum_vac2=new summerVacation1();
        sum_vac1.getMethod();
        System.out.println();
        sum_vac1.printMethod();
        summerVacation1.cost(sum_vac1);
        System.out.println();
        sum_vac2.getMethod();
        System.out.println();
        sum_vac2.printMethod();
        summerVacation1.cost(sum_vac2);
    }
}