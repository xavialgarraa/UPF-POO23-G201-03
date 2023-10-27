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
        int newrandomAsistIndex;
        int randomAsistIndex;
        int randomGoalIndex;
        // Verificar si los equipos no son nulos antes de simular los goles
        if (homeTeam != null && awayTeam != null) {
            // Simulate home team's goals and goal scorers
            for (int i = 0; i < homeGoals && !this.homeTeam.getPlayers().isEmpty(); i++) {
                randomGoalIndex = random.nextInt(homeTeam.getPlayers().size());
                Player scorer = homeTeam.getPlayers().get(randomGoalIndex);
                homeScorers.add(scorer);
                scorer.marcarGol();; // Actualiza estadísticas del jugador
                randomAsistIndex = random.nextInt(homeTeam.getPlayers().size());
                Player asistPlayer = homeTeam.getPlayers().get(randomAsistIndex);
                while(scorer.getName() == asistPlayer.getName()){
                    newrandomAsistIndex = random.nextInt(homeTeam.getPlayers().size());
                    asistPlayer = homeTeam.getPlayers().get(newrandomAsistIndex);
                }
                asistPlayer.asistir();
            }
    
            // Simulate away team's goals and goal scorers
            for (int i = 0; i < awayGoals && !awayTeam.getPlayers().isEmpty(); i++) {
                randomGoalIndex = random.nextInt(awayTeam.getPlayers().size());
                Player scorer = awayTeam.getPlayers().get(randomGoalIndex);
                awayScorers.add(scorer);
                scorer.marcarGol(); // Actualiza estadísticas del jugador
                randomAsistIndex = random.nextInt(awayTeam.getPlayers().size());
                Player asistPlayer = awayTeam.getPlayers().get(randomAsistIndex);
                while(scorer.getName() == asistPlayer.getName()){
                    newrandomAsistIndex = random.nextInt(awayTeam.getPlayers().size());
                    asistPlayer = awayTeam.getPlayers().get(newrandomAsistIndex);
                }
                asistPlayer.asistir();
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

    public void printmatch(){
        System.out.println(getHomeTeam().getName() + " " + getHomeGoals() + " - " + getAwayGoals() + " " + getAwayTeam().getName());
        System.out.println("------------------------------------");
        System.out.println("Crónica: ");
        for (Player p: homeScorers){
            System.out.println("Gol "+ getHomeTeam().getName() + "--> "+ p.getName());
        }
        for (Player p: awayScorers){
            System.out.println("Gol "+ getAwayTeam().getName() + "--> "+ p.getName());
        }
    }

}

