/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DINO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HoangAnh
 */

public class GroundTest {
    
    public GroundTest() {
    }
//test_1
    @Test
     public void testGetSetX2() {
        Ground ground = new Ground();
        ground.setX2(500);
        assertEquals(500, ground.getX2());
    }
//test_2
     @Test
    public void testGetSetY2() {
        Ground ground = new Ground();
        ground.setY2(600);
        assertEquals(600, ground.getY2());
    }
//test_3
    @Test
    public void testConstructor() {
        Ground ground = new Ground();
        assertEquals(0, ground.getX1());
        assertEquals(400, ground.getY1());
        assertEquals(780, ground.getX2());
        assertEquals(400, ground.getY2());
    }
//test_4
    @Test
    public void testUpdate() {
        Ground ground = new Ground();
        ground.setX1(0);
        ground.setY1(400);
        ground.setX2(780);
        ground.setY2(400);
        ground.update();
        assertEquals(-780, ground.getX1());
        assertEquals(0, ground.getX2());
    }
//test_5
    @Test
    public void testGetSetX1() {
        Ground ground = new Ground();
        ground.setX1(100);
        assertEquals(100, ground.getX1());
    }
    @org.junit.Test
    public void testGetX1() {
    }

    @org.junit.Test
    public void testSetX1() {
    }

    @org.junit.Test
    public void testGetY1() {
    }

    @org.junit.Test
    public void testSetY1() {
    }

    @org.junit.Test
    public void testGetX2() {
    }

    @org.junit.Test
    public void testSetX2() {
    }

    @org.junit.Test
    public void testGetY2() {
    }

    @org.junit.Test
    public void testSetY2() {
    }
}
