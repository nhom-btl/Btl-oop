/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DINO;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HoangAnh
 */
public class SkyTest {
    
    public SkyTest() {
    }
//test_1
    @Test
    public void testSkyInitialization() {
        Sky sky = new Sky();
        assertEquals(0, sky.x1);
        assertEquals(0, sky.y1);
        assertEquals(780, sky.x2);
        assertEquals(0, sky.y2);
        assertNotNull(sky.imgbgr);
    }   
//test_2
    @Test
    public void testSomeMethod() {
         Sky sky = new Sky();
        int initialX1 = sky.x1;
        int initialX2 = sky.x2;

        sky.Update();
        int newX1 = sky.x1;
        int newX2 = sky.x2;

        assertTrue(newX1 < initialX1);
        assertTrue(newX2 < initialX2);
        assertTrue(newX1 + 780 == newX2 || newX2 + 780 == newX1);
    }
//test_3
    @Test
    public void testGetY() {
        Sky sky = new Sky();
        assertEquals(sky.getY(), 0);
    }
//test_4
    @Test
    public void testUpdate() {
        Sky sky = new Sky();
        int initX1 = sky.x1;
        int initX2 = sky.x2;
        int gameSpeed = 2;
        Main.gamespeed = gameSpeed;
        sky.Update();
        assertEquals(sky.x1, initX1 - gameSpeed);
        assertEquals(sky.x2, initX2 - gameSpeed);
    }
//test_5
    @Test
    public void testSkyConstructor() {
        Sky sky = new Sky();
        assertNotNull(sky.imgbgr);
        assertEquals(sky.x1, 0);
        assertEquals(sky.y1, 0);
        assertEquals(sky.x2, 780);
        assertEquals(sky.y2, 0);
    }
}