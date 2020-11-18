package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static String coorBearing;
    public static String instructs;
    private static Coordinates changePositionBy = new Coordinates(0, 0);    //Defualt value, will be changed when run
    public static Coordinates coorInts = new Coordinates(0, 0); //Defualt value, will be changed when run
    public static char initialBearing;

    public static void main(String[] args) {
        coorBearing = "1 2 N";
        instructs = "LMMRMRR MM     M";
        turnCoorIntoInts(coorBearing, instructs);
        Robot robot1 = new Robot(coorInts, initialBearing, instructs);
    }

    public static void turnCoorIntoInts(String coorBearingToConvert, String instructsToConvert){
        String[] splitString = coorBearingToConvert.split("\\s");
        coorInts.setX(Integer.parseInt(splitString[0]));    //Turns the first number into an integer and gives it to the array at index 0.
        coorInts.setY(Integer.parseInt(splitString[1]));    //Turns the second number into an integer and gives it to the array at index 1.
        initialBearing = splitString[2].charAt(0);  //Turns the bearing into a character type and gives it to the initalBearing variable.
        instructs = instructsToConvert.replaceAll("\\s",""); //Removes spaces from the instructs parameter.
    }

    public static void printResult(Robot robot1){
        System.out.println(robot1.toString());
    }
}
