package Mainp.User04;

import Mainp.User01.Comfuntion.Submenu;

import java.util.Scanner;

public class withdraw {
    public static void function(){

        Scanner reader = new Scanner(System.in);

        System.out.println ( );

        System.out.print("Amount : ");

        long userdeposit = reader.nextLong ();

        data.User04D.account.accountbalence -= userdeposit;

        System.out.println ( );

        System.out.println ("Current balence : " + data.User04D.account.accountbalence + '$');

        System.out.println ( );

        Submenu.smenu();
    }
}
