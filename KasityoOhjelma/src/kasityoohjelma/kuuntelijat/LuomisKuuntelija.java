
package kasityoohjelma.kuuntelijat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import kasityoohjelma.Kuva;
import kasityoohjelma.kayttis.KuvaKayttis;

/**
 *
 * @author RiikkaH
 */
public class LuomisKuuntelija implements ActionListener{

    private JTextField leveysKentta;
    private JTextField korkeusKentta;
    private KuvaKayttis kayttis;
    private JFrame frame;
    
    public LuomisKuuntelija(JFrame frame, JTextField leveysKentta, JTextField korkeusKentta){
        this.korkeusKentta = korkeusKentta;
        this.leveysKentta = leveysKentta;
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int leveys=20;
        try {
            leveys = Integer.parseInt(leveysKentta.getText());
            if(leveys<1){
                leveys=20;
            }
        } catch (final NumberFormatException ex) {
            //ei tehdä mitään; leveys=20;
        }
        int korkeus=20;
        try {
            korkeus = Integer.parseInt(korkeusKentta.getText());
            if(korkeus<1){
                korkeus=20;
            }
        } catch (final NumberFormatException ex) {
            //ei tehdä mitään; korkeus=20;
        }
        Kuva kuva = new Kuva(leveys, korkeus);
        kayttis = new KuvaKayttis(kuva);
        kayttis.run();
        frame.setVisible(false);
    }

}
