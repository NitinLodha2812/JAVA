import java.util.*;
class Faculty {
    String name;
    String healthActivity[];
    String researchActivity[];
    Faculty(){
        healthActivity=new String[3];
        researchActivity=new String[4];
    }
    void getData(){
        Scanner in=new Scanner(System.in);
        System.out.print("\nEnter name of professor: \n");
        name=in.next();
        System.out.print("Enter name of activity: ");
        healthActivity[0]=in.next();
        System.out.print("Enter Duration: ");
        healthActivity[1]=in.next();
        System.out.print("Enter calories burnt: ");
        healthActivity[2]=in.next();
        System.out.print("Enter name of activity: ");
        researchActivity[0]=in.next();
        System.out.print("Enter no. of papers: ");
        researchActivity[1]=in.next();
        System.out.print("Enter impact factor: ");
        researchActivity[2]=in.next();
        System.out.print("Enter citation: ");
        researchActivity[3]=in.next();
    }
    void printData(){
        System.out.println(name+"\t"+healthActivity[0]+"\t"+healthActivity[1]+"\t"+healthActivity[2]+
                "\t"+researchActivity[0]+"\t"+researchActivity[1]+"\t"+researchActivity[2]+"\t"+researchActivity[3]);
    }
    int ret_dur(){
        int y=Integer.parseInt(healthActivity[1]);
        return y;
    }
}

public class EXP_5_2_A_19BCE2186 {
    public static void main(String args[]){
        int n=2;
        Faculty ot[]=new Faculty[n];
        int dur[]=new int[n];
        for(int i=0;i<n;i++){
            ot[i]=new Faculty();
            ot[i].getData();
            dur[i]=ot[i].ret_dur();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(dur[j]>dur[j+1]){
                    int tp=dur[j];
                    dur[j]=dur[j+1];
                    dur[j+1]=tp;
                    Faculty tp1=ot[j];
                    ot[j]=ot[j+1];
                    ot[j+1]=tp1;
                }
            }
        }
        System.out.println("Name\t"+"Activity\t"+"duration\t"+"Calories\t"+"Research\t"+"No. of papers\t"+"Impact\t"+"Citation");
        for(int i=0;i<n;i++){
            ot[i].printData();
        }
    }
}