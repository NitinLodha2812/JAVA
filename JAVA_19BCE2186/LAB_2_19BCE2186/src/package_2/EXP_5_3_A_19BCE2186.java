package package_2;

import package_1.LockDownActivity;

import java.util.Scanner;

class IndoorSportActivities extends LockDownActivity {
    int n;
    String s;
    public void getData(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n=in.nextInt();
        System.out.print("Enter the value of s: ");
        s=in.next();
    }
    public void printData(){
        System.out.println("Entered the value of n: "+n);
        System.out.println("Entered the value of s: "+s);
    }
}
class OnlineActivities extends LockDownActivity {
    int n;
    String s;
    public void getData(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n=in.nextInt();
        System.out.print("Enter the value of s: ");
        s=in.next();
    }
    public void printData(){
        System.out.println("Entered the value of n: "+n);
        System.out.println("Entered the value of s: "+s);
    }
}

public class EXP_5_3_A_19BCE2186 {
    public static void main(String args[]){
        LockDownActivity ot1=new IndoorSportActivities();
        LockDownActivity ot2=new OnlineActivities();
        ot1.getData();
        ot2.getData();
        ot1.printData();
        ot2.printData();
    }
}
