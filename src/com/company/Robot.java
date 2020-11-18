package com.company;

import java.util.ArrayList;

public class Robot {

    public Coordinates coorInts = new Coordinates(0, 0);    //Defualt value, will be changed when run.
    public Coordinates changePositionBy = new Coordinates(0, 0);    //Defualt value, will be changed when run.
    public String instructs;
    public char initialBearing;
    private char bearing;

    //Constructor for a Robot object
    public Robot(String coorBearing, String instructs) {
        turnCoorIntoInts(coorBearing, instructs);
        setupInitialChangePosBy(initialBearing);
        followInstructs();
        printResult();
    }

    //This function turns the string inputs given to the robot object on creation into the appropriate types.
    public void turnCoorIntoInts(String coorBearingToConvert, String instructsToConvert){
        String[] splitString = coorBearingToConvert.split("\\s");
        coorInts.setX(Integer.parseInt(splitString[0]));    //Turns the first number into an integer and gives it to the array at index 0.
        coorInts.setY(Integer.parseInt(splitString[1]));    //Turns the second number into an integer and gives it to the array at index 1.
        initialBearing = splitString[2].charAt(0);  //Turns the bearing into a character type and gives it to the initalBearing variable.
        instructs = instructsToConvert.replaceAll("\\s",""); //Removes spaces from the instructs parameter.
    }

    public void setXCoor(int x) {
        this.coorInts.setX(x);
    }

    public void setYCoor(int y) {
        this.coorInts.setY(y);
    }



    public char getBearing() {
        return bearing;
    }

    public void setBearing(char bearing) {
        this.bearing = bearing;
    }

    public void moveRobot(Coordinates movementDirection){   //This function Actually changes the Robot objects coordinates by the given amount.
        setXCoor((coorInts.getX()+movementDirection.getX()));   //Increase/Decrease X Position by desired amount
        setYCoor((coorInts.getY()+movementDirection.getY()));   //Increase/Decrease Y position by desired amount
    }

    public void followInstructs(){  //This function follows the instructions.
        for (int i = 0; i < instructs.length(); i++) {
            if(instructs.charAt(i) == 'M'){
                moveRobot(changePositionBy);
            }
            else if(instructs.charAt(i) == 'L'){
                if(changePositionBy.getX() == 0 && changePositionBy.getY() == 1){   //Currently facing North
                    changePositionBy.setX(-1);
                    changePositionBy.setY(0);
                    setBearing('W');
                }
                else if(changePositionBy.getX() == 0 && changePositionBy.getY() == -1){    //Currently facing South
                    changePositionBy.setX(1);
                    changePositionBy.setY(0);
                    setBearing('E');
                }
                else if(changePositionBy.getX() == 1 && changePositionBy.getY() == 0){    //Currently facing East
                    changePositionBy.setX(0);
                    changePositionBy.setY(1);
                    setBearing('N');
                }
                else if(changePositionBy.getX() == -1 && changePositionBy.getY() == 0){    //Currently facing West
                    changePositionBy.setX(0);
                    changePositionBy.setY(-1);
                    setBearing('S');
                }
            }
            else if(instructs.charAt(i) == 'R'){
                if(changePositionBy.getX() == 0 && changePositionBy.getY() == 1){   //Currently facing North
                    changePositionBy.setX(1);
                    changePositionBy.setY(0);
                    setBearing('E');
                }
                else if(changePositionBy.getX() == 0 && changePositionBy.getY() == -1){    //Currently facing South
                    changePositionBy.setX(-1);
                    changePositionBy.setY(0);
                    setBearing('W');
                }
                else if(changePositionBy.getX() == 1 && changePositionBy.getY() == 0){    //Currently facing East
                    changePositionBy.setX(0);
                    changePositionBy.setY(-1);
                    setBearing('S');
                }
                else if(changePositionBy.getX() == -1 && changePositionBy.getY() == 0){    //Currently facing West
                    changePositionBy.setX(0);
                    changePositionBy.setY(1);
                    setBearing('N');
                }
            }
            else{
                // Error occurs
            }
        }
    }

    public void setupInitialChangePosBy(char initialBearing){   //This function setups up the initial coordinates that will be added to the Robots coordintes for moving the robot. Based on its initial bearing.
        if(initialBearing == 'N'){   //Currently facing North
            changePositionBy.setX(0);
            changePositionBy.setY(1);

        }
        else if(initialBearing == 'S'){    //Currently facing South
            changePositionBy.setX(0);
            changePositionBy.setY(-1);
        }
        else if(initialBearing == 'E'){    //Currently facing East
            changePositionBy.setX(1);
            changePositionBy.setY(0);
        }
        else if(initialBearing == 'W'){    //Currently facing West
            changePositionBy.setX(-1);
            changePositionBy.setY(0);
        }
    }

    public void printResult(){   //This function prints the result from the Robot object after following the instructions
        System.out.println("" + coorInts.toString() + " " + bearing);
    }

    @Override
    public String toString() {   //This function returns the key information of the Robot Object as a String
        return "" + coorInts.toString() + " " + bearing;
    }
}
