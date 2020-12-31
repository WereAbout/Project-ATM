package Mainp.User02;

import java.util.Scanner;

public class deposit {
    public static void function() {

        Scanner reader = new Scanner(System.in);

        System.out.println ( );

        System.out.print("Amount : ");

        long userdeposit = reader.nextLong ();

        data.User02D.account.accountbalence += userdeposit;

        System.out.println ( );

        System.out.println ("Current balence : " + data.User02D.account.accountbalence + '$');

        System.out.println ( );

        Mainp.User02.Comfuntion.Submenu2.smenu();
    }
}
