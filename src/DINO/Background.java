
package DINO;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
//sd doi tượng đồ họa gr.2d và lướp hình ảnh bufered..

public abstract class Background {
    public BufferedImage imgbgr;//imbgr là 1 đối tượng buff để lưu trữ hình ảnh nền
    public int x1, y1,x2,y2; 
    // tọa độ của các vị trí của 2 ảnh nền imbgr
    
    public void Update(){
//goi ra de cap nhật vi trí 2 ảnh nền, pvu cho chuyển động của chúng trên screen
        x1-=Main.gamespeed;
        x2-=Main.gamespeed;
        // ch dộng bằng cách giảm gtri x1 x2 đi 1 lượng main.speed..
        if(x2<0) x1 = x2 + 780;
        if(x1<0) x2 = x1 + 780;
        //kiểm tra xem ảnh nền nào đã vượt quá mh
        // nếu vượt thì cta sẽ dịch chúng lên màn hình để tạo ra hiệu ứng lặp lại
    }
    public void Paint(Graphics2D g2){
        g2.drawImage(imgbgr, x1, y1, null);
        g2.drawImage(imgbgr, x2, y2, null);
    }
    //ve 2 anh ay len screen, ve x1 y1 rooif đến x2y2
    public int getY(){
        return y1;
    }
    //tra ve gtri y1, tọa độ y của ảnh nền, gtri này sd trong lớp main để xd chiều cao đường chạy
}
//oop: truu tuong : bgr không thể tạo ra đối tượng, mầ chỉ có thể kế thừa nó;
//bao đóng :x1 x2 y1 y2 được kbao public nhưng cta k thể tru cập tt từ bên ngoài bgr, thay vào đó cthe sd geter or setter
//da hình :Lớp Background định nghĩa các phương thức Update() và Paint(), và các lớp con có thể định nghĩa lại các phương thức này theo cách của riêng chúng. 
