import javax.swing.*;
import java.awt.*;
public class Main extends JComponent{

    static int imageWidth = 450, imageHeight = 650;
    int grid = 10;
    int imageX, imageY;
    Image image;

    public Main(Image i) {
        image = i;
    }


    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(image, imageX, imageY, this);
    }

    public static void main(String[] args) {
        String imageFile = "C:/Users/sazon/OneDrive/Изображения/Saved Pictures/51d2243dbfa49e4b261c.gif";
        ImageIcon imageicon = new ImageIcon(imageFile);
        if (args.length > 0) {
            imageFile = args[0];
        }

        Image image = imageicon.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);

        image = image.getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);

        JFrame frame = new JFrame();
        frame.add(new Main(image));
        frame.getContentPane().setBackground( new Color(152,255,152));
        frame.setSize(450, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}