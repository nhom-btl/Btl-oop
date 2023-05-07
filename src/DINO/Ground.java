
package DINO;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
//import cac thu vien can thiet
public class Ground extends Background{

    public Ground() {
        try {
            this.imgbgr = ImageIO.read(new File("images/nen.png")); // them anh vao
        }   catch (IOException ex){}
        
        x1 = 0; // co the co , tu khoi tao
        y1 = 400;
        x2 = x1 + 780;
        y2 = y1;
    }
}
