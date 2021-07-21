package at.wifi.football;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Thomas
 */
public class FootballManager {
    private List<Team> teams;
    private List<Game> games;

    public FootballManager() {
        this.teams = new LinkedList<Team>();
        this.games = new LinkedList<Game>();
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
    
    public void addTeam(long teamNo, String name) {
        Team newTeam = new Team(teamNo, name);
        this.teams.add(newTeam);
    }
    
    public void addGame(String timestampText, long teamNoHome, long teamNoGuest, int goalsHome, int goalsGuest) {
        // Suchen vom Heimteam bzw. Gästeteam mittels der jeweiligen TeamNo
        Team homeTeam = this.findTeamByTeamNo(teamNoHome);
        Team guestTeam = this.findTeamByTeamNo(teamNoGuest);
        
        // neue Variable für Date-Objekt (timestamp) mit dem Wert null vorbelegen
        Date timestamp = null;
        
        // Datumsumwandlung (von Text "timestampText" in ein Date-Objekt "timestamp")
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        try {
            timestamp = formatter.parse(timestampText);
        } catch (ParseException ex) {
            System.out.println("Ungültiges Datumsformat - SOLL: dd.MM.yyyy HH:mm");
        }
        
        // Überprüfen, ob beide Teams gefunden wurden und ein gültiges Datum übergeben wurde
        if (homeTeam != null && guestTeam != null && timestamp != null) {
            // Neues Game-Objekt erzeugen
            Game newGame = new Game(timestamp, homeTeam, guestTeam, goalsHome, goalsGuest);
            // Neues Game-Objekt zur Liste hinzufügen
            this.games.add(newGame);
            
            if (goalsHome > goalsGuest) {
                // Heim-Team aktualisieren
                homeTeam.setGamesWon(homeTeam.getGamesWon() + 1);
                
                // Gäste-Team aktualisieren
                guestTeam.setGamesLost(guestTeam.getGamesLost() + 1);
            } else if (goalsHome == goalsGuest) {
                // Heim-Team aktualisieren
                homeTeam.setGamesDraw(homeTeam.getGamesDraw() + 1);
                
                // Gäste-Team aktualisieren
                guestTeam.setGamesDraw(guestTeam.getGamesDraw() + 1);
            } else {
                // Heim-Team aktualisieren
                homeTeam.setGamesLost(homeTeam.getGamesLost() + 1);
                
                // Gäste-Team aktualisieren
                guestTeam.setGamesWon(guestTeam.getGamesWon() + 1);
            }
            
            // Tore bei den Teams aktualisieren
            homeTeam.setGoalsScored(homeTeam.getGoalsScored() + goalsHome);
            homeTeam.setGoalsAgainst(homeTeam.getGoalsAgainst() + goalsGuest);
            
            guestTeam.setGoalsScored(guestTeam.getGoalsScored() + goalsGuest);
            guestTeam.setGoalsAgainst(guestTeam.getGoalsAgainst() + goalsHome);
        }
    }
    
    public Team findTeamByTeamNo(long teamNo) {
        // Durchlaufen aller Teams und vergleich der teamNo
        for (Team team : this.teams) {
            if (team.getTeamNo() == teamNo) {
                return team;
            }
        }
        return null;
    }
    
    public Team findTeamByName(String name) {
        // Durchlaufen aller Teams und vergleich des Names (name)
        for (Team team : this.teams) {
            if (team.getName().equalsIgnoreCase(name)) {
                return team;
            }
        }
        return null;
    }
    
    public void printGames() {
        // Ausgabe der Spiele (Games)
        for (Game game : this.games) {
            System.out.println(game);
        }
    }
    
    public void sortTeams() {
        // Sortieren der Teams
        Collections.sort(this.teams);
    }
    
    public void printHighscore() {
        // Sortieren der Teams
        Collections.sort(this.teams);
        
        // Ausgabe der Teams
        for (Team team : this.teams) {
            System.out.println(team);
        }
    }
}
