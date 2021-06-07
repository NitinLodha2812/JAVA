import java.util.Scanner;

public class EXP_5_A_19BCE2186 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int score[][]=new int[3][];
        score[0]=new int[2];
        score[1]=new int[4];
        score[2]=new int[3];

        for(int i=0;i<score.length;i++){
            System.out.println("\nEnter score: ");
            for(int j=0;j<score[i].length;j++){
                score[i][j]=input.nextInt();
            }
        }
        for(int r[]:score){
            int sum=0;
            for(int ele:r){
                sum+=ele;
            }
            double average=sum/(double)(r.length);
            System.out.println("Average: "+average);
        }
    }
}
