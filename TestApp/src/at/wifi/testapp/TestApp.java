package at.wifi.testapp;

import java.util.ArrayList;
import java.util.Scanner;

public class TestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hallo TestApp");
        System.out.println("Wie geht es dir?");
        System.out.println("Heute ist ein schöner Tag?");
        
        // Datentyp Variablen-Name = Wertzuweisung
        int zahl = 5;
        
        // Datentypen in Java
        char character = 'A';
        String firstName = "Max";
        String text = "asdfkalsd falsdf alsdkf aslkd jlasd j";
        int number = 5;
        long longNumber = 123123123L;
        float preis = 12.5F;
        double summe = 12.123456;
        boolean isTrue = true;

        // Überprüfen ob number durch 2 ohne Rest teilbar ist => gerade Zahl
        if (number % 2 == 0) {
            System.out.println(number + " ist gerade");
        } else {
            System.out.println(number + " ist ungerade");
        }
        
        if (firstName.equalsIgnoreCase("max")) {
            System.out.println("Die Variable firstName enthält den Wert max");
        }
        
        String[] names = {"Max","Susi","Jane","John"};
        for (String name : names) {
            System.out.println(name);
        }
        
        // Array mit 10 int Zahlen erstellen
        int[] numbers = new int[10];
        
        // Array mit Zufallszahlen zwischen 0 und 99 befüllen
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        
        // Zahlen mit der unten umgesetzten Sort-Funktion sortieren
        numbers = sort(numbers);
        
        // Sortierte Zahlen ausgeben
        for (int tmpNumber : numbers) {
            System.out.println(tmpNumber);
        }
        
        // Maximum mit der unten umgesetzten Max-Funktion ermitteln
        int max = max(numbers);
        System.out.println("Das Maximum beträgt: " + max);
        
        // Array mit Komma-Zufallszahlen zwischen 0 und 99 befüllen
        double[] numbers1 = new double[10];
        
        // Array mit Komma-Zufallszahlen zwischen 0 und 99 befüllen und ausgeben
        for (int i=0; i<numbers.length; i++) {
            numbers1[i] = (Math.random() * 100);
            System.out.println(numbers1[i]);
        }
        
        // Maximum mit der unten umgesetzten Max-Funktion (Double) ermitteln
        double max1 = max(numbers1);
        System.out.println("Das Maximum beträgt: " + max1);
        
        // Erzeugen eines Objektes von der Klasse Scanner, um Eingaben von der Konsole lesen zu können
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Gib bitte eine Zahl ein: ");
        int userNumber = scanner.nextInt();
        
        // Überprüfen ob die eingelesene Zahl eine Primzahl ist
        if (isPrimeNumber(userNumber)) {
            System.out.println("die Zahl " + userNumber + " ist eine Primzahl");
        } else {
            System.out.println("die Zahl " + userNumber + " ist keine Primzahl");
        }
        
        // Liste vom Typ Integer anlegen
        ArrayList<Integer> zahlen = new ArrayList<Integer>();
        do {
            // Zahl zur Liste hinzufügen (Beim ersten Betreten wird die Zahl von oben - Primzahl ja/nein - eingefügt)
            zahlen.add(userNumber);
            
            // Eine weitere Zahl einlesen
            System.out.print("Gib bitte eine Zahl ein: ");
            userNumber = scanner.nextInt();
        } while (userNumber != 0);
        
        // Ausgabe der Zahlen
        for (int tmpZahl : zahlen) {
            System.out.println(tmpZahl);
        }
        
        // Scanner schließen
        scanner.close();
    }
    
    /**
     * Funktion die das Maximum eines Int-Arrays ermittelt
     * 
     * @param numbers
     * @return 
     */
    public static int max(int[] numbers) {
        int max = numbers[0];
        
        for (int i=1; i<numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        return max;
    }
    
    /**
     * Funktion die das Maximum eines Double-Arrays ermittelt
     * 
     * @param numbers
     * @return 
     */
    public static double max(double[] numbers) {
        double max = numbers[0];
        
        for (int i=1; i<numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        return max;
    }
    
    /**
     * Funktion zum sortieren mehrerer Integer-Werte
     * 
     * @param numbers
     * @return 
     */
    public static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int help = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = help;
                }
            }
        }
        
        return numbers;
    }
    
    /**
     * Funktion zur Überprüfung, ob eine Zahl eine Primzahl ist
     * 
     * @param number
     * @return 
     */
    public static boolean isPrimeNumber(int number) {
        boolean isPrime = true;
        
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        
        return isPrime;
    }
}
