package pack2;
import pack1.InternationalTravel;
import pack1.NationalTravel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
class Thread1 extends Thread{
    InternationalTravel Int_tr;
    Thread1(InternationalTravel Int_tr){
        this.Int_tr=Int_tr;
    }
    public void run() {
        System.out.println("----------------- International Travel -----------------");
        Int_tr.getmethod();
        try {
            File file = new File("D:\\JAVA\\DA1_File1_19BCE2186.txt");
            FileWriter fout = new FileWriter(file);
            System.out.println("\nWriting to the file .....");
            fout.write(Int_tr.pass+"\n");
            fout.write(Int_tr.initial_place+"\n");
            fout.write(Int_tr.dest_place+"\n");

            System.out.println("FINISHED WRITING THE FILE");
            fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
class Thread2 extends Thread{
    NationalTravel Nat_tr;
    Thread2(NationalTravel Nat_tr){
        this.Nat_tr=Nat_tr;
    }
    public void run() {
        System.out.println("\n-------------National Travel----------------");
        Nat_tr.getmethod();
        try {
            File file = new File("D:\\JAVA\\DA1_File2_19BCE2186.txt");
            FileWriter fout = new FileWriter(file);
            System.out.println("\nWriting to the file .....");
            fout.write(Nat_tr.pass_1+"\n");
            fout.write(Nat_tr.initial_place1+"\n");
            fout.write(Nat_tr.dest_place1+"\n");

            System.out.println("FINISHED WRITING THE FILE.");
            fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Thread3 extends Thread{
    public void run() {
        ArrayList<String> IT=new ArrayList<String>();
        ArrayList<String> NT=new ArrayList<String>();
        File file;
        FileReader fin;
        BufferedReader buff_rd;
        try {
            file = new File("D:\\JAVA\\DA1_File1_19BCE2186.txt");
            fin = new FileReader(file);
            buff_rd = new BufferedReader (fin);
            String sent;
            while((sent=buff_rd.readLine())!=null) {
                IT.add(sent);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            file = new File("D:\\JAVA\\DA1_File2_19BCE2186.txt");
            fin = new FileReader(file);
            buff_rd = new BufferedReader (fin);
            String sent;
            while((sent=buff_rd.readLine())!=null) {
                NT.add(sent);
            }
            fin.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nParsing through InternationalTravel Collection");
        Iterator<String> i1=IT.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        System.out.println("\nParsing through NationalTravel Collection");
        Iterator<String> i2=NT.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }
    }

}
public class DA1_Q2_19BCE2186 {

    public static void main(String[] args) throws InterruptedException {
        InternationalTravel I1 = new InternationalTravel();
        NationalTravel N1 = new NationalTravel();
        Thread1 TH_IN_TH = new Thread1(I1);
        Thread2 TH_NA_TH = new Thread2(N1);
        Thread3 TH_FIN = new Thread3();
        TH_IN_TH.start();
        TH_IN_TH.join();
        TH_NA_TH.start();
        TH_NA_TH.join();
        TH_FIN.start();
    }
}