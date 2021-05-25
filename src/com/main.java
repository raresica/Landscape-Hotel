package com;

import javax.swing.*;
import java.awt.*;
public class main {


    /** Custom Drawing Code Template */
// A Swing application extends javax.swing.JFrame
    public static class CGTemplate extends JFrame {
        // Define constants
        public static final int CANVAS_WIDTH  = 640;
        public static final int CANVAS_HEIGHT = 480;
        int xpoint, ypoint, width, heigt;

        // Declare an instance of the drawing canvas,
        // which is an inner class called DrawCanvas extending javax.swing.JPanel.
        private DrawCanvas canvas;

        // Constructor to set up the GUI components and event handlers
        public CGTemplate() {
            canvas = new DrawCanvas();    // Construct the drawing canvas
            canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

            // Set the Drawing JPanel as the JFrame's content-pane
            Container cp = getContentPane();
            cp.add(canvas);
            // or "setContentPane(canvas);"

            setDefaultCloseOperation(EXIT_ON_CLOSE);   // Handle the CLOSE button
            pack();              // Either pack() the components; or setSize()
            setTitle("First ");  // "super" JFrame sets the title
            setVisible(true);    // "super" JFrame show
        }

        /**
         * Define inner class DrawCanvas, which is a JPanel used for custom drawing.
         */
        private class DrawCanvas extends JPanel {
            // Override paintComponent to perform your own painting
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);     // paint parent's background
                setBackground(Color.white);  // set background color for this JPanel
                Color SkyBlue = new Color (135,206,250);
                Color ForestGreen = new Color (34,139,34);
                Color Brown = new Color(160, 82, 45);
                Color Cream = new Color (248, 240, 198);
                Color Brick = new Color (220,85,57);
                Color Terracotta = new Color(164,74,74);
                // Your custom painting codes. For example,
                // Drawing primitive shapes

                g.drawRect(10, 10, 620,460);

                g.setColor(SkyBlue);
                int a[]={11,630,630,11};
                int b[]={11,11,380,380};
                g.fillPolygon(a,b,4);

                g.setColor(ForestGreen);
                int c[]={11,630,630,11};
                int d[]={380,380,469,469};
                g.fillPolygon(c,d,4);


                g.setColor(Color.lightGray);
                g.fillRect(400, 170, 175,300);

                g.setColor(Color.BLACK);
                g.setFont(new Font("Monospaced", Font.PLAIN, 16));
                g.drawString("Rares Onescu", 425, 185);


                g.setColor(Brick);
                g.fillRect(530,90,15,60);

                g.setColor(Terracotta);
                int e[]={487,575,400};
                int f[]={80,170,170};
                g.fillPolygon(e,f,3);


                g.setColor(Cream);
                g.fillOval(420,200, 50,50);
                g.setColor(Color.black);
                g.fillRect(444,200,2,50);
                g.fillRect(420,224,50,2);

                g.setColor(Cream);
                g.fillOval(510,200, 50,50);
                g.setColor(Color.black);
                g.fillRect(535,200,2,50);
                g.fillRect(510,224,50,2);

                g.setColor(Cream);
                g.fillRect(420, 300, 50, 50);
                g.setColor(Color.black);
                g.fillRect(444,300,2,50);
                g.fillRect(420,324,50,2);

                g.setColor(Cream);
                g.fillRect(510, 300, 50, 50);
                g.setColor(Color.black);
                g.fillRect(534,300,2,50);
                g.fillRect(510,324,50,2);

                g.setColor(Color.white);
                g.fillRect(470, 400, 50, 100);

                g.setColor(Color.black);
                g.fillOval(473,440, 10,10);

                g.setColor(Brown);
                g.fillRect(30,300,40,150);
                g.setColor(Color.green);
                g.fillOval(10,240,80,80);

                g.setColor(Brown);
                g.fillRect(100,250,40,150);
                g.setColor(Color.green);
                g.fillOval(80,190,80,80);

                g.setColor(Brown);
                g.fillRect(170,300,40,150);
                g.setColor(Color.green);
                g.fillOval(150,240,80,80);

                g.setColor(Brown);
                g.fillRect(240,250,40,150);
                g.setColor(Color.green);
                g.fillOval(220,190,80,80);

                g.setColor(Brown);
                g.fillRect(310,300,40,150);
                g.setColor(Color.green);
                g.fillOval(290,240,80,80);

                
            }
        }

        // The entry com.main method
        public static void main(String[] args) {
            // Run the GUI codes on the Event-Dispatching thread for thread safety
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new CGTemplate(); // Let the constructor do the job
                }
            });
        }
    }
}
