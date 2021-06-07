import java.util.Scanner;

public class LAB_3_1_19BCE2186 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter your choice");
        int n=in.nextInt();
        switch (n)
        {
            case 1:
            {
                try{
                    int a1=65, a2=0;
                    int output=a1/a2;
                    System.out.println ("Ans: "+output);
                }
                catch(ArithmeticException e){
                    System.out.println ("It's an Arithmetic exception "+e);
                }
                break;
            }
            case 2:
            {
                try{
                    int a[]=new int[10];
                    a[12]=45;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println ("Its an Array OUTofBound Exception " + e);
                }
                break;
            }
            case 3:
            {
                try{
                    String str=null;
                    System.out.println (str.length());
                }
                catch(NullPointerException e){
                    System.out.println("It's a NullPointer Exception "+ e);
                }
                break;
            }
            default:
                System.out.println("Please enter correct choice");
        }
    }
}
