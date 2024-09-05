/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.aulas.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lkreuch
 */
public class PointTest {
    
    public PointTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of identifyQuadrant method, of class Point.
     */
    @Test
    public void testIdentifyQuadrant() {
        System.out.println("identifyQuadrant");
        
        assertEquals(Quadrant.NONE, new Point().identifyQuadrant());
        assertEquals(Quadrant.FIRST, new Point(1, 1).identifyQuadrant());
        assertEquals(Quadrant.SECOND, new Point(-1, 1).identifyQuadrant());
        assertEquals(Quadrant.THIRD, new Point(-1, -1).identifyQuadrant());
        assertEquals(Quadrant.FOURTH, new Point(1, -1).identifyQuadrant());
    }
    
    /**
     * Test of isAffectingX method, of class Point.
     */
    @Test
    public void testIsAffectingX() {
        System.out.println("isAffectingX");
        Point instance = new Point();
        boolean expResult = false;
        boolean result = instance.isAffectingX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAffectingY method, of class Point.
     */
    @Test
    public void testIsAffectingY() {
        System.out.println("isAffectingY");
        Point instance = new Point();
        boolean expResult = false;
        boolean result = instance.isAffectingY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateDistance method, of class Point.
     */
    @Test
    public void testCalculateDistance_Point() {
        System.out.println("calculateDistance");
        Point point = null;
        Point instance = new Point();
        double expResult = 0.0;
        double result = instance.calculateDistance(point);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateDistance method, of class Point.
     */
    @Test
    public void testCalculateDistance_Point_Point() {
        System.out.println("calculateDistance");
        Point point1 = null;
        Point point2 = null;
        double expResult = 0.0;
        double result = Point.calculateDistance(point1, point2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class Point.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Point instance = new Point();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Point.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Point instance = new Point();
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Point.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Point instance = new Point();
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Point.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Point instance = new Point();
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
