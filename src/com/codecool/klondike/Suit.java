package com.codecool.klondike;

public enum Suit {
    HEARTS("hearts", "black"),
    DIAMONDS("diamonds", "black"),
    SPADES("spades", "black"),
    CLUBS("clubs", "black");

    public String suit;
    public String color;

    Suit(String suit, String color){
        this.suit = suit;
        this.color = color;
    }

    public String getSuit() {
        return suit;
    }

    public String getColor() {
        return color;
    }
}
