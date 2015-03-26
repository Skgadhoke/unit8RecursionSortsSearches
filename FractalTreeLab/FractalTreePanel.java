import java.awt.*;
import javax.swing.JPanel;
import java.util.Random;

public class FractalTreePanel extends JPanel{
    Random r = new Random();
    private int a=r.nextInt(10);
    private double angle=Math.PI/a;
    private double newX,newY;
    private double dis=0;

    public FractalTreePanel(){
    }

    public void drawFractal(int count, int x1, int y1, int x2, int y2, Graphics g){
        if(count <=1){
            g.drawLine(x1,y1,x2,y2);
        }
        
        else{
            drawFractal(count-1,x1,y1,x2,y2);
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.green);

    }

    public void angle(){
        newX = Math.sin(angle);
        newY = Math.cos(angle);
    }
}
