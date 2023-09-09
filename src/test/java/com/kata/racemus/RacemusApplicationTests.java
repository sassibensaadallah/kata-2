package com.kata.racemus;

import com.kata.racemus.utils.Constants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

class RacemusApplicationTests {
    List<String> list= Arrays.asList("5 5", "1 2 N","GAGAGAGAA", "3 3 E", "AADAADADDA" );
    @BeforeAll
    public static void initMax(){
        Constants.setMaxX(5);
        Constants.setMaxY(5);
    }
    @Test
    public void testCalculate(){
        Assertions.assertEquals(RacemusApplication.Calculate(list),"1 3 N 5 1 E ");
    }

    @Test
    public void testCalculatePositionPositive(){
        Assertions.assertEquals(RacemusApplication.calculatePosition(1,list),"1 3 N");
        Assertions.assertEquals(RacemusApplication.calculatePosition(3,list),"5 1 E");
    }

    @Test
    public void testCalculatePositionNegative(){
        //Test with false index
        Assertions.assertThrows(NumberFormatException.class,()->RacemusApplication.calculatePosition(2,list));
    }

}
