import java.util.Scanner;

class with{
    public static void WithRent(){
        Scanner scan=new Scanner(System.in);
        char c=' ';char  a=' ';
        do{
            c =' ';
            System.out.println("\n\n+--------------------------------------------------------------+");
            System.out.println("|                           RENT TAX                           |");
            System.out.println("+--------------------------------------------------------------+");
            do{
                System.out.print("\nEnter your rent       : ");
                int rent=scan.nextInt();
                int count=0;
                if(rent<0){
                    System.out.println("Invalid input ...");
                    System.out.print("\n\n\nDo you want to enter the correct value again (Y//N)");
                    a=scan.next().charAt(0);
                }
                else{
                    if(rent<=100000){
                        System.out.println("\nYou dont have to pay rent tax...");
                    }
                    else{
                        count=((rent-100000)*10)/100;
                        System.out.println("\nYou have to pay rent Tax : "+count+".00");

                        System.out.print("\n\n\nDo you want to calculater another Rent Tax (Y//N)");
                        c=scan.next().charAt(0);
                    }
                    a=' ';
                }
            }while(a=='Y');
        }while(c=='Y');
        home1.Home1();

    }
    public static void Interest(){
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\n+--------------------------------------------------------------+");
        System.out.println("|                         BANK INTEREST TAX                    |");
        System.out.println("+--------------------------------------------------------------+");
        char c,a;
        do{
            do{
                c=' ';a=' ';
                System.out.print("\n\nEnter your bank interest per year       :");
                float inter=scan.nextFloat();
                if(inter<0){
                    System.out.println("Invalid input ...");

                    System.out.print("\n\nDo you want to enter the correct value again (Y//N)");
                    a=scan.next().charAt(0);
                }
                else{
                    float Itax=0;
                    Itax=(inter*5)/100;
                    System.out.println("\nYour havee to pay Bank Interrest Tax Per year  : "+Itax);

                    System.out.print("\n\n\nDo you want to calculater another Bank Interest Tax (Y//N)");
                    c=scan.next().charAt(0);

                }
            }while(a=='Y');
        }while(c=='Y');


    }
    public static void DividedTax(){
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\n+--------------------------------------------------------------+");
        System.out.println("|                         DIVIDEND TAX                         |");
        System.out.println("+--------------------------------------------------------------+");
        char c,a;
        do{
            do{
                c=' ';a=' ';
                System.out.print("\n\nEnter your total dividend per year       :");
                float div=scan.nextFloat();
                if(div<0){
                    System.out.println("Invalid input ...");

                    System.out.print("\n\nDo you want to enter the correct value again (Y//N)");
                    a=scan.next().charAt(0);
                }
                else if(div<100000){
                    System.out.println("\n\t\tYou dont have to pay Dividend Tax...");
                }
                else{
                    float Dtax=0;
                    Dtax=(div*14)/100;
                    System.out.println("\nYour havee to pay Dividend  Tax Per year  : "+Dtax);

                    System.out.print("\n\n\nDo you want to calculater another Dividend Tax (Y//N)");
                    c=scan.next().charAt(0);

                }
            }while(a=='Y');
        }while(c=='Y');



    }}
class Pay{
    public static void PayableTax(){
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\n+--------------------------------------------------------------+");
        System.out.println("|                         PAYABLE TAX                          |");
        System.out.println("+--------------------------------------------------------------+");
        char c,a;

        do{
            do{
                c=' ';a=' ';
                System.out.print("\n\nEnter your employee payment per month : ");
                float div=scan.nextFloat();
                if(div<0){
                    System.out.println("Invalid input ...");

                    System.out.print("\n\nDo you want to enter the correct value again (Y//N)");
                    a=scan.next().charAt(0);
                }

                else{
                    float tot=0;
                    if(div<100000){
                        System.out.println("\n\t\tYou dont have to pay Payable Tax...");
                    }
                    else{
                        if(100000>div && div<=141667){
                            tot=(div*6)/100;
                        }
                        else if(141667>div && div<=183333){
                            tot=(div*12)/100;
                        }
                        else if(183333>div && div<=225000){
                            tot=(div*18)/100;
                        }
                        else if(225000>div && div<=266667){
                            tot=(div*24)/100;
                        }
                        else if(266667>div && div<=308333){
                            tot=(div*30)/100;
                        }
                        else{
                            tot=(div*36)/100;
                        }

                        float Dtax=0;
                        Dtax=(div*14)/100;
                        System.out.println("\nYour havee to pay Dividend  Tax Per year  : "+tot);

                        System.out.print("\n\n\nDo you want to calculater another Dividend Tax (Y//N)");
                        c=scan.next().charAt(0);
                    }
                }
            } while(a=='Y');

        }while(c=='Y');





    }}
class Income{

    public static void IncomeTax(){
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\n+--------------------------------------------------------------+");
        System.out.println("|                         INCOME TAX                           |");
        System.out.println("+--------------------------------------------------------------+");
        char c,a;

        do{
            do{
                c=' ';a=' ';
                System.out.print("\n\nEnter your total income per year : ");
                float div=scan.nextFloat();
                if(div<0){
                    System.out.println("Invalid input ...");

                    System.out.print("\n\nDo you want to enter the correct value again (Y//N)");
                    a=scan.next().charAt(0);
                }

                else{
                    float tot=0;
                    if(div<1200000){
                        System.out.println("\n\t\tYou dont have to pay Income Tax...");
                    }
                    else{
                        if(1200000>div && div<=1700000){
                            tot=(div*6)/100;
                        }
                        else if(1700000>div && div<=2200000){
                            tot=(div*12)/100;
                        }
                        else if(2200000>div && div<=2700000){
                            tot=(div*18)/100;
                        }
                        else if(2700000>div && div<=3200000){
                            tot=(div*24)/100;
                        }
                        else if(3200000>div && div<=3700000){
                            tot=(div*30)/100;
                        }
                        else{
                            tot=(div*36)/100;
                        }

                        float Dtax=0;
                        Dtax=(div*14)/100;
                        System.out.println("\nYour havee to pay Dividend  Tax Per year  : "+tot);

                        System.out.print("\n\n\nDo you want to calculater another Income Tax (Y//N)");
                        c=scan.next().charAt(0);
                    }
                }
            } while(a=='Y');

        }while(c=='Y');



    }

}

class SSCL {
    public static void SsclTax() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n+--------------------------------------------------------------+");
        System.out.println("|          Social Security Contribution Levy (SSCL) Tax        |");
        System.out.println("+--------------------------------------------------------------+");
        char c, a;

        do {
            do {
                c = ' ';
                a = ' ';
                System.out.print("\n\nEnter value of Good or Service : ");
                float div = scan.nextFloat();
                if (div < 0) {
                    System.out.println("Invalid input ...");

                    System.out.print("\n\nDo you want to enter the correct value again (Y//N)");
                    a = scan.next().charAt(0);
                } else {
                    float tot = 0;
                    double count = 0;

                    count = (div * 2.5) / 100;

                    count = count + ((count + div) * 15) / 100;

                    System.out.println("\nYour havee to pay SSCL  Tax Per   : " + count);

                    System.out.print("\n\n\nDo you want to calculater another SSCL Tax (Y//N)");
                    c = scan.next().charAt(0);

                }
            } while (a == 'Y');

        } while (c == 'Y');


    }
}
class Leasing{

    public static void CMI(){
        Scanner scan=new Scanner(System.in);
        char c,a;

        do{
            float amount=0,rate=0,ins=0;
            c=' ';a=' ';
            do{
                System.out.print("\n\nEnter lease amount         : ");
                amount=scan.nextFloat();

                if(amount<0){
                    System.out.println("\nInvalid Lease amount... Enter the correct value again...");
                }

            }while(amount<0);

            do{
                System.out.print("\n\nEnter annual interest rate : ");
                rate=scan.nextFloat();

                if(rate<0){
                    System.out.println("\nInvalid Interest rate... Enter the correct value again...");
                }

            }while(rate<0);
            do{
                System.out.print("\n\nEnter monthly instalment   : ");
                ins=scan.nextFloat();

                if(ins>5){
                    System.out.println("\nInvalid number of year... Enter the correct value again...");
                }

            }while(ins>5);





            double tot=1,i=0;
            double count=0;

            i=rate/10;
            count=amount*i;
            int x=1;
            while(x<=ins){
                tot=tot*(1+i);
                x++;
            }
            tot=(1-(1/tot));
            tot=count/tot;

            System.out.println("\nYour monthly instalment  : "+tot);

						 /* System.out.print("\n\n\nDo you want to calculater another SSCL Tax (Y//N)");
						  c=scan.next().charAt(0);*/
        }while(c=='Y');


    }

}
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