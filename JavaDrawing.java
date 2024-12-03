/*import java.awt.*;
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
}*/

import java.awt.*;
import javax.swing.*;

public class JavaDrawing extends Canvas {
    public void paint(Graphics graphics) {
        graphics.setColor(Color.GRAY);
        graphics.fillRect(0,0,500,500);
        graphics.setColor(Color.DARK_GRAY);
        graphics.fillOval(100, 100, 250, 250);
        graphics.drawLine(100, 225, 100, 400);
        graphics.drawLine(350, 225, 350, 400);
        graphics.drawLine(100,400,150,225);
        graphics.setColor(Color.RED);
        graphics.fillOval(150, 200, 50, 50);
        graphics.fillOval(250, 200, 50, 50);
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

--------------

import java.awt.*;
import javax.swing.*;

public class JavaDrawing extends Canvas {
    public void paint(Graphics graphics) {

        setBackground(Color.GRAY);

        graphics.setColor(Color.DARK_GRAY);
        graphics.fillOval(100, 100, 250, 250);
        graphics.drawLine(100, 100, 100, 220);
        graphics.drawLine(350, 100, 350, 220);
        int[] rightEarX = {100, 150, 100};
        int[] rightEarY = {350, 300, 350};
        int[] leftEarX = {350, 300, 350};
        int[] leftEarY = {};
        graphics.fillPolygon(rightEarX, rightEarY, 3);

        graphics.setColor(Color.RED);
        graphics.fillOval(150, 200, 50, 50);
        graphics.fillOval(250, 200, 50, 50);
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

