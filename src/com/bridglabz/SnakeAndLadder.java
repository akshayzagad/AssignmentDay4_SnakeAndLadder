package com.bridglabz;

public class SnakeAndLadder {
    static public final int Starting_Position_Of_Player=0;
    static public final int Ending_Position_Of_Player=100;
    public static final  int ladder=2;
    public static final int snake=1;
    public static final int noplay=0;
    public static int roolldie(){
        int dievalue =(int)Math.floor(Math.random()*10)%6+1;
        return dievalue;
    }
    public static void main(String[] args) {
        int roolldie=roolldie();
        int currentPosion=0;
        int checkPosition= (int)Math.floor(Math.random()*10)%3;
        switch (checkPosition){
            case snake:
                currentPosion=roolldie-snake;
                System.out.println("player is on snake " +checkPosition);
                break;
            case  ladder:
                currentPosion=ladder+roolldie;
                System.out.println("player is on Ladder " +currentPosion);
                break;
                default:
                System.out.println("player is not play " );
        }
    }
    }

