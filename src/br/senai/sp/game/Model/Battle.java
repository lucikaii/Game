package br.senai.sp.game.Model;

import java.util.Scanner;

public class Battle {

    Scanner keyboard = new Scanner(System.in);
    public void ChoiceScenario(){

        String scenariobattle;


        Scenario scenario = new Scenario();


        System.out.println("---------------------------------------------------------------");
        System.out.println("Choice the scenario");
        System.out.println("1 - Hospital Abandonado de Jandira  | 2 - Praça de Eventos de Jandira | 3 - Tablado de Jandira");
        System.out.println("---------------------------------------------------------------");

        int choiceScenario = keyboard.nextInt();
        scenariobattle = scenario.Scenario(choiceScenario);

    }
    public void Battle(Player player, Enemy enemy){

        while (true) {

            int lifePlayer = player.getLife();
            int lifeEnemy = enemy.getLife();

            if (lifeEnemy == 0) {
                System.out.println(" PLAYER " + player.name + " WON");
                break;
            } else if (lifePlayer == 0) {
                System.out.println("ENEMY " + enemy.name + " WON");
                break;
            }

            System.out.println("-------------------------- BATTLE -----------------------------");
            System.out.println(" Player Attack [E]" + player.name);
            System.out.println("Enemy Attack [M]");
            System.out.println("---------------------------------------------------------------");

            String attack = keyboard.next();

            if (attack.equalsIgnoreCase("E")) {

                System.out.println("-------------------");
                System.out.println("  PLAYER ATTACKED  ");


                int danoPlayer = (int) (Math.random() * 20) + 1;

                enemy.SubtractLife(danoPlayer);

                System.out.println("Attack: " + danoPlayer);
                System.out.println("-------------------");

                int defEnemy = (int) (Math.random() * 20) + 1;
                int danoReal = defEnemy - danoPlayer;

            } else if (attack.equalsIgnoreCase("M")) {

                System.out.println("-------------------");
                System.out.println("  ENEMY ATTACKED  ");


                int danoEnemy = (int) (Math.random() * 20) + 1;

                player.SubtractLife(danoEnemy);

                System.out.println("Attack: " + danoEnemy);
                System.out.println("-------------------");

            } else {
                System.out.println("INVALID KEY");
            }
        }

    }
}
