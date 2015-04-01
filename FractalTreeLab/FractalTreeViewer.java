
import javax.swing.JFrame;

public class FractalTreeViewer {

    public FractalTreeViewer(){
        JFrame frame = new JFrame();

        frame.setSize(1000 /* x */, 800 /* y */);
        frame.setTitle("Fractal Tree");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FractalTreePanel2 Fpanel = new FractalTreePanel2();
        frame.add(Fpanel);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        
        FractalTreeViewer view = new FractalTreeViewer();

    }
}
