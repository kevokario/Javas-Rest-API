
import java.util.Scanner;

public class Kario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n+++++++++++++++++++\nWelcome to kario Industry\n+++++++++++++++++++\n");
        boolean b = true;
        while (b) {
            System.out.print(""
                    + "---Please select an option---\n"
                    + "1 : add my profile.\n"
                    + "2 : add my like.\n"
                    + "3 : add my Friend.\n"
                    + "4: Exit\n Your Option : ");
            int opt = input.nextInt();

            if (opt == 1) {

            } else if (opt == 2) {

            } else if (opt == 3) {

            } else if (opt == 4) {
                System.out.println("\n\n**********GoodBye!**********\n\n");
                b = false;
            } else {
                System.out.println("Invalid Option");
            }
        }

    }
}
