package package_2;

import package_1.LockDownActivities;

import java.util.Scanner;

class MindCare implements LockDownActivities {
    int n;
    String s;
    public void getData(){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the value of n: ");
        n=in.nextInt();
        System.out.print("enter the value of s: ");
        s=in.next();
    }
    public void printData(){
        System.out.println("enter the value of n: "+n);
        System.out.println("enter the value of s: "+s);
    }
}
class BodyCare implements LockDownActivities {
    int n;
    String s;
    public void getData(){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the value of n: ");
        n=in.nextInt();
        System.out.print("enter the value of s: ");
        s=in.next();
    }
    public void printData(){
        System.out.println("enter the value of n: "+n);
        System.out.println("enter the value of s: "+s);
    }
}

public class EXP_5_3_B_19BCE2186 {
    public static void main(String args[]){
        LockDownActivities lda1=new MindCare();
        LockDownActivities lda2=new BodyCare();
        lda1.getData();
        lda2.getData();
        lda1.printData();
        lda2.printData();
    }

}
