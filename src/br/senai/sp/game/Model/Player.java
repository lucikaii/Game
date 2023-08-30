package br.senai.sp.game.Model;

public class Player {

       public String name;
       public String skin;

       private int life;

       public Player(){

              life = 100;
       }

       public int getLife(){

              return life;
       }
       public void SubtractLife(int danoEnemy){
              life -= danoEnemy;

              if (life < 0){
                     life = 0;
              }
       }

}
