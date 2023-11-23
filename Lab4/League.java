import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League extends Competition{
    
    public League(String name, Country country, L_Gender gender, boolean clubs) {
        super(name, country, gender, clubs);
    }

    public void generateMatches() {
        for (int i = 0; i < teams.size(); i++) {
            for (int j = 0; j < teams.size(); j++) {
                if (i != j){
                    Match match1 = new Match(teams.get(i), teams.get(j));
                    matches.add(match1); 
                }
                
            }
        }
    }
    
    @Override
    public void simulateMatches(){
        for (Match match : matches) {
            match.simulateMatch(this);
            match.printmatch(this);
            match.getHomeTeam().update(this,match);
            match.getAwayTeam().update(this,match);
        }
    }
    
    public void printRounds(){
        for (Match m : matches) {
            System.out.println(m.getHomeTeam().getName() + " - " + m.getAwayTeam().getName());
        }
    }
    
    @Override
    public void printLeagueTable() { 
        // Sort the teams based on the overridden compareTo method in TeamStats
        Collections.sort(this.teams, (team1, team2) -> {
            TeamStats stats1 = (TeamStats) team1.stats.get(this);
            TeamStats stats2 = (TeamStats) team2.stats.get(this);
            return stats1.compareTo(stats2);
        });

        // Print the league table
        System.out.println("\nLa clasificación de " + this.name + ":");
        System.out.printf("%-20s %-13s %-12s %-12s %-12s %-12s %-15s %-12s%n", "Team", "Points", "Wins", "Ties", "Losses", "Goals For", "Goals Against", "Goal diference(+/-)");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        int count = 1;
        // Print sorted teams
        for (Team team : this.teams) {  
            TeamStats actualTeam = (TeamStats) team.stats.get(this);
            int goalDiference = actualTeam.getGoalsScored() - actualTeam.getGoalsAgainst();
            System.out.printf("%-22s %-12s %-13s %-12s %-12s %-12s %-18s %-25s%n", count+"."+team.getName(), actualTeam.points, actualTeam.getWins(), actualTeam.getTies(), actualTeam.getLosses(), actualTeam.getGoalsScored(), actualTeam.getGoalsAgainst(), goalDiference);
            count++;
        }
    }
    
    @Override
    public void printTopScorers(int k){
        // Crear una lista para almacenar todos los jugadores de la liga
        List<Player> allGoalScorers = new ArrayList<>();
        
        // Añadir todos los goleadores de todos los equipos a la lista
        for(Match match : this.matches){
            for(Player p:match.getAllScorers()){
                if (!allGoalScorers.contains(p)){
                    allGoalScorers.add(p);
                }
            }
        }
    

        
        // Ordenar la lista de jugadores en función de los goles marcados
        Collections.sort(allGoalScorers, (p1, p2) -> {
                OutfielderStats stats1 = (OutfielderStats) p1.stats.get(this);
                OutfielderStats stats2 = (OutfielderStats) p2.stats.get(this);
            return stats1.compareTo(stats2); 
        });

       // Print the league table
        System.out.println("\nLa clasificación de goleadores de " + this.name + ":");
        System.out.printf("%-20s %-20s %-20s %-13s%n", "Name", "Team", "Goals", "Goals x Game");
        System.out.println("---------------------------------------------------------------------------------");

        int count = 1;
        // Print sorted teams
        while (count<=k && count< allGoalScorers.size()){
            for (Player p : allGoalScorers) { 
                if (count > k) {
                    break;
                } 
                OutfielderStats actualplayer = (OutfielderStats) p.stats.get(this);
                double goalsPerMatch = (double) actualplayer.getGoals() / actualplayer.noMatches;
                System.out.printf("%-20s %-22s %-20s %.2f%n", count+"."+p.getName(), actualplayer.player.team.name, actualplayer.getGoals(), goalsPerMatch);               
                count++;
            }
        }
        

    }
    
    
  }