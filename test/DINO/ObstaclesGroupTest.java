<<<<<<< HEAD
package DINO;

import static org.junit.Assert.*;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;
import javax.imageio.ImageIO;
import org.junit.Before;
import org.junit.Test;
import pkg2dgamesframework.Objects;
import pkg2dgamesframework.QueueList;
import java.util.Queue;
import java.util.Scanner; 


public class ObstaclesGroupTest {
  @Test
    public void testObstaclesGroup() {
        ObstaclesGroup obstaclesGroup = new ObstaclesGroup();
        QueueList<ObstaclesGroup.Obstacles> x = obstaclesGroup.getXrs();
        BufferedImage[] arr = obstaclesGroup.getImgXr();
        assertEquals(7, obstaclesGroup.SIZE);
        assertEquals(780, obstaclesGroup.posvatcanfirst);
         assertEquals(500, obstaclesGroup.khoangcach2vatcan);
        assertNotNull(x);
        assertNotNull(arr);
        assertNotNull(obstaclesGroup.rdimg);
        assertNotNull(obstaclesGroup.ktanh);
        
    }
    
    @Test
    public void testUpdateDiamondGroup() {
        DiamondGroup diamondGroup= new DiamondGroup();
        float initialPosX = diamondGroup.getdia(0).getPosX();
        diamondGroup.update();
        float updatedPosX = diamondGroup.getdia(0).getPosX();
        assertTrue(updatedPosX < initialPosX);
           
    }
@Test
    public void testPaintDiamondGroup() {
        DiamondGroup diamondGroup= new DiamondGroup();
        float initialPosX = diamondGroup.getdia(0).getPosX();
        diamondGroup.update();
        float updatedPosX = diamondGroup.getdia(0).getPosX();
        assertTrue(updatedPosX < initialPosX);
           
    }
}
=======
package DINO;

import static org.junit.Assert.*;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;
import javax.imageio.ImageIO;
import org.junit.Before;
import org.junit.Test;
import pkg2dgamesframework.Objects;
import pkg2dgamesframework.QueueList;
import java.util.Queue;
import java.util.Scanner; 


public class ObstaclesGroupTest {
  @Test
    public void testObstaclesGroup() {
        ObstaclesGroup obstaclesGroup = new ObstaclesGroup();
        QueueList<ObstaclesGroup.Obstacles> x = obstaclesGroup.getXrs();
        BufferedImage[] arr = obstaclesGroup.getImgXr();
        assertEquals(7, obstaclesGroup.SIZE);
        assertEquals(780, obstaclesGroup.posvatcanfirst);
         assertEquals(500, obstaclesGroup.khoangcach2vatcan);
        assertNotNull(x);
        assertNotNull(arr);
        assertNotNull(obstaclesGroup.rdimg);
        assertNotNull(obstaclesGroup.ktanh);
        
    }
    
    @Test
    public void testUpdateDiamondGroup() {
        DiamondGroup diamondGroup= new DiamondGroup();
        float initialPosX = diamondGroup.getdia(0).getPosX();
        diamondGroup.update();
        float updatedPosX = diamondGroup.getdia(0).getPosX();
        assertTrue(updatedPosX < initialPosX);
           
    }
@Test
    public void testPaintDiamondGroup() {
        DiamondGroup diamondGroup= new DiamondGroup();
        float initialPosX = diamondGroup.getdia(0).getPosX();
        diamondGroup.update();
        float updatedPosX = diamondGroup.getdia(0).getPosX();
        assertTrue(updatedPosX < initialPosX);
           
    }
}
>>>>>>> dd3e03c9256f7661cba47a975b717bfef58d8354
