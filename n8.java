import javax.swing.*;
import java.awt.*;

public class n8 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(1000,500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        n8_Name Name = new n8_Name();
        frame.add(Name);
        frame.setVisible(true);
    }
}
