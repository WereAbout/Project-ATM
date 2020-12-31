package Mainp.User02.Comfuntion;

import Mainp.Main;
import Mainp.User01.Comfuntion.SuperMenu;

import java.util.Scanner;

public class Submenu2 {
    public static void smenu() {
        Scanner reader = new Scanner(System.in);

        System.out.println ("select anyone of the following : (1 / 2)");
        System.out.println ("1).Back to the menu");
        System.out.println ("2).Log out ");

        int userdepositmenuoption = reader.nextInt ();

        switch (userdepositmenuoption) {
            case 1 -> Mainp.User02.Comfuntion.SuperMenu2.SM();
            case 2 -> Main.page();
            default -> smenu();
        }
    }
}
