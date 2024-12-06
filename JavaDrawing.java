import java.awt.*;
import javax.swing.*;

public class JavaDrawing extends Canvas {
    public void paint(Graphics g) {
        setBackground(Color.DARK_GRAY);

        g.setColor(Color.GRAY);
        g.fillRect(0, 350, 600, 300);


        g.setColor(Color.WHITE);
        g.fillOval(230, 200, 140, 200);
        g.fillOval(235, 130, 130, 130);
        g.drawLine(250, 250, 180, 320);
        g.drawLine(350, 250, 430, 320);

        g.setColor(Color.ORANGE);
        int[] noseX = {300, 325, 300};
        int[] noseY = {180, 190, 195};
        g.fillPolygon(noseX, noseY, 3);

        g.setColor(Color.BLACK);
        g.fillRect(265, 50, 70, 90);
        g.fillRect(230, 130, 140, 10);
        g.fillOval(270, 170, 10, 10);
        g.fillOval(330, 170, 10, 10);
        g.drawArc(300, 200, 20, 10, 0, -180);
        g.fillOval(300, 250, 5, 5);
        g.fillOval(300, 300, 5, 5);
        g.fillOval(300, 350, 5, 5);

        g.setColor(Color.WHITE);
        g.fillRect(265, 110, 70, 10);

    }
    public static void main (String[] args) {
        JFrame dialogFrame = new JFrame("Snowman With A hat");
        JavaDrawing canvasDrawing = new JavaDrawing();
        canvasDrawing.setSize(600,600);
        
        dialogFrame.add(canvasDrawing);
        dialogFrame.setSize(600,600);
        dialogFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dialogFrame.setVisible(true);
    }
}
