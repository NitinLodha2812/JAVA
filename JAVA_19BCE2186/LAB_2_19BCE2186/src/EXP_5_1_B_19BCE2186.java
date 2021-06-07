import java.util.Scanner;

public class EXP_5_1_B_19BCE2186 {
    public static void main(String[] args) {
        int iq, n, i;
        System.out.println("enter n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println("Please enter the iq: ");

            iq = in.nextInt();
            switch ((iq >= 85 && iq <= 114) ? 0 :
                    (144 < iq) ? 1 : 2) {
                case 0:
                    System.out.println("Average");
                    break;
                case 1:
                    System.out.println("Genius");
                    break;
                case 2:
                    System.out.println("Below Average");
                    break;
                default:
                    System.out.println("Please enter a valid input");
            }
        }
    }
}
