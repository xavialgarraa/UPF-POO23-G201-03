import java.util.LinkedList;
import java.util.Random;

public class Match {
    protected Team homeTeam;
    protected Team awayTeam;
    protected int homeGoals;
    protected int awayGoals;
    protected LinkedList<Player> homeScorers;
    protected LinkedList<Player> awayScorers;

    public Match(Team home, Team away){
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeScorers = new LinkedList<Player>();
        this.awayScorers = new LinkedList<Player>();
    }

    public void simulateMatch(Competition c) {
        Random random = new Random();
        homeGoals = random.nextInt(7); // Genera un número aleatorio de goles para el equipo local (0-6)
        awayGoals = random.nextInt(7); // Genera un número aleatorio de goles para el equipo visitante (0-6)
        int randomGoalIndex;
        // Verificar si los equipos no son nulos antes de simular los goles
        if (homeTeam != null && awayTeam != null) {
            // Simulate home team's goals and goal scorers
            for (int i = 0; i < homeGoals && !this.homeTeam.getPlayers().isEmpty(); i++) {
                Player scorer;
                do{
                    randomGoalIndex = random.nextInt(homeTeam.getPlayers().size());
                    scorer = homeTeam.getPlayers().get(randomGoalIndex);
                } while (scorer instanceof Goalkeeper);
                homeScorers.add(scorer);
            }
    
            // Simulate away team's goals and goal scorers
            for (int i = 0; i < awayGoals && !awayTeam.getPlayers().isEmpty(); i++) {
                Player scorer;
                do{
                    randomGoalIndex = random.nextInt(awayTeam.getPlayers().size());
                    scorer = awayTeam.getPlayers().get(randomGoalIndex);
                } while (scorer instanceof Goalkeeper);
                awayScorers.add(scorer);
            }
            
        }
        /*for (Player players:this.homeTeam.getPlayers()){
            players.stats.get(random);
            }else{
                ((Outfilder)players).updateStats(this);
            }
        }
        for (Player players:this.awayTeam.getPlayers()){
            if(players instanceof Goalkeeper){
                ((Goalkeeper)players).updateStats(this);
            }else{
                ((Outfilder)players).updateStats(this);
            }
        }*/
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

    public void printmatch(Competition c){
        System.out.println("\nPartido de "+c.name + " que enfrentó a: \n" );
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

