
public class Team {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore; 
    private int games;
    private int wins;
    private int losses;
    
    public Team(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getAwayTeam(){
        return this.awayTeam;
    }
    
    public int getHomeScore () {
        return this.homeScore;
    }
    
    public int getAwayScore(){
        return this.awayScore;
    }
    
    public int playGame() {
        return this.games += 1;
    }
    
    public int setWins(){
        return this.wins += 1;
    }
    
    public int setLosses() {
        return this.losses += 1;
    }
}

