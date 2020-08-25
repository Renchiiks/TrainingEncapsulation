package com.company;

public class Main {

    public static void main(String[] args) {

        Player player = new Player("Ren", 80, "bow", 3);
        Player player1 = new Player("Kalm", "Sword");
        Player player2 = new Player();

        player.loseHealth(15);
        player1.loseHealth(15);
        player2.loseHealth(15);

        player.loseHealth(85);

    }
}
