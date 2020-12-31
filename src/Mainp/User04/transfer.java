package Mainp.User04;

import Mainp.Main;
import Mainp.User04.Comfuntion.SuperMenu3;

import java.util.Scanner;

public class transfer {
    public static void function(){

        Scanner reader = new Scanner(System.in);

        System.out.println ();

        System.out.print (" Enter user account number : ");

        int userinput = reader.nextInt ();

        System.out.println ( );


        if (userinput == data.User01D.account.accountnumber /*&& user.t4 == false*/){

            System.out.print (" Enter Amount : ");

            int userinput1 = reader.nextInt ();

            data.User01D.account.accountbalence = data.User01D.account.accountbalence + userinput1;

            data.User04D.account.accountbalence = ( ( data.User04D.account.accountbalence ) - (userinput1));

            //userinputnumber1 = userinput1;

            System.out.println ( );

            //data.User01D.user.t4 = true;

            System.out.println (" Successfully transferred ");

            System.out.println ( );

            System.out.println ( "Current Account Balence : " + ( data.User01D.account.accountbalence )+ '$');
        }


        else if (userinput == data.User02D.account.accountnumber /*&& user2.t4 == false*/){

            System.out.print (" Enter Amount : ");

            int userinput1 = reader.nextInt ();

            data.User02D.account.accountbalence = data.User02D.account.accountbalence + userinput1;

            data.User04D.account.accountbalence = ( ( data.User04D.account.accountbalence ) - (userinput1));

            //userinputnumber2 = userinput1;

            System.out.println ( );

            //data.user02D.user2.t4 = true;

            System.out.println (" Successfully transferred ");

            System.out.println ( );

            System.out.println ( "Current Account Balence : " + ( data.User01D.account.accountbalence )+ '$');
        }

        else {
            System.out.println ( );
            System.out.println (" ERROR , ERROR , INVALID ACCOUNT NUMBER");
            System.out.println ( );
        }

        System.out.println ( );

        System.out.println ("select anyone of the following : (1 / 2)");
        System.out.println ("1).Back to the menu");
        System.out.println ("2). Exit this program ");

        int userdepositmenuoption = reader.nextInt ();

        switch ( userdepositmenuoption ) {
            case 1:
                SuperMenu3.SM();
                break;
            case 2:
                Main.page ( );
                break;
            default:
                break;
        }
    }
}
