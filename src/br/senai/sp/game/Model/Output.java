package br.senai.sp.game.Model;

public class Output {

    public void Printplayer(Player player){

        /** Printar informações*/

        System.out.println("");
        System.out.println("=========================================================");
        System.out.println("++++++++++++++++++++++ Player +++++++++++++++++++++++++++");
        System.out.println("Player name: " + player.name);
        System.out.println("Player skin: " + player.skin);
        System.out.println("Your life: " + player.getLife());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("=========================================================");

    }
    public void Printenemy(Enemy enemy){

        System.out.println("");
        System.out.println("=========================================================");
        System.out.println("++++++++++++++++++++++ Enemy +++++++++++++++++++++++++++");
        System.out.println("Enemy name: " + enemy.name);
        System.out.println("Enemy skin: " + enemy.skin);
        System.out.println("Enemy's life: " + enemy.getLife());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("=========================================================");

    }

}
