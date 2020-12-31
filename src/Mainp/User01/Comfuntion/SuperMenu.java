package Mainp.User01.Comfuntion;

import Mainp.Main;

import java.util.Scanner;
import data.User01D.*;

public class SuperMenu{


    public static void SM()
    {

        Scanner reader = new Scanner(System.in);

        System.out.println();


        System.out.println(" Select any one of the following option : (1, 2, 3, 4...)");
        System.out.println("1). Deposit funds ");
        System.out.println("2). Withdraw funds ");
        System.out.println("3). Transfer funds ");
        System.out.println("4). View User Info");
        System.out.println("5). View Account Balance");
        System.out.println("6). Log out");


        int useroption = reader.nextInt(); 

        switch (useroption) {
            case 1:
                Mainp.User01.deposit.Function();
                break;
            case 2:
                Mainp.User01.withdraw.Function();
                break;
            case 3:
                Mainp.User01.transfer.Function();
                break;
            case 4:
                Mainp.User01.DisplayU1.userversioninfo();
                break;
            case 5:
                System.out.println("Current Account Balence : " + data.User01D.account.accountbalence + '$');
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
