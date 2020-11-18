package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static String coorBearing;
    public static String instructs;

    public static void main(String[] args) {
        coorBearing = args[0] + " " + args[1] + " " + args[2];
        instructs = args[3];
        Robot robot1 = new Robot(coorBearing, instructs);
    }

}
