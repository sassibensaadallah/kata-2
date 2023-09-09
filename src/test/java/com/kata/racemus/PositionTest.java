package com.kata.racemus;

import com.kata.racemus.objects.Orientation;
import com.kata.racemus.objects.Position;
import com.kata.racemus.utils.Constants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PositionTest {
    Position position;
    @BeforeEach
    public void init(){
        position=new Position(1,2, Orientation.N);
    }
    @BeforeAll
    public static void initMax(){
        Constants.setMaxX(5);
        Constants.setMaxY(5);
    }
    @Test
    public void testTurnLeft(){
        position.turnLeft();
        Assertions.assertEquals(position,new Position(1,2,Orientation.W));
    }
    @Test
    public void testTurnRight(){
        position.turnRight();
        Assertions.assertEquals(position,new Position(1,2,Orientation.E));
    }
    @Test
    public void testAvancer(){
        position.avancer();
        Assertions.assertEquals(position,new Position(1,3,Orientation.N));
    }

    @Test
    public void testMixOperation(){
        position.turnLeft();
        position.avancer();
        position.turnRight();
        position.avancer();
        position.turnLeft();
        position.avancer();
        position.avancer();
        position.avancer();
        position.turnRight();
        position.avancer();
        Assertions.assertEquals(position,new Position(0,4, Orientation.N));

    }

}
