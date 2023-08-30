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
            System.out.println(" Player Attack [E]" + player.name + " Life: " + lifePlayer );
            System.out.println("Enemy Attack [M]" + enemy.name + " Life: " + lifeEnemy);
            System.out.println("---------------------------------------------------------------");

            String attack = keyboard.next();

            if (attack.equalsIgnoreCase("E")) {

                int danoPlayer = (int) (Math.random() * 20) + 1;

                enemy.SubtractLife(danoPlayer);

                int defEnemy = (int) (Math.random() * 20) + 1;
                int danoReal = danoPlayer - defEnemy;

                if (danoReal < 0 ){
                    danoReal = 0;
                }

                enemy.SubtractLife(danoReal);

                System.out.println("-------------------");
                System.out.println("  PLAYER ATTACKED  ");
                System.out.println("Attack: " + danoPlayer);
                System.out.println("Defense: " + defEnemy);
                System.out.println("-------------------");

            } else if (attack.equalsIgnoreCase("M")) {

                int danoEnemy = (int) (Math.random() * 20) + 1;
                int defPlayer = (int) (Math.random() * 20) + 1;

                int danoReal = danoEnemy - defPlayer;

                if (danoReal < 0){
                    danoReal = 0;
                }

                player.SubtractLife(danoReal);

                System.out.println("-------------------");
                System.out.println("  ENEMY ATTACKED  ");
                System.out.println("Attack: " + danoEnemy);
                System.out.println("Defense: " + defPlayer);
                System.out.println("-------------------");

            } else {
                System.out.println("INVALID KEY");
            }
        }

    }
}
