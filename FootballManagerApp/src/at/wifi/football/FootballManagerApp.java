package at.wifi.football;

public class FootballManagerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Anlegen eines FootballManager Objekts
        FootballManager manager = new FootballManager();
        
        manager.addTeam(1, "Dinamo Zagreb");
        manager.addTeam(2, "Real Madrid");
        manager.addTeam(3, "LASK");
        manager.addTeam(4, "Red Bull Salzburg");
        manager.addTeam(5, "Manchester United");
        manager.addTeam(6, "Bayern München");
        
        // Highscore ausgeben
        System.out.println("Tabelle:");
        manager.printHighscore();
        
        // Spiele anlegen
        manager.addGame("20.07.2021 21:00", 1, 2, 3, 2);
        manager.addGame("20.07.2021 21:00", 3, 6, 3, 3);
        manager.addGame("20.07.2021 21:00", 4, 5, 1, 7);
        
        // Spiele ausgeben
        System.out.println("\nSpiele des 1. Spieltags:");
        manager.printGames();
        
        // Highscore ausgeben
        System.out.println("\nTabelle nach dem 1. Spieltag:");
        manager.printHighscore();
        
        // Spiele anlegen
        manager.addGame("22.07.2021 21:00", 1, 6, 4, 2);
        manager.addGame("22.07.2021 21:00", 2, 3, 3, 5);
        manager.addGame("22.07.2021 21:00", 5, 4, 4, 3);
        
        // Spiele ausgeben
        System.out.println("\nSpiele des 2. Spieltags:");
        manager.printGames();
        
        // Highscore ausgeben
        System.out.println("\nTabelle nach dem 2. Spieltag:");
        manager.printHighscore();
    }
    
}
