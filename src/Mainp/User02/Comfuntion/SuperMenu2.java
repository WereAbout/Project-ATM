package Mainp.User02.Comfuntion;

import Mainp.Main;
import Mainp.User02.DisplayU2;
import Mainp.User02.deposit;
import Mainp.User02.transfer;
import Mainp.User02.withdraw;

import java.util.Scanner;

public class SuperMenu2 {


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
                deposit.function();
                break;
            case 2:
                withdraw.function();
                break;
            case 3:
                transfer.function();
                break;
            case 4:
                DisplayU2.userversioninfo();
                break;
            case 5:
                System.out.println("Current Account Balence : " + data.User02D.account.accountbalence + '$');
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
