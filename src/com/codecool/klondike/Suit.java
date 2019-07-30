package com.codecool.klondike;

public enum Suit {
    HEARTS("hearts", "red", 1),
    DIAMONDS("diamonds", "red", 2),
    SPADES("spades", "black", 3),
    CLUBS("clubs", "black", 4);

    private String suit;
    private String color;
    private int id;

    Suit(String suit, String color, int id){
        this.suit = suit;
        this.color = color;
        this.id = id;
    }

    public String getSuit() {
        return suit;
    }

    public String getColor() {
        return color;
    }

    public int getId(){
        return id;
    }
}
