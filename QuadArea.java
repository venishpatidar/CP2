import javax.swing.*;
import java.awt.*;

public class QuadArea extends Canvas {
    static int width;
    static int height;
    
    QuadArea(int a,int b){
        width = a;
        height = b;
    }

    public void paint(Graphics g){
        g.fillRect(100,20,width,height);
    }


    public static String area(){
        int c;
        String cc;

        if(width == height){
            c = width*height;
            cc = String.format("%d",c);
            String s = "The area of Square is " + c + " unit\n";
            return s;
        }
        else{
            c = width*height;
            cc = String.format("%d",c);
            String s = "The area of Rectangle is " + c + " unit\n";
            return s;
        }
    }   
}