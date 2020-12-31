package Mainp.User02;

import java.util.Scanner;

public class transfer {
    public static void function(){

        Scanner reader = new Scanner(System.in);

        System.out.println ();

        System.out.print (" Enter user account number : ");

        int userinput = reader.nextInt ();

        System.out.println ( );


        if (userinput == data.User01D.account.accountnumber && data.User01D.transfer.t2 == false ){
            System.out.print (" Enter Amount : ");

            int userinput1 = reader.nextInt ();

            data.User01D.account.accountbalence = data.User01D.account.accountbalence + userinput1;

            data.User02D.account.accountbalence = ( ( data.User02D.account.accountbalence ) - (userinput1));

            //userinputnumber1 = userinput1;

            System.out.println ( );

            //user.t2 = true;

            System.out.println (" Successfully transferred ");

            System.out.println ( );

            System.out.println ( "Current Account Balence : " + ( data.User02D.account.accountbalence )+ '$');
        }

        else /*&& !user4.t2*/ if (userinput == data.User04D.account.accountnumber   /*!user4.t2*/){
            System.out.print (" Enter Amount : ");

            int userinput1 = reader.nextInt ();

            data.User04D.account.accountbalence = data.User04D.account.accountbalence + userinput1;

            data.User02D.account.accountbalence = ( ( data.User02D.account.accountbalence ) - (userinput1));

            //userinputnumber2 = userinput1;

            System.out.println ( );

           // user4.t2 = true;

            System.out.println (" Successfully transferred ");

            System.out.println ( );

            System.out.println ( "Current Account Balence : " + ( data.User02D.account.accountbalence )+ '$');
        }

        else if (data.User01D.transfer.t2){
            System.out.println ( );
            System.out.println (" ERROR , ERROR , you cannot transfer to two user's or more until and unless the first user's knows that you have transferred");
            System.out.println ( );
        }

        else  {
            System.out.println ( );
            System.out.println (" ERROR , ERROR , INVALID ACCOUNT NUMBER");
            System.out.println ( );
        }



        System.out.println ( );

        Mainp.User02.Comfuntion.Submenu2.smenu();
    }
}
