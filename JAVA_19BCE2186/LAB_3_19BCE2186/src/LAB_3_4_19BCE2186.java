import java.util.Scanner;
class eat_roti
{
    int roti=10;
    synchronized void eat_roti(int roti) throws InterruptedException
    {
        System.out.println("Going to eat roti");
        if(this.roti<roti)
        {
            System.out.println("Less rotis so mom will cook more pls wait");
            wait();
        }

        this.roti-=roti;
        System.out.println("ATE THE ROTI !!!!!");
    }
    synchronized void prep(int roti)
    {
        System.out.println("Going to eat roti");
        this.roti+=roti;
        System.out.println("ATE THE ROTI ");
        notify();
    }
}
class LAB_3_4_19BCE2186 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        final eat_roti dd=new eat_roti();
        System.out.println("Number of rotis I am hungry for: ");
        int a= in.nextInt();
        System.out.print("\nNumber of rots mom have to cook again: ");
        int b=in.nextInt();
        new Thread(() -> {
            try {
                dd.eat_roti(a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() ->{try {
            dd.prep(b);
        } catch(Exception e) {
            System.out.println(e);
        }
        }).start();
    }
}