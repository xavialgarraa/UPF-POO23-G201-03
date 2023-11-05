import java.util.LinkedList;
import java.util.Random;

public class CupMatch extends Match{
    private boolean prorroga;
    private boolean penalties;

    public CupMatch(Team home, Team away){
        super(home, away);
        this.awayScorers = new LinkedList<Player>();
        this.homeScorers = new LinkedList<Player>();
        prorroga = false;
        penalties = false;
    }
    
    @Override
    public void simulateMatch(){
        super.simulateMatch();
        if (homeGoals == awayGoals){
            simulateExtraTime();
            prorroga = true;
            }
        if (homeGoals == awayGoals){
            simulatePenalties();
            prorroga = true;
            }
    }

    public void simulateExtraTime(){
        Random random = new Random();
        int homeGoalsProrroga = random.nextInt(3);
        int awayGoalsProrroga = random.nextInt(3);
        homeGoals += homeGoalsProrroga; // Genera un número aleatorio de goles para el equipo local (0-3)
        awayGoals += awayGoalsProrroga; // Genera un número aleatorio de goles para el equipo visitante (0-3)
        int randomGoalIndex;
        // Verificar si los equipos no son nulos antes de simular los goles
        if (homeTeam != null && awayTeam != null) {
            // Simulate home team's goals and goal scorers
            for (int i = 0; i < homeGoals && !this.homeTeam.getPlayers().isEmpty(); i++) {
                randomGoalIndex = random.nextInt(homeTeam.getPlayers().size());
                Player scorer = homeTeam.getPlayers().get(randomGoalIndex);
                homeScorers.add(scorer);
                scorer.marcarGol();; // Actualiza estadísticas de gol del jugador
            }
    
            // Simulate away team's goals and goal scorers
            for (int i = 0; i < awayGoals && !awayTeam.getPlayers().isEmpty(); i++) {
                randomGoalIndex = random.nextInt(awayTeam.getPlayers().size());
                Player scorer = awayTeam.getPlayers().get(randomGoalIndex);
                awayScorers.add(scorer);
                scorer.marcarGol(); // Actualiza estadísticas de gol del jugador 
            }
        }
    }

    public void simulatePenalties(){
        Random random = new Random();
        int penaltyKicks = 5;
        homeGoals += random.nextInt(penaltyKicks); // Genera un número aleatorio de goles para el equipo local (0-5)
        awayGoals += random.nextInt(penaltyKicks); // Genera un número aleatorio de goles para el equipo visitante (0-5) 
        while (homeGoals == awayGoals){
            boolean homeScorers = random.nextBoolean();
            boolean awayScorers = random.nextBoolean();

            if (homeScorers){
                homeGoals++;
            }

            if (awayScorers){
                awayGoals++;
            }
        }
    }
    public void printmatch(){
        System.out.println(getHomeTeam().getName() + " " + getHomeGoals() + " - " + getAwayGoals() + " " + getAwayTeam().getName());
        System.out.println("------------------------------------");
        System.out.println("Crónica del Partido: ");
        for (Player p: homeScorers){
            System.out.println("Gol "+ getHomeTeam().getName() + "--> "+ p.getName());
        }
        for (Player p: awayScorers){
            System.out.println("Gol "+ getAwayTeam().getName() + "--> "+ p.getName());
        }
        if (prorroga){
            System.out.println("El partido finalizó en los primeros 90 minutos en empate\n");
        }
        if (penalties){
            System.out.println("El partido finalizó en los primeros 120 minutos en empate, decidido en la tanda de penaltis\n");
        }
    }
}







    

