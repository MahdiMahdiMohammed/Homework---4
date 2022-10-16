import javax.swing.*;

public class n9_main {
    public static void main(String[] args) {
        JFrame f= new JFrame();
        f.setSize(800,1000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        n9_Traffic A=new n9_Traffic();
        f.add(A);
        f.setVisible(true);
    }
}
