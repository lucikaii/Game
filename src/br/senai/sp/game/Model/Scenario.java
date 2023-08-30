package br.senai.sp.game.Model;

public class Scenario {

    public String Scenario(int optionScenario){

        String scenario = "SESI JANDIRA";

        switch (optionScenario){

            case 1:
                scenario = "Hospital Abandonado de Jandira";
                break;
            case 2:
                scenario =  "Praça de Eventos de Jandira";
                break;
            case 3:
                scenario = "Tablado de Jandira";
                break;
        }

        return scenario;
    }
}
