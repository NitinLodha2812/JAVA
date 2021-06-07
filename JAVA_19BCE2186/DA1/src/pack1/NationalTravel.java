package pack1;
import java.util.Scanner;
abstract class Travel1{
    abstract void getmethod();
    abstract void printmethod();
}
public class NationalTravel extends Travel1{
    public String pass_1;
    public String initial_place1;
    public String dest_place1;
    public void getmethod(){
        Scanner in= new Scanner(System.in);
        System.out.println("Name of Passenger: ");
        pass_1= in.nextLine();
        System.out.println("Start Place: ");
        initial_place1= in.nextLine();
        System.out.println("Destination: ");
        dest_place1= in.next();
    }
    public void printmethod(){
        System.out.println("--------/TRAVEL DETALS ARE AS FOLLOWS/-----------");
        System.out.println("Name of Passenger: " + pass_1);
        System.out.println("Start Place: " + initial_place1);
        System.out.println("Destination: " + dest_place1);
        System.out.println("--------/TRAVEL DETAILS OF NEXT PASSENGER/--------");
    }
    public static void main(String args[]){
        NationalTravel tr1= new NationalTravel();
        tr1.getmethod();
        tr1.printmethod();
    }
}