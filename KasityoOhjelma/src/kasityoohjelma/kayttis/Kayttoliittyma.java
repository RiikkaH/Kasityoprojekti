
package kasityoohjelma.kayttis;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import kasityoohjelma.kuuntelijat.LuomisKuuntelija;

/**
 *
 * @author RiikkaH
 */
public class Kayttoliittyma implements Runnable{

    private JFrame frame;
    
    public Kayttoliittyma(){
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
        GridLayout layout = new GridLayout(4,2);
        container.setLayout(layout);
        
        JLabel ohjeTeksti = new JLabel("Luo uusi neuleohje");
        JLabel leveysTeksti = new JLabel("Leveys: ");
        JTextField leveysKentta = new JTextField();
        JLabel korkeusTeksti = new JLabel("Korkeus: ");
        JTextField korkeusKentta = new JTextField();

        JButton nappi = new JButton("Luo");
        LuomisKuuntelija kuuntelija = new LuomisKuuntelija(frame,leveysKentta,korkeusKentta);
        nappi.addActionListener(kuuntelija);

        container.add(ohjeTeksti);
        container.add(new JLabel(""));
        container.add(leveysTeksti);
        container.add(leveysKentta);
        container.add(korkeusTeksti);
        container.add(korkeusKentta);
        container.add(new JLabel(""));
        container.add(nappi);
    }

    public JFrame getFrame() {
        return frame;
    }
    
}
