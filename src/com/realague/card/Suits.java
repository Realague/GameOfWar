/**
 * Suits enum.
 * Homework Assignment: GameOfWar
 *
 * @author Julien Delane
 * @version 1.00 28/01/2020
 */

package com.realague.card;

/**
 * Enum that represent the card suit.
 */
public enum Suits {

    CLUBS("Clubs"),
    SPADES("Spades"),
    HEARTS("Hearts"),
    DIAMONDS("Diamonds");

    /**
     * Printed name of this suit.
     */
    private final String name;

    /**
     * Constructor of the enum.
     *
     * @param name, printed name of the suit
     */
    Suits(String name) {
        this.name = name;
    }

    /**
     * Overriding toString.
     *
     * @return printed name of the suit
     */
    @Override
    public String toString() {
        return name;
    }
}
