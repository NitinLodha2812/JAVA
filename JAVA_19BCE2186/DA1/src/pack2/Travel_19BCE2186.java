package pack2;
import pack1.InternationalTravel;
import pack1.NationalTravel;
import java.util.Scanner;
class my_Dest{
    String favourite_place;
    String date_of_travel;
    void getmethod1(){
        Scanner in= new Scanner(System.in);
        System.out.println("My favourite place: ");
        favourite_place= in.nextLine();
        System.out.println("date of travel is: ");
        date_of_travel= in.next();
    }
    void printmethod1(){
        System.out.println("--------PLACE I WOULD LOVE TO VISIT------");
        System.out.println("Favourite place: " + favourite_place);
        System.out.println("Date of travel is: " + date_of_travel);
        System.out.println("-----THANK YOU-----");
    }
}
public class Travel_19BCE2186 {
    public static void main(String args[]){
        System.out.println("-------/INTERNATIONAL TRAVEL/-------");
        InternationalTravel tr1= new InternationalTravel();
        tr1.getmethod();
        tr1.printmethod();
        InternationalTravel tr2= new InternationalTravel(); tr2.getmethod();
        tr2.printmethod();
        InternationalTravel tr3= new InternationalTravel();
        tr3.getmethod();
        tr3.printmethod();

        System.out.println("---------/NATIONAL TRAVEL/---------");

        NationalTravel tr4= new NationalTravel();
        tr4.getmethod();
        tr4.printmethod();
        NationalTravel tr5= new NationalTravel();
        tr5.getmethod();
        tr5.printmethod();
        NationalTravel tr6= new NationalTravel();
        tr6.getmethod();
        tr6.printmethod();

        my_Dest tr7= new my_Dest();
        tr7.getmethod1();
        tr7.printmethod1();
    }
}