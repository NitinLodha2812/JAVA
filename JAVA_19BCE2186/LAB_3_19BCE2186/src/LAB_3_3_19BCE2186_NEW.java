import java.util.Random;
class Total
{
    static int E1,E2,E3,E4,E5;
    static int array[]=new int[1000];
    static void reg_arr()
    {
        System.out.println("Reg started");
        Random r=new Random();
        for(int i=0;i<1000;i++)
        {
            Total.array[i]=r.nextInt(5)+1;
        }
        System.out.println("Reg ended");
    }
    synchronized void calc(int start,int end)
    {
        for(int i=start-1;i<end;i++)
        {
            if(Total.array[i]==1)
            {
                Total.E1++;
            }
            else if(Total.array[i]==2)
            {
                Total.E2++;
            }
            else if(Total.array[i]==3)
            {
                Total.E3++;
            }
            else if(Total.array[i]==4)
            {
                Total.E4++;
            }
            else
            {
                Total.E5++;
            }
        }
    }
}
class tot_thread extends Thread
{
    Total c;
    int start;
    int end;
    tot_thread(Total c,int start,int end)
    {
        this.c=c;
        this.start=start;
        this.end=end;
    }
    @Override
    public void run()
    {
        c.calc(start,end);
    }
}

public class LAB_3_3_19BCE2186_NEW
{
    public static void main (String[] args) {
        Total c1=new Total();
        Total.reg_arr();
        tot_thread tt1=new tot_thread(c1,1,124);
        tot_thread tt2=new tot_thread(c1,167,300);
        tot_thread tt3=new tot_thread(c1,327,445);
        tot_thread tt4=new tot_thread(c1,513,632);
        tot_thread tt5=new tot_thread(c1,646,779);
        tot_thread tt6=new tot_thread(c1,834,1000);

        System.out.println("Totaling of event Reg started");
        tt1.start();
        tt2.start();
        tt3.start();
        tt4.start();
        tt5.start();
        tt6.start();
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Totaling of event Reg ended\n");

        System.out.println("Regs for event E1 : "+Total.E1);
        System.out.println("Regs for event E2 : "+Total.E2);
        System.out.println("Regs for event E3 : "+Total.E3);
        System.out.println("Regs for event E4 : "+Total.E4);
        System.out.println("Regs for event E5 : "+Total.E5);

        System.out.println("\nNumber of students which are not reg for any event : "+(1000-Total.E1-Total.E2-Total.E3-Total.E4-Total.E5));
    }
}