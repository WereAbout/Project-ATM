package Mainp.User01.Comfuntion;

import Mainp.Main;

import java.util.Scanner;

public class Submenu {
    public static void smenu() {
        Scanner reader = new Scanner(System.in);

        System.out.println ("select anyone of the following : (1 / 2)");
        System.out.println ("1).Back to the menu");
        System.out.println ("2).Bog out ");

        int userdepositmenuoption = reader.nextInt ();

        switch ( userdepositmenuoption ) {
            case 1:
                Mainp.User01.Comfuntion.SuperMenu.SM();
                break;
            case 2:
                Main.page();
                break;
            default:
                Mainp.User01.Comfuntion.Submenu.smenu();
                break;
        }
    }
}
