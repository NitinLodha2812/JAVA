import java.util.Random;

class cars_count extends Thread {
    int count,count1;
    cars_count(){
        count=9;
    }
    synchronized void city_to_outer(int ct){
        if(count<ct){
            System.out.println("car can pass from city to outer");

        }

        else{
            System.out.println("wait for more cars from city!!");

            try{
                Thread.sleep(5);
                wait();
                count =15;
                notifyAll();
            }
            catch (Exception e){
                System.out.println("exception "+e);
            }
        }
    }
    synchronized void outer_to_city(int ct1){
        if(count<ct1){
            System.out.println("car can pass from outer to city");

        }

        else{
            System.out.println("wait for more cars from outer!!");

            try{
                System.out.println("waiting for cars from outer!!");
                wait();
                count1=11;
                notifyAll();
            }
            catch (Exception e){
                System.out.println("exception "+e);
            }
        }
    }

}


public class LAB_3_5_19BCE2186 {
    public static void main(String args[]){
        cars_count c1=new cars_count();
        Random rd = new Random(); //instance of random class
        int upperbound = 15;
        int upperbound1= 11;
        //generate random values from 0-15
        int ct= rd.nextInt(upperbound);
        int ct1=rd.nextInt(upperbound1);


        new Thread(() -> {
            c1.city_to_outer(ct);
            if(ct>=10) {
                System.out.println("all cars pass to outer");
            }
            else{

                    System.out.println("Wait for more cars!!!");

            }
        }).start();
        new Thread(() -> {
            c1.outer_to_city(ct1);
            if(ct1>=10) {
                System.out.println("all cars pass to city");
            }
            else{
                System.out.println("Wait for more cars!!!");
            }
        }).start();
    }
}
