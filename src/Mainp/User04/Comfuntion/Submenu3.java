package Mainp.User04.Comfuntion;

import Mainp.Main;

import java.util.Scanner;

public class Submenu3 {
    public static void smenu() {
        Scanner reader = new Scanner(System.in);

        System.out.println ("select anyone of the following : (1 / 2)");
        System.out.println ("1).Back to the menu");
        System.out.println ("2).Log out ");

        int userdepositmenuoption = reader.nextInt ();

        switch (userdepositmenuoption) {
            case 1 -> SuperMenu3.SM();
            case 2 -> Main.page();
            default -> smenu();
        }
    }
}
