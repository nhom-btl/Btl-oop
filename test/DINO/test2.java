/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DINO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HBC
 */
public class test2 {
    public ReadFile test;
    public test2() {
        test = new ReadFile();
        
    }
    // kiểm tra dữ liệu đọc từ file có là null hay không
    @Test
    public void test1() {
        assertNotNull(test.data);
    }
    // kiểm tra data không có dấu cách nào hay không
    @Test
    public void test2() {

        String[] words = test.data.split(" ");      
        assertEquals(1,words.length);
      
    }
        
        
    
}
