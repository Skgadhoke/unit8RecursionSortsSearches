import java.awt.*;
import javax.swing.*;

public class FractalTreePanel extends JComponent {
    private int length=150;
    private double branchLength=50;
    private double lengthReductionFactor = 0.80;

    /*
     * it takes in points and it uses the angle and the length to calculate the new points
     * draws the line and strokes it according to the length of the branch
    */
    public void drawFractal(int length, int x1, int y1, int x5, int y5, double angle, Graphics g){
        int x3,y3,x2,y2;
        if(length > 1){
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke((int)length/15));
            if(length >= 20)
            {
                g.setColor(Color.red);

            }
            else if (length >= 10)
            {
                g.setColor(Color.green);
            }

            else{
                g.setColor(Color.black);
            }

            x5 =x1+  (int)(Math.cos(angle)* length); 
            y5 =y1 - (int)(  Math.sin(angle) * length); 
            g.drawLine(x1,y1,x5,y5);

            x1=x5;
            y1=y5;

            // System.out.println("x1: "+x1+",y1: "+y1+"\t\tx5: "+x5+",y5: "+y5+
            //   "\t\tangle: "+angle + "\t\tlength: "+length);

            drawFractal((int)(length*lengthReductionFactor), x1, y1, x5, y5, angle+Math.PI/10, g);
            drawFractal((int)(length*lengthReductionFactor), x1, y1, x5, y5,angle-Math.PI/4, g);

        }
    }

    /*override paintComponent calling drawFractal*/
    public void paintComponent (Graphics g)
    {
        super.paintComponent (g);
        g.setColor (Color.red);
        drawFractal (length, 500,800, 500, 650,Math.PI/2,g); 
    }

}
