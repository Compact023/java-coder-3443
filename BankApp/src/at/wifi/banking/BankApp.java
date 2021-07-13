package at.wifi.banking;

import java.util.Date;

/**
 *
 * @author Thomas
 */
public class BankApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person max = new Person("Max", "Mustermann", "03.02.1990");
        Bankkonto konto1 = new Bankkonto("AT01-1111-1111-1111-1111", max, 5500.0F);
        Bankkonto konto2 = new Bankkonto("AT01-2222-2222-2222-2222", "Susi", "Musterfrau", 8000.0F);
        
        System.out.println(konto1);
        System.out.println(konto2);
        
        System.out.println("1000 Euro auf Konto1 einzahlen:");
        konto1.einzahlen(1000);
        System.out.println(konto1);
        
        System.out.println("-500 Euro auf Konto2 einzahlen:");
        konto2.einzahlen(-500);
        System.out.println(konto2);
        
        System.out.println("10.000 Euro von Konto1 auszahlen:");
        if (!konto1.auszahlen(10000)) {
            System.out.println("Das Auszahlen von 10.000 von Konto1 ist nicht möglich - zu geringer Kontostand");
        }
        System.out.println(konto1);
        
        System.out.println("500 Euro von Konto2 auszahlen:");
        konto2.auszahlen(500);
        System.out.println(konto2);
        
        float ueberweisungsbetrag = 1000;
        System.out.println(ueberweisungsbetrag + " Euro von Konto1 auf Konto2 überweisen:");
        if (konto1.ueberweisen(ueberweisungsbetrag, konto2)) {
            System.out.println("Der Betrag wurde überwiesen.");
        } else {
            System.out.println("Bei der Überweissung ist ein Fehler aufgetreten.");
        }
        System.out.println(konto1);
        System.out.println(konto2);
    }
    
}
