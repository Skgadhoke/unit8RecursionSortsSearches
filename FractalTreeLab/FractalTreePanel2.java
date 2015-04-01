
import java.awt.*;
import javax.swing.*;
public class FractalTreePanel2 extends JComponent {
    int x2, y2;
    private double angle = Math.PI;

    private int deltaX;
    private int deltaY;

    private int dis;
    private int length=10;

    private int fractalLen = 50;
    static int count = 0;

    public FractalTreePanel2(){
    }

    public void drawFractal(int length, int x1, int y1, Graphics g){

        if(length ==1){
            g.drawLine(x1,y1,x2,y2);
        }
        else{

            x2 =x1+ (int) Math.abs((fractalLen*Math.sin(angle)));
            y2 = y1+ (int) Math.abs((fractalLen*Math.cos(angle)));
            g.drawLine(x1,y1,x2,y2);

            angle = angle+(Math.PI/6);

            x1=x2;
            y1=y2;

            System.out.println("x2,y2: "+ x2 + "," + y2 + "    "+angle + " *** length:" + length);
            drawFractal(length-1, x2, y2, g );

        }

    }

    public void paintComponent (Graphics g)
    {

        super.paintComponent (g);
        System.out.println("calling");

        g.setColor (Color.red);
        //drawFractal (length, 700,500,g);
        System.out.println("called");
    }
}




