/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DINO;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HBC
 */
public class test1 {
    public DiamondGroup test ;
    public test1() {
        test = new DiamondGroup();
    }

    @Test
    public void test8() {
        
        assertNotNull(test.imgdia);
        
    }

    @Test
    public void test9() {
        for(int i = 0 ;i<7;i++){
            assertEquals((int)test.getdia(i).getPosX()+260, (int)test.getdia(i+1).getPosX());
        }
    }

    @Test
    public void test10() {
        for(int i = 0 ;i<7;i++){
            int t = (int) test.getdia(i).getPosX();
            test.getdia(i).update();
            assertEquals( t-2 , (int)test.getdia(i).getPosX() );

        }
    }
    
}
