package pak1;


public class nationaltravel extends Travel {
    int j=0;
    String visit[]=new String[15];

    @Override
    public void getmethord()
    {
        System.out.println("Enter the visited Places in India--");
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
        System.out.println("Visited Places--");
        for(int i=0;i<j;i++)
        {
            System.out.print((i+1)+" visited place in India: "+visit[i]);
            System.out.println();
        }
        System.out.println();
    }

}