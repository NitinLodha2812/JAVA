import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LAB_4_1_2_19BCE2186 {
    public static void main(String[] args) {
        String words = "";

        try{
            FileReader fr = new FileReader("D:\\JAVA\\LAB_4\\samp.txt");
            int i;
            while((i = fr.read()) != -1){
                words = words + (char)i;
            }
        }
        catch(Exception e){
            System.out.println("Error while reading occurred");
        }

        Pattern p1 = Pattern.compile("success");
        Matcher m1 = p1.matcher(words);
        int success_count =0 ;
        while(m1.find())
            success_count++;
        Pattern p2 = Pattern.compile("hardwork");
        Matcher m2 = p2.matcher(words);
        int hardwork_count =0 ;
        while(m2.find())
            hardwork_count++;

        System.out.println(words);
        System.out.println("total no. of words - success: " + success_count +" "+"hardwork: "+hardwork_count);
    }
}
