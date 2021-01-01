package Mainp.Admin;

import Mainp.Main;
import Mainp.User01.DisplayU1;
import Mainp.User02.DisplayU2;
import Mainp.User04.DisplayU4;
import data.ADMIN;

import java.util.Scanner;

public class admin extends ADMIN{


    public static void adminscreen1(){

        alluserinfo();

    }

    private static void alluserinfo(){

        Scanner reader = new Scanner(System.in);

        System.out.println ( );

        System.out.println ("select one one of the user by their account number :");
        System.out.println ("1). " + data.User01D.personal.fullname );
        System.out.println ("2). " + data.User02D.personal.fullname );
        System.out.println ("3). " + data.User04D.personal.fullname );

        int admininput = reader.nextInt ();

        switch ( admininput ){
            case 1:
                Mainp.Admin.user1.user1A();
                break;
            case 2:
                DisplayU2.user2info ();
                break;
            case 3:
                DisplayU4.userinfo ();
            default:
                break;
        }

        System.out.println ( );

        System.out.println ( );

        System.out.println (" Seclect any one of the folowing : (1 / 2) ");
        System.out.println ("1). Exit this program" );
        System.out.println ("2). Go back to the menu" );

        int admininput2 = reader.nextInt ();

        switch ( admininput2 ){
            case 1:
                Main.page ();
                break;
            case 2:
                alluserinfo();
            default:
                break;
        }

    }

    

}