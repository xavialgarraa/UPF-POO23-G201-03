import java.util.LinkedList;
import java.util.Random;

public class Match {
    private Team homeTeam;
    private Team awayTeam;
    private int homeGoals;
    private int awayGoals;
    private LinkedList<Player> homeScorers;
    private LinkedList<Player> awayScorers;

    public Match(Team home, Team away){
        this.homeTeam = home;
        this.awayTeam = away;
    }

    public void simulateMatch() {
        Random random = new Random();
        int homeGoals = random.nextInt(7); // Genera un número aleatorio de goles para el equipo local (0-6)
        int awayGoals = random.nextInt(7); // Genera un número aleatorio de goles para el equipo visitante (0-6)
        
        // Simulate home team's goals and goal scorers
        for (int i = 0; i < homeGoals; i++) {
            int randomGoalIndex = random.nextInt(homeTeam.getPlayers().size());
            Player scorer = homeTeam.getPlayers().get(randomGoalIndex);
            homeScorers.add(scorer);
        }

        // Simulate away team's goals and goal scorers
        for (int i = 0; i < awayGoals; i++) {
            int randomGoalIndex = random.nextInt(awayTeam.getPlayers().size());
            Player scorer = awayTeam.getPlayers().get(randomGoalIndex);
            awayScorers.add(scorer);
        }
    }

    
    public int getAwayGoals() {
        return awayGoals;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public LinkedList<Player> getAwayScorers() {
        return awayScorers;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public LinkedList<Player> getHomeScorers() {
        return homeScorers;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }



}

