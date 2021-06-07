import java.io.*;
public class Test1{
    public static void main(String args[])throws IOException{
        FileReader fr = new FileReader("D:\\JAVA\\attend\\1.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while((s = br.readLine()) != null){
            String emp = s.substring(0, s.lastIndexOf(' '));
            int atd = Integer.parseInt(s.substring(s.lastIndexOf(' ') + 1));
            if(atd == 1)// 1 - present , 0 - absent
                System.out.println(emp);
        }
    }
}