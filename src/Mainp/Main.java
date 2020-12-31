package Mainp;

import Mainp.Admin.admin;
import Mainp.User02.DisplayU2;
import Mainp.User04.DisplayU4;
import data.ADMIN;

import java.util.Scanner;

public class Main {

    public static void main( String[] args) {

        page();

    }

    public static void page(){

        Scanner reader = new Scanner(System.in);

        System.out.println ( );
        System.out.println ( );

        System.out.println ("WELCOME TO THE A.T.M");

        System.out.println ( );
        System.out.println ( );

        System.out.print("Account Number : ");

        int inputnumber = reader.nextInt ( );

        System.out.println ();

        System.out.print("Account Pin : ");

        int inputpin = reader.nextInt ( );

        if ( data.ADMIN.aan == inputnumber && ADMIN.aap == inputpin){
            admin.adminscreen1 ();
        }
        else if ( data.User02D.account.accountnumber == inputnumber && data.User02D.account.accountpin == inputpin){
            DisplayU2.screen1 ();
        }
        else if ( data.User01D.account.accountnumber == inputnumber && data.User01D.account.accountpin == inputpin){
            Mainp.User01.DisplayU1.screen1 ();
        }
        else if (inputnumber == user4.accountnumber && user4.accountpin == inputpin){
            DisplayU4.screen1 ();
        }
        else{
            System.out.println("Error , Error . Invalid Account No. / Password...");
            page();
        }




        /*Changes made for the development purposes of 4.0

        * changed all password to macth with account number of testing purposes (13/12/2020) | by : Madhav Vijay
        * implemented a loop by re-running the project if the account number / password did not meet the requirements (13/12/2020) | by : Madhav Vijay
        * */
    }


}
