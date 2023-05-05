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



public class CloudGroupTest {
    
    @Test
    public void testCloudGroupInit() {
        CloudGroup cloudGroup = new CloudGroup();
        QueueList<CloudGroup.Cloud> x = cloudGroup.getClouds();
    BufferedImage[] arr = cloudGroup.getImgmay();
        assertEquals(30, cloudGroup.n);
        assertEquals(12, cloudGroup.ncloud);
        assertNotNull(x);
        assertNotNull(arr);
        assertNotNull(cloudGroup.rdimg);
        assertNotNull(cloudGroup.ktimg);
        
    }
    
    @Test
    public void testUpdateCloudGroup() {
    CloudGroup cloudGroup = new CloudGroup();
    float initialPosX = cloudGroup.getcl(0).getPosX();
    cloudGroup.update();
    float updatedPosX = cloudGroup.getcl(0).getPosX();
    assertTrue(updatedPosX < initialPosX);
}

    @Test
    public void testPaintCloudGroup() {
    CloudGroup cloudGroup = new CloudGroup();
    BufferedImage image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g2d = image.createGraphics();
    cloudGroup.paint(g2d);
    g2d.dispose();
    assertTrue(image != null);
}



}