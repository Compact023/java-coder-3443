# Ablauf für Projekt Java

1. Neues Project anlegen (New-Project / Java with Ant / Java Application -> Project Name eingeben -> Create Main Class ! Namen anpassen !
2. Klassen nach Angabe erstellen (new Java Class)
3. Attribute anlegen -> lt. Vorgabe (String, int, Date, float,...) / wenn keine spezielle Anforderung Attribut "protected"
4. Auf Listen achten -> (strg+leertaste -> zum einbinden der Liste) / ! Liste = Object (=gehört mittels "new" erzeugt ! 
5. Getter & Setter Methoden anlegen (rechtsklick / insert code / getter und setter auswählen)
6. Konstruktor anlegegn (siehe getter und setter) -> Logisch prüfen ob Konstruktor alle Parameter benötigt -> Sonst 2 Konstr. anlegegn (1x mit wichtigsten" Params - 1x mit allen)
7. Zusätzliche Methoden/Funktionen lt. Angabe anlegen (void = keine Rückgabe)
8. Wenn keine Rückgabe lt. Angabe dann Datentyp nach (public, protected, private) angeben = public int countMeasurements()
9. Hauptprogramm von Angabe kopieren und in main Klasse einfügen
10. Kontrolle/Vergleich der Ausgabe mit SOLL Ausgabe (typisch Übersehen: bei toString : size() + !!!)

---

# Nützliche Infos/Erklärungen:

private float avgTemperature() => private (=Zugriff von außen) / float (=Rückgabewert) / avgTemperature() (=Methode) 
public Measurement maxTemperatureMeasurement() => public (=Zugriff von außen) / Measurement (=Rückgabewert) / maxTemperatureMeasurement() (=Methode)
