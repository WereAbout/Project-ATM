package Mainp.Admin;

import java.util.Scanner;
import data.User01D.*;

public class user1 {
    public static void user1A(){
        Scanner read = new Scanner(System.in);

        System.out.println();
        System.out.println();

        System.out.println("What do you want to do:");
        System.out.println("1).View User info");
        System.out.println("2).View Account log-in info");
        System.out.println("3).Log-in as this user");

        String option = read.nextLine();

        switch (option){
            case "1":
                userinfo();
            break;
            case "2":
                System.out.println(data.User01D.account.accountnumber);
                System.out.println(data.User01D.account.accountpin);
            break;
            case "3":
                Login();
            break;
                
        }

    }

    public static void userinfo(){

        System.out.println ( );

        System.out.println ("First Name : " + data.User01D.personal.firstname );
        System.out.println ("Last Name : " + data.User01D.personal.lastname );
        System.out.println ("Age : " + data.User01D.personal.age );

        System.out.println ( );

        System.out.println ("Current Account Balence : " + data.User01D.account.accountbalence + '$');

        System.out.println ( );


    }

    public static void Login() {
        System.out.println();

        System.out.println("NOTE: You will have to log out and log in as ADMIN agin if you want to come back...");

        System.out.println();
        System.out.println();

        Mainp.User01.DisplayU1.screen1();
    }

    
}
