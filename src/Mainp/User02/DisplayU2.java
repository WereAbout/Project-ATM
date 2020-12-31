package Mainp.User02;

import Mainp.User02.Comfuntion.SuperMenu2;
import data.User02D.personal;
import data.User02D.account;

public class DisplayU2 {

    static int userinputnumber1;

    static int userinputnumber2;

    public static void screen1(){

        //user2 user2data = new user2();

        System.out.println ( );
        System.out.println ( );
        System.out.println ("Welcome " + data.User02D.personal.fullname );

        System.out.println ( );

        SuperMenu2.SM();

    }

    public static void user2info(){

        //user2 data = new user2();

        System.out.println ( );

        System.out.println (" First Name : " + data.User02D.personal.firstname );
        System.out.println (" Second Name : " + data.User02D.personal.lastname );
        System.out.println (" Age : " + data.User02D.personal.age );

        System.out.println ( );

        System.out.println (" Current account balance : " + account.accountbalence + '$');

        System.out.println ( );



    }

    public static void userversioninfo(){

        System.out.println ( );

        System.out.println ("First Name : " + personal.firstname );
        System.out.println ("Last Name : " + personal.lastname );
        System.out.println ("Age : " + personal.age );

        System.out.println ( );

        System.out.println ("Current Account Balence : " + data.User02D.account.accountbalence + '$');

        System.out.println ( );

        Mainp.User02.Comfuntion.Submenu2.smenu();

        //notification system
        /*
        if ( data.user02D.user2.t1 == true ){
            data.user02D.user2.t1 = false;

            System.out.println ( );

            System.out.println ( data.User01D.user.fullname + " has transferred " + com.company.user01.userinputnumber2 + '$' + ' ' + "to your account" );
        }

        else if ( data.user02D.user2.t4 == true){
            data.user02D.user2.t4 = false;

            System.out.println ( );

            System.out.println ( data.User04D.user4.fullname + " has transferred " + com.company.user04.userinputnumber2 + '$' + ' ' + "to your account" );
        }
        */

        System.out.println ( );


    }

}
