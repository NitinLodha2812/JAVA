package package_3;

import java.util.Scanner;

public class vacation4 {
    String Place, date;
    String act[] = new String[2];
    public static int price[] = new int[2];
    Scanner in = new Scanner(System.in);
    public void getMethod(int i) {
        
        System.out.println("data "+(i+1));
        
        System.out.print("Enter Place : ");
        Place=in.nextLine();
        System.out.print("Enter date : ");
        date=in.next();
        in.nextLine();
        System.out.print("Enter Activity : ");
        act[i]=in.nextLine();
        System.out.print("Enter price : ");
        price[i]=in.nextInt();
    }
    public void printMethod(int i) {
        
        System.out.println("Place : "+Place);
        System.out.println("price : "+price[i]);
        System.out.println("Activity : "+act[i]);
        System.out.println("date : "+date);
        
    }
}
