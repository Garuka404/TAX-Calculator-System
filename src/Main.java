import java.util.Scanner;
class Option{
    public static void withholding(){
        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("\n\n+--------------------------------------------------------------+");
            System.out.println("|                       WITHHOLDING TAX                        |");
            System.out.println("+--------------------------------------------------------------+");

            System.out.println("\n \n\t[1] Rent Tax \n"
                    +"\n\t[2]Bank Interest Tax\n " //1 option selection options
                    +"\n\t[3]Dividend Tax\n "
                    +"\n\t[4]Exit\n  ");
            System.out.print("\n\nEnter an option to continue -> ");
            int option =scan.nextInt();
            if(option >4 || option <1){
                System.out.println("\nInvalid Number try again !!!!!\n");
            }
            else{
                switch(option){
                    case 1:
                        System.out.flush();
                        with.WithRent();

                        break;
                    case 2:
                        with.Interest();
                        break;
                    case 3:
                        with.DividedTax();
                        break;
                    case 4:
                        home1.Home1();
                        break;

                }
            }
        }while(true);
    }

    public static void LeasingPayment(){

        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("\n\n+--------------------------------------------------------------+");
            System.out.println("|                       LEASING PAYMENT                        |");
            System.out.println("+--------------------------------------------------------------+");

            System.out.println("\n \n\t[1] Calculate Monthly Installment \n"
                    +"\n\t[2] Search Leasing Category \n " //1 option selection options
                    +"\n\t[3] Find Leasing Amount\n "
                    +"\n\t[4]Exit\n  ");
            System.out.print("\n\nEnter an option to continue -> ");
            int option =scan.nextInt();
            if(option >4 || option <1){
                System.out.println("\nInvalid Number try again !!!!!\n");
            }
            else{
                switch(option){
                    case 1:
                        Leasing.CMI();


                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;

                }
            }
        }while(true);
    }


}



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