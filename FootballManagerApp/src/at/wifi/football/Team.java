package at.wifi.football;

/**
 *
 * @author Thomas
 */
public class Team implements Comparable<Team>{
    private long teamNo;
    private String name;
    private int gamesWon;
    private int gamesLost;
    private int gamesDraw;
    private int goalsScored;
    private int goalsAgainst;

    public Team(long teamNo, String name) {
        this.teamNo = teamNo;
        this.name = name;
        this.gamesWon = 0;
        this.gamesLost = 0;
        this.gamesDraw = 0;
        this.goalsScored = 0;
        this.goalsAgainst = 0;
    }
    
    public Team(long teamNo, String name, int gamesWon, int gamesLost, int gamesDraw, int goalsScored, int goalsAgainst) {
        this.teamNo = teamNo;
        this.name = name;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
        this.gamesDraw = gamesDraw;
        this.goalsScored = goalsScored;
        this.goalsAgainst = goalsAgainst;
    }

    public long getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(long teamNo) {
        this.teamNo = teamNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public int getGamesDraw() {
        return gamesDraw;
    }

    public void setGamesDraw(int gamesDraw) {
        this.gamesDraw = gamesDraw;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    @Override
    public String toString() {
        return "Team{" + "teamNo=" + teamNo + ", name=" + name + ", gamesWon=" + gamesWon + ", gamesLost=" + gamesLost + ", gamesDraw=" + gamesDraw + ", goalsScored=" + goalsScored + ", goalsAgainst=" + goalsAgainst + '}';
    }

    @Override
    public int compareTo(Team other) {
        // absteigend sortieren nach der Anzahl der Punkte
        int thisTeamPoints = this.gamesWon * 3 + this.gamesDraw;
        int otherTeamPoints = other.gamesWon * 3 + other.gamesDraw;
        
        if (thisTeamPoints > otherTeamPoints) {
            return -1;
        } else if (thisTeamPoints < otherTeamPoints) {
            return 1;
        } else {
            // wenn beide gleich viele Punkte haben, dann absteigend sortieren nach Torverhältnis
            int thisGoalDiff = this.goalsScored - this.goalsAgainst;
            int otherGoalDiff = other.goalsScored - other.goalsAgainst;
            
            if (thisGoalDiff > otherGoalDiff) {
                return -1;
            } else if (thisGoalDiff < otherGoalDiff) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
