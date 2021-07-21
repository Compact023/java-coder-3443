package at.wifi.football;

import java.util.Date;

/**
 *
 * @author Thomas
 */
public class Game {
    private Date timestamp;
    private Team homeTeam;
    private Team guestTeam;
    private int goalsHomeTeam;
    private int goalsGuestTeam;

    public Game(Date timestamp, Team homeTeam, Team guestTeam, int goalsHomeTeam, int goalsGuestTeam) {
        this.timestamp = timestamp;
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
        this.goalsHomeTeam = goalsHomeTeam;
        this.goalsGuestTeam = goalsGuestTeam;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getGuestTeam() {
        return guestTeam;
    }

    public void setGuestTeam(Team guestTeam) {
        this.guestTeam = guestTeam;
    }

    public int getGoalsHomeTeam() {
        return goalsHomeTeam;
    }

    public void setGoalsHomeTeam(int goalsHomeTeam) {
        this.goalsHomeTeam = goalsHomeTeam;
    }

    public int getGoalsGuestTeam() {
        return goalsGuestTeam;
    }

    public void setGoalsGuestTeam(int goalsGuestTeam) {
        this.goalsGuestTeam = goalsGuestTeam;
    }

    @Override
    public String toString() {
        return "Game{" + "timestamp=" + timestamp + ", homeTeam=" + homeTeam + ", guestTeam=" + guestTeam + ", goalsHomeTeam=" + goalsHomeTeam + ", goalsGuestTeam=" + goalsGuestTeam + '}';
    }
    
}
