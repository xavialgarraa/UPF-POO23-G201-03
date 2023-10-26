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
        this.homeScorers = new LinkedList<Player>();
        this.awayScorers = new LinkedList<Player>();
    }

    public void simulateMatch() {
        Random random = new Random();
        homeGoals = random.nextInt(7); // Genera un número aleatorio de goles para el equipo local (0-6)
        awayGoals = random.nextInt(7); // Genera un número aleatorio de goles para el equipo visitante (0-6)
        // Verificar si los equipos no son nulos antes de simular los goles
        if (homeTeam != null && awayTeam != null) {
            // Simulate home team's goals and goal scorers
            LinkedList<Player> homePlayers = homeTeam.getPlayers();
            for (int i = 0; i < homeGoals && !homePlayers.isEmpty(); i++) {
                int randomGoalIndex = random.nextInt(homePlayers.size());
                Player scorer = homePlayers.get(randomGoalIndex);
                homeScorers.add(scorer);
                scorer.marcarGol(); // Actualiza estadísticas del jugador
            }
    
            // Simulate away team's goals and goal scorers
            LinkedList<Player> awayPlayers = awayTeam.getPlayers();
            for (int i = 0; i < awayGoals && !awayPlayers.isEmpty(); i++) {
                int randomGoalIndex = random.nextInt(awayPlayers.size());
                Player scorer = awayPlayers.get(randomGoalIndex);
                awayScorers.add(scorer);
                scorer.marcarGol(); // Actualiza estadísticas del jugador
            }
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

