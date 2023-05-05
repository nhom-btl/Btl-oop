/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DINO;

import static DINO.Main.posx;
import static DINO.Main.posy;
import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg2dgamesframework.SoundPlayer;

/**
 *
 * @author HBC
 */
public class test4 {
    public Dinosaur test;
    public test4() {
        test = new Dinosaur(posx,posy,80,80);
    }
    
   
    // kiểm tra chức năng update có đúng hay không
    @Test
    public void test1() {
        test.update(0);
        if(test.getPosY()>=120 & test.getPosY()<=320 & test.isJumping == true){
            assertEquals(false,test.isdrop);
        }
        if(test.getPosY()>=120 & test.getPosY()<=320 & test.isdrop == true){
            assertEquals(false,test.isJumping);
        }
         test.update(0);
        if(test.getPosY() == 320 ){
            assertEquals(false,test.isJumping);
            assertEquals(false,test.isdrop);
        }
        
        
    }
    // kiểm tra có mở được file âm thanh hay không
    @Test
    public void test2() {
        SoundPlayer jumptest = new SoundPlayer(new File("sound/jump.wav"));
        assertNotNull(jumptest);
    }

    
    
}
