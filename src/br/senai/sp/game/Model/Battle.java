package br.senai.sp.game.Model;

import java.util.Scanner;

public class Battle {

    public void ChoiceScenario(){

        String scenariobattle;

        Scanner keyboard = new Scanner(System.in);
        Scenario scenario = new Scenario();


        System.out.println("---------------------------------------------------------------");
        System.out.println("Choice the scenario");
        System.out.println("1 - Torre Eiffel | 2 - Praça de Eventos de Jandira | 3 - N Tower Seoul");
        System.out.println("---------------------------------------------------------------");

        int choiceScenario = keyboard.nextInt();
        scenariobattle = scenario.Scenario(choiceScenario);

    }
    public void Battle(Player player, Enemy enemy){

        System.out.println(player);
        System.out.println(enemy);

    }
}
