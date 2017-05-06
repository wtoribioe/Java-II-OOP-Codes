/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplegeometricobject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wilfrido
 */
public class CircleFromSimpleGeometricObjectTest {
    
    public CircleFromSimpleGeometricObjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRadius method, of class CircleFromSimpleGeometricObject.
     */
    @Test
    public void testGetRadius() {
        System.out.println("getRadius");
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(5);
        double expResult = 5.0;
        double result = circle.getRadius();
        assertEquals(expResult,result,0.0);
        System.out.println("Result:" + result);
        System.out.println("ExpResult:" + expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of seRadius method, of class CircleFromSimpleGeometricObject.
     */
    @Test
    public void testSeRadius() {
        System.out.println("seRadius");
        double radius = 5.0;
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject();
        circle.seRadius(radius);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getArea method, of class CircleFromSimpleGeometricObject.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(5);
        double expResult = 78.53981633974483;
        double result = circle.getArea();
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getDiameter method, of class CircleFromSimpleGeometricObject.
     */
    @Test
    public void testGetDiameter() {
        System.out.println("getDiameter");
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(5);
        double expResult = 10.0;
        double result = circle.getDiameter();
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getePerimeter method, of class CircleFromSimpleGeometricObject.
     */
    @Test
    public void testGetePerimeter() {
        System.out.println("getPerimeter");
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(8);
        double expResult = 50.26548245743669;
        double result = circle.getPerimeter();
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class CircleFromSimpleGeometricObject.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject();
        String expResult = "White";
        String result = circle.getColor();
        assertEquals(expResult, result);
        System.out.println(expResult);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SetColor method, of class CircleFromSimpleGeometricObject.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "Black";
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject();
        circle.setColor(color);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of printCircle method, of class CircleFromSimpleGeometricObject.
     */
    @Test
    public void testPrintCircle() {
        System.out.println("printCircle");
        CircleFromSimpleGeometricObject instance = new CircleFromSimpleGeometricObject();
        instance.printCircle();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPerimeter method, of class CircleFromSimpleGeometricObject.
     */
    @Test
    public void testGetPerimeter() {
        System.out.println("getPerimeter");
        CircleFromSimpleGeometricObject instance = new CircleFromSimpleGeometricObject();
        double expResult = 0.0;
        double result = instance.getPerimeter();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
