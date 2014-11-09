
package kasityoohjelma;

/**
 *
 * @author RiikkaH
 */
public class Kuva {
    
    private Rivi[] rivit;
    
    public Kuva(int leveys, int korkeus){
        Rivi rivi = new Rivi(leveys);
        rivit=new Rivi[korkeus];
        for(int i=0;i<korkeus;i++){
            rivit[i]=rivi;
        }
    }
    
    public Rivi[] getKuva(){
        return rivit;
    }
    
    public Rivi getRivi(int indeksi){
        return rivit[indeksi];
    }
}
