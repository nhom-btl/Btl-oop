
package DINO;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import pkg2dgamesframework.QueueList;
import java.awt.Rectangle;
import pkg2dgamesframework.Objects;




public class DiamondGroup {
    public class Diamond extends Objects {
    public Rectangle rect;
    public boolean isvc = false;
    public Diamond(int x, int y, int w, int h) {
        super(x, y, w, h);rect = new Rectangle(x,y,w,h);
    }
    public void update(){
        rect.setLocation((int)this.getPosX(), (int)this.getPosY());
        this.setPosX(this.getPosX() - Main.gamespeed );
    }
    public Rectangle getRect(){
        return rect;
    }
    public boolean getisvc(){
        return this.isvc;
    }
    public void setisvc(boolean t){
        this.isvc = t;
    }
}
    private  BufferedImage imgdia = null;
    Random generator = new Random();
    public int n = 10,tmp;
    public int w,h;
    public Diamond t;
    private static QueueList<Diamond> dias ;
    public static QueueList<Diamond> getDias() {
    return dias;
    }
    public static void setDias(QueueList<Diamond> dias) {
        DiamondGroup.dias = dias;
    }  
    public BufferedImage getImgdia() {
        return imgdia;
    }

    public DiamondGroup() {
        
        w = 25;h = 17;
        t = new Diamond(70,20,w,h);
        try{
            imgdia = ImageIO.read(new File("images/diamond.png")); // 52:36
        }catch (IOException ex) {}      
        dias = new QueueList<Diamond>();
        for(int i = 0 ;i<n ;i++){  
            int k = 400 - h;// random tu 120 -> k
            Diamond dia;
            tmp =  generator.nextInt(k-120) + 120 ; // 120 -> k : vi tri diamon co the dc an                     
            dia = new Diamond( i*260,tmp, w,h  );         
            dias.push(dia);
        }
    }
    public void update(){
        
        for(int i = 0 ;i<n;i++){
            getdia(i).update();
        }
        t.update();
        t.setPosX(t.getPosX()+ (Main.gamespeed));
        if(getdia(0).getPosX()<-25 || getdia(0).getisvc() == true){
            Diamond dia; dia = dias.pop();
            tmp =  generator.nextInt(400-h-120) + 120 ;
            dia = new Diamond((int) (getdia(n-2).getPosX() + 260), tmp , w,h );
            dias.push(dia);
        }
    }
    public void paint(Graphics2D g2){
        g2.drawImage(imgdia,  (int)t.getPosX(), (int)t.getPosY()  , null);
        for( int i = 0 ; i < n ; i++ ){
                g2.drawImage(imgdia, (int)getdia(i).getPosX(),(int)getdia(i).getPosY()  , null);   
        }
    }
    public Diamond getdia(int i){
        return dias.get(i);
        
    }
    
}
