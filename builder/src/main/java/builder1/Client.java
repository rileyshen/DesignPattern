package builder1;


import sun.applet.Main;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.sun.glass.ui.Cursor.setVisible;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-10
 */
public class Client {
    public class main extends Frame {
        public void paint(Graphics g) {
            Color c = g.getColor();
            g.setColor(Color.BLACK);


            PersonBuilder ptb = new PersonA(g);

            DirectorFactory ptbFac = new DirectorFactory(ptb);

            ptbFac.createPerson();

            g.setColor(c);
            }
        }

        public void lauchFrame() {
        this.setLocation(400, 300);
        this.setSize(800, 600);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Main drawPerson = new Main();
        drawPerson.lauchFrame();
    }
}
