package Mainp.User04.Comfuntion;

import Mainp.Main;
import Mainp.User04.DisplayU4;

import java.util.Scanner;

public class SuperMenu3 {


    public static void SM()
    {

        Scanner reader = new Scanner(System.in);

        System.out.println();

        System.out.println(" Select any one of the following option : (1 , 2 , 3...)");
        System.out.println("1). Deposit funds ");
        System.out.println("2). Withdraw funds ");
        System.out.println("3). Transfer funds ");
        System.out.println("4). View User Info");
        System.out.println("5). View Account Balance");
        System.out.println("6). Log out");

        int useroption = reader.nextInt();

        switch (useroption) {
            case 1:
                Mainp.User04.deposit.function();
                break;
            case 2:
                Mainp.User04.withdraw.function();
                break;
            case 3:
                Mainp.User04.transfer.function();
                break;
            case 4:
                DisplayU4.userversioninfo();
                break;
            case 5:
                System.out.println("Current Account Balence : " + data.User04D.account.accountbalence + '$');
                SM();
                break;
            case 6:
                Main.page();
                break;
            default:
                break;
        }

    }
}
