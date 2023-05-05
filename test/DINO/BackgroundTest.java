package DINO;

import org.junit.Test;
import org.mockito.Mockito;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import static org.junit.Assert.*;

public class BackgroundTest {
    @Test
    public void testPaint() {
    Background bg = new ConcreteBackground();
    BufferedImage expected = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
    BufferedImage actual = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g2 = actual.createGraphics();
    bg.Paint(g2);
    g2.dispose();
    assertNotEquals(expected, actual);
}
  
    @Test
    public void testGetY() {
        Background bg = new ConcreteBackground();
        assertEquals(bg.getY(), 0);
    }
    
    private static class ConcreteBackground extends Background {
        public ConcreteBackground() {
            this.imgbgr = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
            this.x1 = 0;
            this.y1 = 0;
            this.x2 = 780;
            this.y2 = 0;
        }
    }
    
    @Test
    public void testUpdate() {
        Background bg = new ConcreteBackground();
        bg.Update();
        assertEquals(bg.x1, -2);
        assertEquals(bg.x2, 778);
    }

}
