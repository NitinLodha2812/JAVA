package package_3.subPackage1;

import package_3.vacation4;

import java.util.Scanner;

public class summerVacation4 extends vacation4 {
    Scanner in=new Scanner(System.in);
    String cor_title;
    String onl_pltm;
    int dur;
    public void getCourse(int i) {
        getMethod(i);
        System.out.print("Enter Course Title : ");
        cor_title=in.nextLine();
        System.out.print("Enter Online Platform : ");
        onl_pltm=in.nextLine();
        System.out.print("Enter dur of course (in hours) : ");
        dur=in.nextInt();
    }
    public void printCourse(int i) {
        printMethod(i);
        System.out.println("Course Title : "+cor_title);
        System.out.println("Online Platform : "+onl_pltm);
        System.out.println("dur : "+dur);
    }
    public static void tot_price() {
        int total=price[0]+price[1];
        System.out.println("The total price of the activities is : "+total);
    }
}
