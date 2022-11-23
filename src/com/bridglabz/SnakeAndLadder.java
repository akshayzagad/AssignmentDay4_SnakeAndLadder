package com.bridglabz;

public class SnakeAndLadder {
    static public final int Starting_Position_Of_Player=0;
    static public final int Ending_Position_Of_Player=100;
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder ");
int die_Roll=(int)Math.floor((Math.random()*10)%7);
        System.out.println(die_Roll);
    }
}
