import javax.swing.*;
import java.awt.*;

public class n8_Name extends JComponent {
    public void paintComponet (Graphics g){

        Graphics2D g2=(Graphics2D) g;
        Rectangle A=new Rectangle(
        );
        g2.setColor(Color.blue);
        g2.fillRect(05,50,200,100);
        g2.setColor(Color.red);
        g2.drawString("Mahdi Abo_Ali",100,100);

    }

}
