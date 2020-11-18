package Tests;

import com.company.Coordinates;
import com.company.Main;
import com.company.Robot;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {
/*
    Coordinates coordinates = new Coordinates(1, 1);
    Robot testRobot = new Robot(coordinates, 'N');

    @Test
    public void canCreateRobot() {    //Tests that a Robot object is made correctly with the right parameters.
        assertEquals(coordinates, testRobot.getCoorInts());
        assertEquals('N', testRobot.getBearing());
    }

    @Test
    public void moveRobotcoords() {  //Tests that a robots coordinates change appropriately according to desired amount.
        Coordinates moveDirection = new Coordinates(1, 0);  //Move right 1 place.
        testRobot.moveRobot(moveDirection);
        assertEquals("2 1", "" + testRobot.coorInts.getX() + " " + testRobot.coorInts.getY());
    }

    @Test
    public void convertTypesInitalInput(){  //This test checks the initial inputs are converted to the correct types/format.
        Main.turnCoorIntoInts("1 2 N", "LM LML   M  LM M");
        assertEquals("1 2", "" + Main.coorInts.getX() + " " + Main.coorInts.getY());
        assertEquals('N', Main.initialBearing);
        assertEquals("LMLMLMLMM", Main.instructs);
    }

    @Test
    public void printingFinalCoordinates(){ //This tests the coordinates and bearing of the robot are converted to a string correctly.
        assertEquals("1 1 N", testRobot.toString());
    }

    @Test
    public void followingInstructions(){
        Main.instructs = "RMMRM";
        Main.setupInitialChangePosBy(testRobot.getBearing());
        Main.followInstructs(testRobot);

        assertEquals("3 0 S", "" + testRobot.coorInts.getX() + " " + testRobot.coorInts.getY() + " " + testRobot.getBearing());
    }

 */
}