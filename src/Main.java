import java.util.Scanner;
class Main{
    public static void Home1(){
        Scanner scan=new Scanner(System.in);

        int option;
        do{
            System.out.println(" __  ______  ________ ________");
            System.out.println("|  \\/      \\|        |        \\");
            System.out.println(" \\$|  $$$$$$| $$$$$$$$\\$$$$$$$$");
            System.out.println("|  | $$   \\$| $$__      | $$");
            System.out.println("| $| $$     | $$  \\     | $$");
            System.out.println("| $| $$   __| $$$$$     | $$");
            System.out.println("| $| $$__/  | $$____    | $$");
            System.out.println("| $$\\$$    $| $$    \\   | $$ ");
            System.out.println(" \\$$ \\$$$$$$ \\$$$$$$$$   \\$$");

            System.out.println('\n');
            System.out.println(" _______            __     __   _____        ");
            System.out.println("|__   __|    /\\     \\ \\   / /  / ____|     /\\  ");
            System.out.println("   | |      /  \\     \\  V  /  | |         /  \\  ");
            System.out.println("   | |     / /\\ \\      > <    | |        / /\\ \\   ");
            System.out.println("   | |    / ____ \\   /  .  \\  | |____   / ____ \\   ");
            System.out.println("   |_|   /_/    \\_\\ /_/   \\_\\  \\_____| /_/    \\_\\   ");
            System.out.println("\n\n");


            System.out.println("============================================================================================");



            System.out.println("\n \n\t[1] Withholding Tax \n"
                    +"\n\t[2]Payable Tax\n "
                    +"\n\t[3]Income Tax\n "
                    +"\n\t[4]Social Security Contribution Levy(SSCL) Tax\n  "  // options
                    +"\n\t[5]Leasing Payment\n "
                    +"\n\t[6]Exit\n  ");

            System.out.print("\n\nEnter an option to continue -> ");
            option=scan.nextInt();

            if(option <1 || option >7)
            {
                System.out.println("\nInvalid Number try again !!!!!\n");

            }
            else{
                switch(option){
                    case 1:
                        Option. withholding();
                        break;
                    case 2:
                        Pay.PayableTax();
                        break;
                    case 3:
                        Income.IncomeTax();
                        break;

                }

            }

        }while(true);
    }
}
public class untitled3 {
    public static void calls(){
        home1.Home1();
    }

    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        untitled3.calls();