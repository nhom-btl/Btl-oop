package DINO;

import DINO.DiamondGroup.Diamond;
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


public class DiamondGroupTest {
@Test
    public void testCloudGroupInit() {
         DiamondGroup diamondGroup = new DiamondGroup();
        QueueList<Diamond> diamonds = diamondGroup.getDias();
        Diamond t = diamondGroup.t;
        int diamondWidth = diamondGroup.w;
        int diamondHeight = diamondGroup.h;

        assertNotNull(diamonds);
        assertNotNull(t);
        assertNotNull(diamondGroup.getImgdia());
        assertEquals(25, diamondWidth);
        assertEquals(17, diamondHeight);
  //     assertSame(diamonds, diamondGroup.getImgdia());
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
