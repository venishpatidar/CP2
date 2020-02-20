import java.awt.*;
import javax.swing.*;

public class Background extends Canvas{
    JFrame as;
    Background(JFrame af){
         as = af;
    }
    public  void paint(Graphics g){
        Image img = Toolkit.getDefaultToolkit().getImage("graphics/background.jpg");
        g.drawImage(img, 0, 0, as.getWidth(),as.getHeight(),null);         
        }
    
}