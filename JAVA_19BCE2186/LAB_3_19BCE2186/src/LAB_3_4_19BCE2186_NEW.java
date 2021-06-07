class Roti{
    int roti=10;                                  //we have set the capacity of                                              vessel as 10. The vessel can have                                           10 roti at the maximum.

    synchronized void withdraw(int roti){         //this method notifies about                                                 taking roti so that it is known                                             that roti is going to be taken.

        System.out.println("going to take roti...");  /*notifying about taking roti                                             from the vessel*/


        if(this.roti<roti){
            System.out.println("Less roti; waiting for roti...");
            try{wait();}catch(Exception e){}              //this is the block to throw and                 catch exception about roti being eaten and vessel being                    empty.
        }
        this.roti-=roti;
        System.out.println("roti eaten...");
    }

    synchronized void deposit(int roti){     //this method is used to add roti and                                         also notifies that roti is                                        going to be added.
        System.out.println("preparing roti and adding...");
        this.roti+=roti;                         //adding roti here.
        System.out.println("roti added in the vessel... ");  //after adding the roti in                                                 the vessel, message is sent
        notify();
    }
}

public class LAB_3_4_19BCE2186_NEW{
    public static void main(String args[]){
        final Roti c=new Roti();                  //creating object of class Roti.
        //whenever the number of roti in the vessel is less than the number of roti needed, exception is thrown.
        new Thread(() -> c.withdraw(12)).start();
        new Thread(() -> c.deposit(10)).start();

    }}