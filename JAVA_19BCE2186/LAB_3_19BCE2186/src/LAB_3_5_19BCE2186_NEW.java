import java.util.Random;
import java.util.Scanner;


class cars{
    int city_to_out;
    int out_to_city;

    synchronized void count_car(int n)
    {
        if(n==0)
        {
            city_to_out++;
            System.out.println("city_to_out count is " +city_to_out);
        }
        if(n==1)
        {
            city_to_out++;
            System.out.println("city_to_out count is "+city_to_out);
        }
        if(n==2)
        {
            city_to_out++;
            System.out.println("city_to_out count is "+city_to_out);
        }
        if(n==3)
        {
            out_to_city++;
            System.out.println("out_to_city count is "+out_to_city);
        }
        if(n==4)
        {
            out_to_city++;
            System.out.println("out_to_city count is "+out_to_city);
        }
    }
    synchronized void sig_cars()
    {
        if(city_to_out%10==0 && city_to_out !=0)
        {
            System.out.println("Cars can go out of city !!! green signal!!");
        }

        if(out_to_city%10==0 && out_to_city !=0)
        {
            System.out.println("cars can come in city !! green signal");

        }
        if(city_to_out%10!=0)
        {
            System.out.println("RED SIGNAL!!! WAIT FOR VEHICLES TO COME FROM THE CITY!!");
        }
        if(out_to_city%10!=0)
        {
            System.out.println("RED SIGNAL!!! WAIT FOR VEHICLES TO COME FROM THE OUTER!!");
        }

    }
}



public class LAB_3_5_19BCE2186_NEW {
    public static void main(String args[]){

        cars c1=new cars();
        int p;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of cases / cars: ");
        p=in.nextInt();

        for(int i=0;i<p;i++)
        {
            Random rd = new Random();
            int cases= rd.nextInt(5);
            switch(cases)
            {

                case 0:
                    new Thread(() -> {
                        c1.count_car(0);
                        c1.sig_cars();

                    }).start();
                    break;

                case 1:
                    new Thread(() -> {
                        c1.count_car(1);
                        c1.sig_cars();

                    }).start();
                    break;
                case 2:
                    new Thread(() -> {
                        c1.count_car(2);
                        c1.sig_cars();

                    }).start();
                    break;
                case 3:
                    new Thread(() -> {
                        c1.count_car(3);
                        c1.sig_cars();

                    }).start();
                    break;
                case 4:
                    new Thread(() -> {
                        c1.count_car(4);
                        c1.sig_cars();

                    }).start();
                    break;
            }
        }

    }
}