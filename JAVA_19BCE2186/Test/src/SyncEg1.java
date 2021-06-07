
//wait, notify, notifyAll - non static method - object class
class Bank{
    int bal;
    Bank(){
        bal=10000;
    }
    synchronized void debit(int amt){//20000
        if(amt<bal){
            bal=bal-amt;
            System.out.println("Amt debited");
        }
else
        {
            System.out.println("Bal insufficient");
            try{
                wait();//object class
            }
catch(Exception e){
    System.out.println("The exception is " +e);
        }
        }
    }
    synchronized void credit(int amt){//25000
        bal=bal+amt;
        System.out.println("amt credidted successfully");
        notifyAll();//notifyAll();
//t1 t2 t3 t4
    }
}
public class SyncEg1 {
    public static void main(String args[]){
//communicate
//class - dm - meth1[wait], meth2[notifyAll]
//runnable state - non runnable state
//bank [10000]- debit[20000]-credit[10000]
//acc
//thread 1 - sync meth1
//thread 2 - sync meth2
//wait - releases
//notify
//notifyAll
        Bank BC1=new Bank();//bal=10000
//two ways of creating thread instance
//anonymous thread
        new Thread(() -> {
            BC1.debit(10000);
            System.out.println("bal is "+BC1.bal);
        }).start();
        System.out.println("bal is "+BC1.bal);
        new Thread(() -> {
            BC1.credit(50000);
            System.out.println("bal is "+BC1.bal);
        }).start();
        System.out.println("bal is "+BC1.bal);
    }
}

