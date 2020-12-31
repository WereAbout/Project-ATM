package Mainp.User02;

import Mainp.Main;

import java.util.Scanner;

public class withdraw {
    public static void function() {
       // user2 user = new user2();

        Main main = new Main();

        Scanner reader = new Scanner(System.in);

        System.out.println ( );

        System.out.print("Amount : ");

        long userdeposit = reader.nextLong ();

        data.User02D.account.accountbalence -= userdeposit;

        System.out.println ( );

        System.out.println ("Current balence : " + data.User02D.account.accountbalence + '$');

        System.out.println ( );

        Mainp.User02.Comfuntion.Submenu2.smenu();
    }
}
