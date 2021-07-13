package at.wifi.bruchzahlen;

/**
 *
 * @author Thomas
 */
public class BruchZahl {
    protected int zaehler;
    protected int nenner;
    
    // Konstruktor ohne Parameter
    public BruchZahl() {
        
    }
    
    // Konstruktor mit einem Parameter
    public BruchZahl(int zaehler) {
        // Rufe Konstruktur mit zwei Parametern auf, wobei als zweiter Parameter ein Standard-Wert übergeben wird
        this(zaehler, 1);
    }
    
    // Konstruktor mit zwei Parametern
    public BruchZahl(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }
    
    // Getter Methode für den Zaehler
    public int getZaheler() {
        return this.zaehler;
    }
    
    // Getter Methode für den Nenner
    public int getNenner() {
        return this.nenner;
    }
    
    public BruchZahl add(BruchZahl other) {
        if (this.nenner == other.nenner) {
            this.zaehler += other.zaehler;
        } else {
            this.zaehler = (this.zaehler * other.nenner) + (other.zaehler * this.nenner);
            this.nenner = this.nenner * other.nenner;
        }
        
        return this;
    }
    
    public BruchZahl sub(BruchZahl other) {
        if (this.nenner == other.nenner) {
            this.zaehler -= other.zaehler;
        } else {
            this.zaehler = (this.zaehler * other.nenner) - (other.zaehler * this.nenner);
            this.nenner = this.nenner * other.nenner;
        }
        
        return this;
    }
    
    public BruchZahl mult(BruchZahl other) {
        this.zaehler = this.zaehler * other.zaehler;
        this.nenner = this.nenner * other.nenner;
        return this;
    }
    
    public BruchZahl div(BruchZahl other) {
        this.zaehler = this.zaehler * other.nenner;
        this.nenner = this.nenner * other.zaehler;
        return this;
    }

    @Override
    public String toString() {
        return "(" + zaehler + "/" + nenner + ")";
    }
    
}
