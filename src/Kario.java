
import karioPackage.karioLogic;
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
                    + "4 : View my Firends.\n"
                    + "5 : Exit\n Your Option : ");
            int opt = input.nextInt();

            if (opt == 1) {
                karioLogic l = new karioLogic(1);
                l.Brains();
            } else if (opt == 2) {
                karioLogic l = new karioLogic(2);
                l.Brains();
            } else if (opt == 3) {
                karioLogic l = new karioLogic(3);
                l.Brains();
            } else if(opt == 4){
                karioLogic l = new karioLogic(4);
                l.Brains();
                
            } else if (opt == 5) {
                System.out.println("\n\n**********GoodBye!**********\n\n");
                b = false;
            } else {
                System.out.println("Invalid Option");
            }
        }

    }
}
