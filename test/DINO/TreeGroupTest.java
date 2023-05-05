/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DINO;

import java.awt.image.BufferedImage;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg2dgamesframework.QueueList;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author Nguyen Thi Thu Trang
 */
public class TreeGroupTest {
 
    /*
    @Test
    public void testTreeGroupInit() {
        TreeGroup treeGroup = new TreeGroup();
        QueueList<TreeGroup.Tree> x = treeGroup.getTrees();
    BufferedImage[] arr = treeGroup.getImgtree();
        assertEquals(7, treeGroup.n);
        assertEquals(3, treeGroup.ntree);
        assertNotNull(x);
        assertNotNull(arr);
        assertNotNull(treeGroup.rdimg);
        assertNotNull(treeGroup.ktimg);
        assertEquals(7, treeGroup.rdimg.size());
        assertEquals(159, treeGroup.ktimg[0][0]);
        assertEquals(125, treeGroup.ktimg[0][1]);
        assertEquals(100, treeGroup.ktimg[1][0]);
        assertEquals(93, treeGroup.ktimg[1][1]);
        assertEquals(140, treeGroup.ktimg[2][0]);
        assertEquals(110, treeGroup.ktimg[2][1]);
        for (int i = 0; i < treeGroup.n; i++) {
            TreeGroup.Tree tree = treeGroup.gettr(i);
            assertNotNull(tree);
            assertTrue(tree.getPosX() >= 260 * i);
            assertEquals(400 - treeGroup.ktimg[treeGroup.rdimg.get(i)][1], tree.getPosY());
        }
    }
    
    @Test
    public void testUpdate() {
        TreeGroup treeGroup = new TreeGroup();
        float expectedPosX1 = treeGroup.gettr(0).getPosX() - Main.gamespeed;
        float expectedPosX2 = treeGroup.gettr(1).getPosX() - Main.gamespeed;
        float expectedPosX3 = treeGroup.gettr(2).getPosX() - Main.gamespeed;
        
        treeGroup.update();
        
        float actualPosX1 = treeGroup.gettr(0).getPosX();
        float actualPosX2 = treeGroup.gettr(1).getPosX();
        float actualPosX3 = treeGroup.gettr(2).getPosX();
        
        assertEquals(expectedPosX1, actualPosX1, 0);
        assertEquals(expectedPosX2, actualPosX2, 0);
        assertEquals(expectedPosX3, actualPosX3, 0);
    }
    
    @Test
    public void testPaint() {
    // Khởi tạo đối tượng TreeGroup và vị trí của các cây
    TreeGroup treeGroup = new TreeGroup();
    for (int i = 0; i < treeGroup.n; i++) {
        treeGroup.gettr(i).setPosX(i * 100);
    }
    
    // Tạo hình ảnh kỳ vọng của các cây được vẽ
    BufferedImage expectedImage = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g2d = expectedImage.createGraphics();
    BufferedImage[] arr = treeGroup.getImgtree();
    for (int i = 0; i < treeGroup.n; i++) {
        g2d.drawImage(arr[treeGroup.rdimg.get(i)], (int)treeGroup.gettr(i).getPosX(), (int)treeGroup.gettr(i).getPosY(), null);
    }
    g2d.dispose(); //đóng cửa sổ
    
    // Lấy hình ảnh thực tế được vẽ của các cây
    BufferedImage actualImage = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g2dActual = actualImage.createGraphics();
    treeGroup.paint(g2dActual);
    g2dActual.dispose();
    
    // Kiểm tra xem hình ảnh thực tế có giống với hình ảnh kỳ vọng không
    assertTrue(compareImages(expectedImage, actualImage));
}

// Phương thức so sánh hai hình ảnh
public boolean compareImages(BufferedImage expected, BufferedImage actual) {
    if (expected.getWidth() != actual.getWidth() || expected.getHeight() != actual.getHeight()) {
        return false;
    }
    for (int y = 0; y < expected.getHeight(); y++) {
        for (int x = 0; x < expected.getWidth(); x++) {
            if (expected.getRGB(x, y) != actual.getRGB(x, y)) {
                return false;
            }
        }
    }
    return true;
}

    @Test
public void testUpdate_FirstTreeOutOfScreen() {
    // Khởi tạo đối tượng TreeGroup
    TreeGroup treeGroup = new TreeGroup();
    
    // Lấy vị trí của cây cuối cùng trước khi cập nhật
    float lastPosXBeforeUpdate = TreeGroup.gettr(6).getPosX();
    float lastPosYBeforeUpdate = TreeGroup.gettr(6).getPosY();
    
    // Thay đổi vị trí cây đầu tiên để cây đầu tiên ra khỏi màn hình
    for (int i = 0; i < 40; i++) {
        treeGroup.update();
    }
    
    // Kiểm tra vị trí của cây cuối cùng sau khi cập nhật
    float lastPosXAfterUpdate = TreeGroup.gettr(6).getPosX();
    float lastPosYAfterUpdate = TreeGroup.gettr(6).getPosY();
    
    // Kiểm tra xem cây mới được thêm vào có đúng vị trí và hình ảnh theo đúng khoảng cách với cây cuối cùng hay không
    assertEquals((int)(lastPosXBeforeUpdate - 80), (int)lastPosXAfterUpdate);
    assertEquals((int)(lastPosYBeforeUpdate), (int)lastPosYAfterUpdate);
    assertEquals(0, treeGroup.rdimg.get(6).intValue());
} 

@Test
public void testInitialTreePositions() {
    TreeGroup treeGroup = new TreeGroup();
    // Kiểm tra vị trí của từng cây
    int[] expectedPositions = {0, 260, 520, 780, 1040, 1300, 1560};
    for (int i = 0; i < expectedPositions.length; i++) {
        assertEquals(expectedPositions[i], treeGroup.gettr(i).getPosX(), 0);
        assertEquals(400 - treeGroup.ktimg[treeGroup.rdimg.get(i)][1], treeGroup.gettr(i).getPosY(), 0);
    }
}
*/
    @Test
    public void test()
    {
        // Khởi tạo các cây ban đầu
TreeGroup treeGroup = new TreeGroup();
int treesInQueue = treeGroup.getTreesInQueue();
assertEquals(7, treesInQueue); // Kiểm tra xem có đúng số lượng cây ban đầu được tạo hay không

// Di chuyển cây đến khi cây cuối cùng ra khỏi màn hình
while (treeGroup.gettr(treesInQueue - 1).getPosX() + treeGroup.getImgtree()[treeGroup.rdimg.get(treesInQueue - 1)].getWidth() > 0) {
    treeGroup.update();
}

// Thêm mới cây vào queue
treeGroup.update();

// Kiểm tra xem số lượng cây có đúng sau khi thêm mới cây hay không
treesInQueue = treeGroup.getTreesInQueue();
assertEquals(7, treesInQueue);

// Kiểm tra vị trí cây mới thêm vào
int lastTreeIndex = treesInQueue - 1;
int expectedX = (int)(treeGroup.gettr(lastTreeIndex - 1).getPosX() + 260 + treeGroup.ktimg[treeGroup.rdimg.get(lastTreeIndex - 1)][0]);
int expectedY = 400 - treeGroup.ktimg[treeGroup.rdimg.get(lastTreeIndex)][1];
assertEquals(expectedX, (int)treeGroup.gettr(lastTreeIndex).getPosX());
assertEquals(expectedY, (int)treeGroup.gettr(lastTreeIndex).getPosY());

// Kiểm tra khoảng cách giữa cây cuối cùng và cây mới thêm vào
int lastTreeWidth = treeGroup.ktimg[treeGroup.rdimg.get(lastTreeIndex)][0];
int lastTreePosX = (int)treeGroup.gettr(lastTreeIndex).getPosX();
int secondLastTreePosX = (int)treeGroup.gettr(lastTreeIndex - 1).getPosX();
int distance = secondLastTreePosX + treeGroup.getImgtree()[treeGroup.rdimg.get(lastTreeIndex - 1)].getWidth() + 260;
assertEquals(expectedX - (secondLastTreePosX + treeGroup.getImgtree()[treeGroup.rdimg.get(lastTreeIndex - 1)].getWidth()), distance);

    }

}
