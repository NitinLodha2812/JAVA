package pak2;
/**
 *
 * @author HP
 */

import pak1.nationaltravel;
import pak1.internationaltravel;

import java.util.Scanner;
public class travel_19BCE2186 {
    Scanner sc=new Scanner(System.in).useDelimiter("\n");

    public void futurevisit()
    {
        String fvisit[]=new String[10];
        System.out.println("Enter the places you want to visit in future with tentative year--");
        System.out.println("Enter 'finish' when you entered all the place you wanted to visit in future!!");
        System.out.println();
        int x=0;
        while(true)
        {
            System.out.print("Enter "+(x+1)+" place you want to visit in future with it's tentative year: ");
            fvisit[x]=sc.next();
            if(fvisit[x].equals("finish"))
                break;
            x++;
        }
        System.out.println();
        for(int k=0;k<x;k++)
        {
            System.out.print((k+1)+" to visit: "+fvisit[k]);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        internationaltravel o[]=new internationaltravel[3];
        nationaltravel o1[]=new nationaltravel[3];
        DA_1 o2[]=new DA_1[3];
        for(int i=0;i<3;i++)
        {
            o[i]=new internationaltravel();
            o1[i]=new nationaltravel();
            o2[i]=new DA_1();
        }
        for(int i=0;i<3;i++)
        {
            o[i].getmethord();
            o1[i].getmethord();
            o[i].printmethord();
            o1[i].printmethord();
            o2[i].futurevisit();
        }
    }
}