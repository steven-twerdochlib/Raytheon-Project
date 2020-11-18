package Tests;

import com.company.Coordinates;
import com.company.Main;
import com.company.Robot;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {

    String coordinatesBearing = "1 0 N";
    String instructions = "LM LML   M  LM M";
    Robot testRobot = new Robot(coordinatesBearing, instructions);

    @Test
    public void moveRobotcoords() {  //Tests that a robots coordinates change appropriately according to desired amount.
        Coordinates moveDirection = new Coordinates(1, 0);  //Move right 1 place.
        testRobot.moveRobot(moveDirection);
        assertEquals("2 1", "" + testRobot.coorInts.getX() + " " + testRobot.coorInts.getY());
    }

    @Test
    public void convertTypesInitalInput(){  //This test checks the initial inputs are converted to the correct types/format.
        testRobot.turnCoorIntoInts("1 2 N", "LM LML   M  LM M");
        assertEquals("1 2", "" + testRobot.coorInts.getX() + " " + testRobot.coorInts.getY());
        assertEquals('N', testRobot.initialBearing);
        assertEquals("LMLMLMLMM", testRobot.instructs);
    }

    @Test
    public void checkInitalChangeByCoor(){  //This checks the initial changeByCoordinates in the robot class is set up correctly corresponding to the given bearing.
        testRobot.setupInitialChangePosBy('W');
        assertEquals("-1 0", testRobot.changePositionBy.toString());
    }

    @Test
    public void printingFinalCoordinates(){ //This tests the coordinates and bearing of the robot are converted to a string correctly.
        assertEquals("1 1 N", testRobot.toString());
    }

    @Test
    public void followingInstructions(){
        testRobot.instructs = "RMMRM";
        testRobot.setupInitialChangePosBy(testRobot.getBearing());
        testRobot.followInstructs();

        assertEquals("3 0 S", "" + testRobot.coorInts.getX() + " " + testRobot.coorInts.getY() + " " + testRobot.getBearing());
    }


}