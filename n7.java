import javax.swing.*;
import java.awt.*;


public class n7 extends JFrame {


    public n7(){
        setTitle("n7");
        setSize(800,800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint (Graphics s){
        s.setColor(Color.MAGENTA);
        s.fillRect(700,175,50,50);
        s.setColor(Color.pink);
        s.fillRect(700,225,50,50);
        s.setColor(Color.MAGENTA);
        s.fillRect(700,275,50,50);
        s.setColor(Color.pink);
        s.fillRect(650,275,50,50);
        s.setColor(Color.MAGENTA);
        s.fillRect(600,175,50,50);
        s.setColor(Color.pink);
        s.fillRect(600,275,50,50);
        s.setColor(Color.MAGENTA);
        s.fillRect(550,225,50,50);
        s.setColor(Color.pink);
        s.fillRect(500,175,50,50);

        s.setColor(Color.MAGENTA);
        s.fillRect(500,175,50,50);
        s.setColor(Color.pink);
        s.fillRect(500,175,50,50);
        s.setColor(Color.MAGENTA);
        s.fillRect(450,225,50,50);
        s.setColor(Color.pink);
        s.fillRect(400,275,50,50);

        s.setColor(Color.MAGENTA);
        s.fillRect(400,275,50,50);
        s.setColor(Color.pink);
        s.fillRect(400,325,50,50);
        s.setColor(Color.MAGENTA);
        s.fillRect(400,275,50,50);
        s.setColor(Color.pink);
        s.fillRect(450,275,50,50);
        s.setColor(Color.MAGENTA);
        s.fillRect(350,275,50,50);
        s.setColor(Color.pink);
        s.fillRect(300,225,50,50);
        s.setColor(Color.MAGENTA);
        s.fillRect(250,325,50,50);
        s.setColor(Color.pink);
        s.fillRect(250,375,325,50);
        s.setColor(Color.MAGENTA);
        s.fillRect(250,375,50,50);
        s.setColor(Color.pink);
        s.fillRect(250,375,50,50);
        s.setColor(Color.MAGENTA);
        s.fillRect(200,357,50,50);








    }

    public static void main(String[] args) {
        n7 a=new n7();
        a.paint(null);
    }
}
