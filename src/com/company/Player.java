package com.company;

public class Player {
    private String name;
    private int hitPoints;
    private String weapon;
    private int life;

    public Player() {
        this("Default", 100, "None", 3);
    }

    public Player(String name, String weapon) {
        this(name, 100, weapon, 3);
    }

    public Player(String name, int health, String weapon, int life) {
        this.name = name;

        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }

        this.weapon = weapon;

        if (life > 0 && life <= 3) {
            this.life = life;
        }
    }

    public void loseHealth(int damage) {
        this.hitPoints -= damage;
        System.out.println("The damage is done - " + damage);
        System.out.println(this.name + " have " + getHealth() + " hit points");
        if (this.hitPoints < 0) {
            System.out.println("You are done");
            loseLife();
        }
    }

    public int getHealth() {
        return hitPoints;
    }

    private void loseLife() {
        this.life--;
        System.out.println("You still have " + this.life + " lives left");

        if (this.life == 0) {
            System.out.println("Game over");
        }
    }

}
