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
public class test3 {
    public ObstaclesGroup test;
    public test3() {
        test = new ObstaclesGroup();
    }
   
    // kiểm tra test ảnh có null không
    @Test
    public void test1() {
        for(int i = 0 ;i<7;i++){
            assertNotNull(test.xrimage[i]);
        }
        
    }
    // kiểm tra phương thức có thực hiện đúng chưa
    @Test
    public void test2() {
        for(int i = 0 ;i<7;i++){
            assertSame(ObstaclesGroup.xuongrongs.get(i),test.getxrs(i));

        }
    }
    // kiểm tra các đối tượng trong QueueList đã update bị trí chưa
    @Test
    public void test3() {
        for(int i = 0 ;i<7;i++){
            int t = (int) test.getxrs(i).getPosX();
            test.getxrs(i).update();
            assertEquals( t-2 , (int)test.getxrs(i).getPosX() );

        }
    }
}
