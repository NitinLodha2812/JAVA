import java.util.*;
class Faculty1 {
    String name;
    String academicActivity[];
    String researchActivity[];
    Faculty1(){
        academicActivity =new String[3];
        researchActivity=new String[4];
    }
    void getData(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter name of professor: ");
        name=in.next();
        System.out.print("Enter teaching hours: ");
        academicActivity[0]=in.next();
        System.out.print("Enter accreditation hours: ");
        academicActivity[1]=in.next();
        System.out.print("Enter evaluation hours: ");
        academicActivity[2]=in.next();
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
        System.out.println(name+"\t"+ academicActivity[0]+"\t"+ academicActivity[1]+"\t"+ academicActivity[2]+
                "\t"+researchActivity[0]+"\t"+researchActivity[1]+"\t"+researchActivity[2]+"\t"+researchActivity[3]);
    }
    int ret_dur(){
        int y=Integer.parseInt(academicActivity[1]);
        return y;
    }
}

public class EXP_5_2_B_19BCE2186 {
    public static void main(String args[]){
        int n=2;
        Faculty1 ot[]=new Faculty1[n];
        int dur[]=new int[n];
        for(int i=0;i<n;i++){
            ot[i]=new Faculty1();
            ot[i].getData();
            dur[i]=ot[i].ret_dur();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(dur[j]>dur[j+1]){
                    int tp=dur[j];
                    dur[j]=dur[j+1];
                    dur[j+1]=tp;
                    Faculty1 tp1=ot[j];
                    ot[j]=ot[j+1];
                    ot[j+1]=tp1;
                }
            }
        }
        System.out.println("Name\t"+"Activity\t"+"dur\t"+"Calories\t"+"Research\t"+"No. of papers\t"+"Impact\t"+"Citation");
        for(int i=0;i<n;i++){
            ot[i].printData();
        }
    }
}