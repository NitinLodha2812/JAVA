import java.util.Random;
public class LAB_3_3_19BCE2186 {
    public static void main(String[] args) {
        Random r =new Random();
        int[] array = new int [1000];
        for(int i=0;i<500;i++){
            array[i]=r.nextInt(6);
            System.out.println(array[i]);
        }
        Reg_19BCE2186 o = new Reg_19BCE2186(array);
        Thread t1 =new Thread(){
            public void run(){o.total(1);}
        };
        Thread t2 =new Thread(){
            public void run(){o.total(2);}
        };
        Thread t3 =new Thread(){
            public void run(){o.total(3);}
        };
        Thread t4 =new Thread(){
            public void run(){o.total(4);}
        };
        Thread t5 =new Thread(){
            public void run(){o.total(5);}
        };
        Thread t6 = new Thread(){
            public void run(){
                o.total(0);
                o.display();}
        };
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
class Reg_19BCE2186{
    int[] array;
    Reg_19BCE2186(int[] array){
        this.array=array;
    }
    int noreg;
    int total;
    int E1;
    int E2;
    int E3;
    int E4;
    int E5;
    synchronized void total(int x){
        for(int i=0;i<999;i++){
            switch(array[i]){
                case(0):
                    noreg++;
                case 1 :
                    E1++;
                    total++;
                    break;
                case 2:
                    E2++;
                    total++;
                    break;
                case 3 :
                    E3++;
                    total++;
                    break;
                case 4 :
                    E4++;
                    total++;
                    break;
                case 5 :
                    E5++;
                    total++;
                    break;
            }
        }
    }
    public void display(){
        System.out.println("The no. of students that have registered for event 1 is: "+E1);
        System.out.println("The no. of students that have registered for event 2 is: "+E2);
        System.out.println("The no. of students that have registered for event 3 is: "+E3);
        System.out.println("The no. of students that have registered for event 4 is: "+E4);
        System.out.println("The no. of students that have registered for event 5 is "+E5);
        System.out.println("The total number of students are: " + total);
        System.out.println("The no. of students who have not registered for any event are: "+noreg);
    }
}