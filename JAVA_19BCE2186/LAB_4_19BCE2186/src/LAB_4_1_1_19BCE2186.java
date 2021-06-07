//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//
//public class LAB_4_1_1_19BCE2186 {
//
//    public static void main(String args[]){
//        try {
//            FileOutputStream ob1=new FileOutputStream("D:\\JAVA\\LAB_4\\abc.txt");
//            String a="Nitin Lodha\n , 19BCE2186\n , 9.11\n , Switzerland\n , 8610799649";
//            byte BA[]=a.getBytes();
//            ob1.write(BA);
//            ob1.close();
//            FileInputStream ob2=new FileInputStream("D:\\JAVA\\LAB_4\\abc.txt");
//            int c=0;
//            while((c=ob2.read())!=-1){
//                System.out.print((char)c);
//            }
//            ob2.close();
//        } catch (Exception ex) {
//            System.out.println("File not found");
//        }
//
//
//
//    }
//}
//
import java.io.*;

public class LAB_4_1_1_19BCE2186 {
    public static void main(String[] args) {
        try {
            String dir = "D:\\JAVA\\LAB_4";
            FileWriter writer = new FileWriter(dir+ "\\"+"MyFile.txt", true);
            writer.write("Nitin Lodha");
            writer.write("\r\n");   // write new line
            writer.write("19BCE2186");
            writer.write("\r\n");   // write new line
            writer.write("9.11");
            writer.write("\r\n");   // write new line
            writer.write("Switzerland");
            writer.write("\r\n");   // write new line
            writer.write("8610799649");


            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String dir = "D:\\JAVA\\LAB_4";
            FileReader reader = new FileReader(dir+ "\\"+"MyFile.txt");
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
