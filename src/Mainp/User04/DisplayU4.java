package Mainp.User04;

import Mainp.User04.Comfuntion.SuperMenu3;
import data.User04D.personal;

public class DisplayU4 {

    static int userinputnumber1;

    static int userinputnumber2;

    public static void screen1(){

        System.out.println ( );
        System.out.println ("welcome " +( personal.fullname ));

        System.out.println ( );

        userversioninfo();

        SuperMenu3.SM();

    }

    public static void userinfo(){

        System.out.println ( );

        System.out.println ("First Name : " + personal.firstname);
        System.out.println ("Last Name : " + personal.lastname );
        System.out.println ("Age : " + personal.age);

        System.out.println ( );

        System.out.println ("Current Account Balence : " + data.User04D.account.accountbalence + '$');

        System.out.println ( );


    }

    public static void userversioninfo(){

        System.out.println ( );

        System.out.println ("First Name : " + personal.firstname );
        System.out.println ("Last Name : " + personal.lastname );
        System.out.println ("Age : " + personal.age );

        System.out.println ( );

        System.out.println ("Current Account Balence : " + data.User04D.account.accountbalence + '$');

        //notification system
        /*
        if ( data.User04D.user4.t1 == true ){
            data.User04D.user4.t1 = false;

            System.out.println ( );

            System.out.println ( data.User01D.user.fullname + " has transferred " + com.company.user01.userinputnumber2 + '$' + ' ' + "to your account" );
        }

        else if ( data.User04D.user4.t2 == true){
            data.User04D.user4.t2 = false;

            System.out.println ( );

            System.out.println ( data.user02D.user2.fullname + " has transferred " + com.company.user02.userinputnumber2 + '$' + ' ' + "to your account" );
        }
        */
        System.out.println ( );


    }












}
