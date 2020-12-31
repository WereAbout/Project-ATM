package Mainp.User01;

import data.User01D.personal;

public class DisplayU1 {

    static int userinputnumber1;

    static int userinputnumber2;

    public static void screen1(){

        System.out.println ( );
        System.out.println ("welcome " +( personal.fullname ));

        System.out.println ( );

        Mainp.User01.Comfuntion.SuperMenu.SM();

    }

    public static void userinfo(){

        System.out.println ( );

        System.out.println ("First Name : " + personal.firstname );
        System.out.println ("Last Name : " + personal.lastname );
        System.out.println ("Age : " + personal.age );

        System.out.println ( );

        System.out.println ("Current Account Balence : " + data.User01D.account.accountbalence + '$');

        System.out.println ( );


    }

    //data.User01D.account.

    public static void userversioninfo(){
        System.out.println ( );

        System.out.println ("First Name : " + personal.firstname );
        System.out.println ("Last Name : " + personal.lastname );
        System.out.println ("Age : " + personal.age );

        System.out.println ( );

        System.out.println ("Current Account Balence : " + data.User01D.account.accountbalence );

        System.out.println ( );

        Mainp.User01.Comfuntion.SuperMenu.SM();

        // notification system
        /*
        if ( user.t2 ){
            data.User01D.user.t2 = false;

            System.out.println ( );

            System.out.println ( data.user02D.user2.fullname + " has transferred " + com.company.user02.userinputnumber1 + '$' + ' ' + "to your account" );
        }

        else if ( user.t4 ){
            data.User01D.user.t4 = false;

            System.out.println ( );

            System.out.println ( data.User04D.user4.fullname + " has transferred " + com.company.user04.userinputnumber1 + '$' + ' ' + "to your account" );
        }
        */

        System.out.println ( );


    }

    // this is the menu after the user log's in




  }




