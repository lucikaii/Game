package br.senai.sp.game.Model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Register {

    int validaPrint = 0;

    Player player = new Player();
    Enemy enemy = new Enemy();

    String answer;
    Scanner keyboard = new Scanner(System.in);

    public void Choice(){


        String registerchoice;
        System.out.println("Choose your register method: ");
        System.out.println("1- both | 2- player | 3- enemy");
        registerchoice = keyboard.next();

        switch (registerchoice){

            case "player":
                PlayerRegister();
                break;

            case "enemy":
                EnemyRegister();
                break;

            case  "both":
                BothRegister();
                break;

            default:
                System.out.println("Choose a valid alternative");
        }

        System.out.println("Wanna return to register?");
        int continuar = keyboard.nextInt();

        if(continuar==1){
            Choice();
        }
    }



    /** Instanciando*/

    Output output = new Output();

    public void BothRegister(){

        validaPrint = 1;
        PlayerRegister();
        EnemyRegister();
        output.Printplayer(player);
        output.Printenemy(enemy);
    }

    public void PlayerRegister(){

        System.out.println("---------- Player Register ----------");
        System.out.print("What's your name: ");
        player.name = keyboard.next();
        System.out.print("Choose your skin (red - blue - purple) : ");
        player.skin = keyboard.next();
        System.out.println("---------- Sucessfull Register ----------");

        if (validaPrint != 1) {
            output.Printplayer(player);
        }
    }

    public void EnemyRegister(){

        System.out.println("---------- Enemy Register ----------");
        System.out.print("What's your name: ");
        enemy.name = keyboard.next();
        System.out.print("Choose your skin (red - blue - purple) : ");
        enemy.skin = keyboard.next();
        System.out.println("---------- Sucessfull Register ----------");

        if(validaPrint != 1) {
            output.Printenemy(enemy);
        }
    }
}
