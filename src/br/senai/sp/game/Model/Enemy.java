package br.senai.sp.game.Model;

public class Enemy {

    public String name;
    public String skin;

    private int life;

    public Enemy(){

        life = 100;
    }

    public int getLife(){

        return life;
    }
}
