package br.senai.sp.game.Model;

import java.util.Scanner;

public class Menu {

    public void Menu(){

        Scanner keyboard = new Scanner(System.in);
        Register register = new Register();
        Battle battle = new Battle();
        

        boolean continuar = true;

        while(continuar){

            System.out.println("---------------------------------------------------------------");
            System.out.println("------------------------- WELCOME -----------------------------");
            System.out.println("CHOICE ONE OF THE OPTIONS: ");
            System.out.println("1 - REGISTER");
            System.out.println("2 - BATTLE");
            System.out.println("3 - EXIT");

            System.out.println("---------------------------------------------------------------");

            int menuChoice = keyboard.nextInt();
            switch (menuChoice){

                case 1:
                    register.Choice();
                    break;
                case 2:
                   battle.ChoiceScenario();
                   battle.Battle(register.player, register.enemy);
                    System.out.println("COMING SOON: FEATURE IN DEVELOPMENT");
                case 3:
                    continuar = false;
                    break;
            }
        }

    }
}
