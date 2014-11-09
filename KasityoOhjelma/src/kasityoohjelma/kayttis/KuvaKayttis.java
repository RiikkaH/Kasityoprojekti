
package kasityoohjelma.kayttis;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import kasityoohjelma.Kuva;

/**
 *
 * @author RiikkaH
 */
public class KuvaKayttis implements Runnable{
    private JFrame frame;
    private Kuva kuva;
    
    public KuvaKayttis(Kuva kuva){
        this.kuva=kuva;
    }
    
    @Override
    public void run() {
        frame = new JFrame("Riikan käsityöohjelma! :)");
        frame.setPreferredSize(new Dimension(300, 150));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
