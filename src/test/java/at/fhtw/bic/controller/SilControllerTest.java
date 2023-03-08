package at.fhtw.bic.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SilControllerTest {
    private SilController silController;

    @BeforeEach
    void setUp() {
        silController = new SilController();
    }

    @Test
    void testCalcCircleArea() {
        double input = 2.0;
        double expectedOutput = 12.5663704;
        double actualOutput = silController.calcCirceArea(input);

        Assertions.assertEquals(expectedOutput, actualOutput, 0.0001, "Circle area calculation is incorrect.");
    }

}