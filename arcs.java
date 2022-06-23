import java.awt.*;
import java.awt.event.*;

/*
<applet code="Arcs" width=300 height=200>
</applet>
*/
class Arcs1 extends Frame {
    public Arcs1() {
        setSize(400, 400);
        setTitle("graph");
        setVisible(true);
        addWindowListener(new mywindoow());
    }

    class mywindoow extends WindowAdapter {
        public void windowClosing(WindowEvent me) {
            System.exit(0);
        }
    }

    public void paint(Graphics g) {

        g.setColor(Color.blue);
        g.drawArc(10, 40, 70, 70, 0, 75);
        g.fillArc(100, 40, 70, 70, 0, 75);
        g.drawArc(10, 100, 70, 80, 0, 175);
        g.fillArc(100, 100, 70, 90, 0, 270);
        g.drawArc(200, 80, 80, 80, 0, 180);
        g.fillRect(200, 200, 200, 100);
    }
}

public class arcs {
    public static void main(String args[]) {
        new Arcs1();
    }
}