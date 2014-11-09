
package kasityoohjelma;

import kasityoohjelma.Ruutu.Tyyppi;

/**
 *
 * @author RiikkaH
 */
public class Rivi {
    
    private Ruutu[] ruudut;
    
    public Rivi(int leveys){
        ruudut=new Ruutu[leveys];
        Ruutu ruutu=new Ruutu(Tyyppi.OIKEA);
        for(int i=0;i<leveys;i++){
            ruudut[i]=ruutu; //oletusarvo oikea silmukka
        }
    }
    
    public Ruutu[] getRuudut(){
        return ruudut;
    }
    
    public Ruutu getRuutu(int indeksi){
        return ruudut[indeksi];
    }
    
    public void setRuutu(int indeksi, Ruutu ruutu){
        ruudut[indeksi]=ruutu;
    }
    
}
