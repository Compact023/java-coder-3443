package at.wifi.banking;

/**
 *
 * @author Thomas
 */
public class Bankkonto {
    protected String iban;
    protected Person eigentuemer;
    protected float kontostand;

    public Bankkonto(String iban, Person eigentuemer) {
        this(iban, eigentuemer, 0f);
    }
    
    public Bankkonto(String iban, Person eigentuemer, float kontostand) {
        this.iban = iban;
        this.eigentuemer = eigentuemer;
        this.kontostand = (kontostand >= 0 ? kontostand : 0f);
    }
    
    public Bankkonto(String iban, String vorname, String nachname, float kontostand) {
        this(iban, new Person(vorname, nachname), kontostand);
    }
    
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Person getEigentuemer() {
        return eigentuemer;
    }

    public void setEigentuemer(Person eigentuemer) {
        this.eigentuemer = eigentuemer;
    }

    public float getKontostand() {
        return kontostand;
    }
    
    public void einzahlen(float betrag) {
        if (betrag >= 0) {
            this.kontostand += betrag;
        }
    }
    
    public boolean auszahlen(float betrag) {
        if (this.kontostand >= betrag && betrag >= 0) {
            this.kontostand -= betrag;
            return true;
        }
        return false;
    }
    
    public boolean ueberweisen(float betrag, Bankkonto other){
        if (this.auszahlen(betrag)) {
            other.einzahlen(betrag);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return this.iban + " - " + this.eigentuemer + " - Kontostand: " + this.kontostand;
    }
}
