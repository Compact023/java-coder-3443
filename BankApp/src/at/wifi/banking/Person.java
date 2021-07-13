package at.wifi.banking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Thomas
 */
public class Person {
    protected String vorname;
    protected String nachname;
    protected Date geburtsdatum;

    public Person(String vorname, String nachname) {
        this(vorname, nachname, null);
    }
    
    public Person(String vorname, String nachname, String geburtsdatum) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        this.vorname = vorname;
        this.nachname = nachname;
        if (geburtsdatum != null) {
            try {
                // Datum in Textformat in ein Date-Objekt umwandeln
                this.geburtsdatum = formatter.parse(geburtsdatum);
            } catch (ParseException ex) {
                this.geburtsdatum = null;
            }
        } else {
            this.geburtsdatum = null;
        }
    }
    
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        // Person ausgeben und Datum vom Typ Date in einen Text der Form dd.MM.yyyy umwandeln
        return vorname + " " + nachname + (geburtsdatum != null ? " (" + formatter.format(geburtsdatum) + ")" : "");
    }
}
