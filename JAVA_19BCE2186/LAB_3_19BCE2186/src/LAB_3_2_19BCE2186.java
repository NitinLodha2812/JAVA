class ScoreValidation extends Exception{
    ScoreValidation(){
        System.out.println("Invalid input not in positive defined range ");
    }
}
class ScoreValidation1 extends Exception{
    ScoreValidation1(){
        System.out.println("The number should be positive ");
    }
}
public class LAB_3_2_19BCE2186 {
    void meth1(int i) throws ScoreValidation{
        if(i<=25 && i>=0){
            throw new ScoreValidation();
        }
        System.out.println("number is "+i);
    }
    void meth2(int i) throws ScoreValidation1{
        if(i<0){
            throw new ScoreValidation1();
        }
        System.out.println("number is "+i);
    }
    public static void main(String args[]){
        try{
            LAB_3_2_19BCE2186 o1=new LAB_3_2_19BCE2186();
            LAB_3_2_19BCE2186 o2=new LAB_3_2_19BCE2186();
            int score[]=new int[100];

            score[0]=-14;
            o1.meth2(score[0]);
//            score[1]=14;
//            o2.meth1(score[1]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("can not access the value - out of bound "+ e);
        }
        catch(ArithmeticException exe){
            System.out.println(exe);
        }
        catch(NullPointerException exe){
            System.out.println("can not find length for null "+exe);
        }
        catch(NumberFormatException exe){
            System.out.println("wrong formatting "+exe);
        }
//        catch(ScoreValidation e){
//            System.out.println("score range is above 25");
//        }
        catch(ScoreValidation1 e){
            System.out.println("score range should not be negative");
        }
        catch(Exception e){
            System.out.println("parent ref - exception caught "+e);
        }
        finally {
            System.out.println("This is the final block executing");
            int i=100;
            System.out.println("i value is "+i);

        }


    }
}