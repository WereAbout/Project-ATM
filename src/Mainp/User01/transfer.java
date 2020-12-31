package Mainp.User01;

import java.util.Scanner;

public class transfer {
    public static void Function(){

        Scanner reader = new Scanner(System.in);

        System.out.println ();

        System.out.print (" Enter user account number : ");

        int userinput = reader.nextInt ();

        System.out.println ( );

        int bamount;

        int intbamountt;


        if (userinput == data.User02D.account.accountnumber /*&& !user2.t1*/ ){

            System.out.print (" Enter Amount : ");

            int userinput1 = reader.nextInt ();

            data.User02D.account.accountbalence = data.User02D.account.accountbalence + userinput1;

            data.User01D.account.accountbalence = ( ( data.User01D.account.accountbalence ) - (userinput1));

           // userinputnumber1 = userinput1;

            System.out.println ( );

            //data.user02D.user2.t1 = true;

            System.out.println (" Successfully transferred ");

            System.out.println ( );

            System.out.println ( "Current Account Balence : " + ( data.User01D.account.accountbalence ) + '$');
        }

        else if ( data.User04D.account.accountnumber == userinput /*&& !user4.t1 */){

            System.out.print (" Enter Amount : ");

            int userinput1 = reader.nextInt ();

            data.User04D.account.accountbalence = data.User04D.account.accountbalence + userinput1;

            data.User01D.account.accountbalence = ( ( data.User01D.account.accountbalence ) - (userinput1));

            //userinputnumber2 = userinput1;

            System.out.println ( );

            //user4.t1 = true;

            System.out.println (" Successfully transferred ");

            System.out.println ( );

            System.out.println ( "Current Account Balence : " + ( data.User01D.account.accountbalence ) + '$');
        }

        else {
            System.out.println ( );
            System.out.println (" ERROR , ERROR , INVALID ACCOUNT NUMBER");
            System.out.println ( );
        }

        System.out.println ( );

        Mainp.User01.Comfuntion.Submenu.smenu();

    }
}
