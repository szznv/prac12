import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Test2 extends JFrame {
    protected static Image image;
    private static JFrame jFrame;
    private static String text;
    protected static ArrayList<Image> framlist = new ArrayList<>();

    Test2() {
        setLayout(new FlowLayout());
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.drawImage(image, 0, 0, 800, 500, null);
    }

    public static void main(String[] args) {
        framlist.add(new ImageIcon("C:/Users/sazon/OneDrive/Изображения/Saved Pictures/1.jpg").getImage());
        Test2 animImg = new Test2();
        while (true) {
            for (int i = 0; i < 72; i++) {
                image = framlist.get(i);
                animImg.repaint();
                try {
                    Thread.sleep(85);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
