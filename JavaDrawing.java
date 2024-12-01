import java.awt.*;
import javax.swing.*; //JOption import

public class JavaDrawing extends Canvas {
    
    public void paint(Graphics graphics) {
        graphics.setColor(Color.GREEN);
        graphics.drawRect(50, 50 , 150, 100); //[x, y, width, height]
        graphics.setColor(Color.BLUE);
        graphics.fillRect(250, 50, 150, 100);
        graphics.setColor(Color.RED);
        graphics.drawOval(450, 50, 100, 100);
        graphics.fillOval(600, 50, 100, 100);
        graphics.setColor(Color.BLACK);
        graphics.drawLine(50, 200, 700, 200); //[x, y, x, y]
        graphics.drawLine(750, 50, 750, 150);
        graphics.drawLine(800, 50, 800, 150);
    }
    
    public static void main (String[] args) {
        JFrame dialogueFrame = new JFrame("Java Drawing");
        JavaDrawing canvas = new JavaDrawing();
        dialogueFrame.setSize(500,500);
        dialogueFrame.add(canvas);
        dialogueFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dialogueFrame.setVisible(true);
    }
}
