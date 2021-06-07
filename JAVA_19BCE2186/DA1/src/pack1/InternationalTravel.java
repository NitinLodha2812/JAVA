package pack1;
import java.util.Scanner;
abstract class Travel {
    String pass,initial_place,dest_place;
    int age;
    Scanner sc=new Scanner(System.in).useDelimiter("\n");
    abstract public void getmethod();
    abstract public void printmethod();
}
public class InternationalTravel extends Travel{
    public String pass;
    public String initial_place;
    public String dest_place;
    public void getmethod(){
        Scanner in= new Scanner(System.in);
        System.out.println("Name of Passenger: ");
        pass= in.nextLine();
        System.out.println("Start Place: ");
        initial_place= in.nextLine();
        System.out.println("Destination: ");
        dest_place= in.next();
    }
    public void printmethod(){
        System.out.println("---------/TRAVEL DETAILS ARE AS FOLLOWS/--------------");
        System.out.println("Name of Passenger: " + pass);
        System.out.println("Start Place: " + initial_place);
        System.out.println("Destination: " + dest_place);
        System.out.println("-----------/TRAVEL DETAILS OF NEXT PASSENGER/-----------");
    }
    public static void main(String args[]){
        InternationalTravel tr1= new InternationalTravel();
        tr1.getmethod();
        tr1.printmethod();
    }
}