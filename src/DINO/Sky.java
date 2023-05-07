package DINO;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Sky extends Background{  //sky mr tư bgr
    public Sky() {
        try {
            this.imgbgr = ImageIO.read(new File("images/night.png"));
            //đọc hình ảnh cho hình nên game từ tập tin night. trong thư mục image
            //bằng cách sd imageio 
        }   catch (IOException ex){}   
        //neu k tìm thấy tệp tin hoặc có lỗi xảy ra trong quá trình đọc tệp tin, 1 ngoại lên exception sẽ được ném và bị bỏ qua
        //hình ảnh này sau đó được lưu trong thuộc tính imbgr của đối tượng sky
        y1 = 0;    
        x1 = 0;
        //toa do góc bên trái của hình nền (0,0)
        x2 = x1 + 780;
        y2 = y1;
        //tọa độ gốc dưới phải của màn hình(780,0)
        // tọa độ được sử dụng để vẽ hình nền trong trò chơi
    }  
}
// oop: ke thua thu bgr, imbgr doc tu night trong image( tc dong goi-chi sd trong sky). da hinh( ktao sky ghi de len bgr)
