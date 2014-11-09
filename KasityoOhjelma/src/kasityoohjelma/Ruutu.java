
package kasityoohjelma;

/**
 *
 * @author RiikkaH
 */
public class Ruutu {
    
    public enum Tyyppi{
        OIKEA, NURJA, LISAYS, OKAVENNUS, VKAVENNUS, OVKAVENNUS, TYHJA;
    }
    
    private Tyyppi tyyppi;
    
    public Ruutu(Tyyppi tyyppi){
        this.tyyppi=tyyppi;
    }
   
    public int getArvo(){
        int arvo=0;
        switch(tyyppi) {
            case OIKEA:
                arvo = 1;
                break;
            case NURJA:
                arvo = 1;
                break;
            case LISAYS:
                arvo = 2;
                break;
            case VKAVENNUS:
                arvo = -1;
                break;
            case OKAVENNUS:
                arvo = -1;
                break;
            case OVKAVENNUS:
                arvo = -2;
                break;
            case TYHJA:
                arvo = 0;
        }
        return arvo;
    }
    
}
