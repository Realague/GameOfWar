/**
 * Main class.
 * Homework Assignment: GameOfWar
 *
 * @author Julien Delane
 * @version 1.00 28/01/2020
 */
package com.realague;

public class Main {

    public static void main(String[] args) {
        if (args.length == 1) {
            GameOfWar gameOfWar = new GameOfWar(Integer.parseInt(args[0]));
            gameOfWar.setupGameOfWar();
            gameOfWar.startGameOfWar();
        } else {
            System.out.println("Error: missing argument");
        }
    }
}
