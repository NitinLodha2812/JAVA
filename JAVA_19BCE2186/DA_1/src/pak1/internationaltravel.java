package pak1;
/**
 *
 * @author HP
 */
public class internationaltravel extends pak1.Travel {
    String passport_no;
    int j;
    String visit[]=new String[10];
    @Override
    public void getmethord()
    {
        System.out.print("Enter your name: ");
        name=sc.nextLine();
        System.out.print("Enter your Address: ");
        address=sc.nextLine();
        System.out.print("Enter your Contact Number: ");
        phn_no=sc.next();
        System.out.print("Enter your Passport Number: ");
        passport_no=sc.next();
        System.out.print("Enter your Age(in years): ");
        age=sc.nextInt();

        System.out.println("Enter the visited Places in World--");
        System.out.println("Enter 'finish' when you entered all your visited places!!");
        System.out.println();
        while(true)
        {
            System.out.print("Enter "+(j+1)+" place you had already visited: ");
            visit[j]=sc.next();
            if(visit[j].equals("finish"))
                break;
            j++;
        }
        System.out.println();
    }

    @Override
    public void printmethord()
    {
        System.out.println("Name: "+name);
        System.out.println("Age(in years): "+age);
        System.out.println("Contact Number: "+phn_no);
        System.out.println("Address: "+address);
        System.out.println("Passport Number: "+passport_no);
        System.out.println("Visited Places--");
        for(int i=0;i<j;i++)
        {
            System.out.print((i+1)+" visited place in world: "+visit[i]);
            System.out.println();
        }
        System.out.println();
    }

}