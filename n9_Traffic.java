import javax.swing.*;
import java.awt.*;

public class n9_Traffic extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        Rectangle R=new Rectangle();
        //....
        g2.setColor(Color.BLUE);
        g2.fillRect(250,0,200,400);
        g2.setColor(Color.BLUE);
        g2.fillRect(325,400,50,300);

        g2.setColor(Color.black);
        g2.fillRect(275,700,150,50);
        //......
        g2.setColor(Color.red);
        g2.fillRect(300,30,100,100);

        g2.setColor(Color.yellow);
        g2.fillRect(300,150,100,100);

        g2.setColor(Color.green);
        g2.fillRect(300,270,100,100);


    }

}
