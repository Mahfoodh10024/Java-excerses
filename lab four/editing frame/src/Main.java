// program to change a frame properties
import javax.swing.*;
import java.awt.*;

// graphical libraries

public class Main {

    static class newFrame extends JFrame{
        newFrame(){
            JLabel label = new JLabel();
            label.setText("welcome  JFrame");
            label.setVerticalAlignment(JLabel.CENTER);
            label.setHorizontalAlignment(JLabel.CENTER);


            JFrame frame = new JFrame();
            this.setVisible(true);
            this.setTitle("frame after editing");
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setSize(400,400);
            this.getContentPane().setBackground(new Color(0x719677));
            this.add(label);
        }
    }

    //new frame code after editing

    static class oldFrame extends JFrame{
        oldFrame(){


            this.setSize(200,200);
            JLabel label = new JLabel("Hello , world");
            label.setOpaque(true);
            label.setBackground(Color.green);
            this.add(label);
            this.setTitle("odl frame");
            this.setResizable(true);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(true);

        }

        // the old frame code before editing
    }

    public static void main(String[] args) {



    new oldFrame (); //showing the old frame
    new newFrame();  // showing the new frame



    }
}