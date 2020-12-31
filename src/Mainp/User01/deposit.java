package Mainp.User01;

//import data.User01D.user;

import java.util.Scanner;

public class deposit {

    public static void Function() {

        Scanner reader = new Scanner(System.in);

        System.out.println ( );

        System.out.print("Amount : ");

        long userdeposit = reader.nextLong ();

        data.User01D.account.accountbalence += userdeposit;

        System.out.println ( );

        System.out.println ("Current balence : " + data.User01D.account.accountbalence + '$' );

        System.out.println ( );

        Mainp.User01.Comfuntion.Submenu.smenu();

    }

}
