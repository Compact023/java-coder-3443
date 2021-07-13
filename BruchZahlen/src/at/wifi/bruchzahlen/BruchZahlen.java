package at.wifi.bruchzahlen;

/**
 * Applikation zum Rechnen mit Bruchzahlen
 * @author Thomas
 */
public class BruchZahlen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BruchZahl bzahl1 = new BruchZahl(2, 3);
        BruchZahl bzahl2 = new BruchZahl(3, 4);
        
        System.out.println(bzahl1.toString() + " + " + bzahl2.toString() + " = " + bzahl1.add(bzahl2).toString());
        System.out.println(bzahl1.toString() + " - " + bzahl2.toString() + " = " + bzahl1.sub(bzahl2).toString());
        System.out.println(bzahl1.toString() + " * " + bzahl2.toString() + " = " + bzahl1.mult(bzahl2).toString());
        System.out.println(bzahl1.toString() + " / " + bzahl2.toString() + " = " + bzahl1.div(bzahl2).toString());
    }
    
}
