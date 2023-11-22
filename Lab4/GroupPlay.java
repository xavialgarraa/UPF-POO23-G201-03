import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GroupPlay extends Competition {
   
    private int noGroups;
    private LinkedList<League> groups;

    public GroupPlay(String name, Country country, L_Gender gender, boolean clubs){
        super(name, country, gender, clubs);
        this.noGroups = 2;
        this.groups =  new LinkedList<League>();
    }

    public void generateMatches(){
        int noteams = super.teams.size();
        for (int i=1; i<=noGroups; i++){
            League Group = new League("Group " + i, country, gender, clubs);
            groups.add(Group);
        } 

        ArrayList<Team> equipos_mix = new ArrayList<Team>(this.teams);
        Collections.shuffle(equipos_mix);
        int k;
        for (int i = 0 , j = 0; j < noteams; j++, i++){
            k = i % this.noGroups;
            groups.get(k).addTeam(equipos_mix.get(i));

        }
        for (League liga:this.groups){
            liga.generateMatches();
        }
    }
    
    public void printGroups() {
        System.out.println("Groups in " + this.name + ":");
        int groupNumber = 1;
        for (League group : this.groups) {
            System.out.println("Grupo " + groupNumber + ":");
            group.printTeams();
            groupNumber++;
        }
    }
    public void printGroupPlayMatches(){
        for (League group : this.groups) {
            group.printMatches();
        }
    }
    
    public void simulateMatches(){
        for (League liga:this.groups){
            for (Match match : liga.matches){
                match.simulateMatch(this);
                match.printmatch(this);
                match.getHomeTeam().update(this,match);
                match.getAwayTeam().update(this,match);
            }
        }
    }
    
    @Override
    public void printLeagueTable() { 
        System.out.println("\n-----------------" + this.name + "---------------------\n");
        for(League l:groups){
                // Sort the teams based on the overridden compareTo method in TeamStats
            Collections.sort(l.teams, (team1, team2) -> {
                TeamStats stats1 = (TeamStats) team1.stats.get(this);
                TeamStats stats2 = (TeamStats) team2.stats.get(this);
                return stats1.compareTo(stats2);
            });

            // Print the league table
            System.out.println("\nLa clasificación de " + l.name + ":");
            System.out.printf("%-20s %-13s %-12s %-12s %-12s %-12s%n", "Team", "Points", "Wins", "Ties", "Goals For", "Goals Against");
            System.out.println("--------------------------------------------------------------------------------------");

            int count = 1;
            // Print sorted teams
            for (Team team : l.teams) {  
                TeamStats actualTeam = (TeamStats) team.stats.get(this);
                System.out.printf("%-22s %-12s %-12s %-12s %-12s %-12s%n", count+"."+team.getName(), actualTeam.points, actualTeam.getWins(), actualTeam.getTies(), actualTeam.getGoalsScored(), actualTeam.getGoalsAgainst());
                count++;
            }
        }
        
    }
    
    @Override
    public void printTopScorers(int k){
        List<Player> allGoalScorers = new ArrayList<>(); // Crear una lista para almacenar todos los jugadores de la liga            
        for(League l:groups){
            // Añadir todos los goleadores de todos los equipos a la lista
            for(Match match : l.matches){
                for(Player p:match.getAllScorers()){
                    if (!allGoalScorers.contains(p)){
                        allGoalScorers.add(p);
                    }
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
            System.out.printf("%-20s %-20s %-13s%n", "Name", "Team", "Goals");
            System.out.println("---------------------------------------------------------");

            int count = 1;
            // Print sorted teams
            while (count<=k && count< allGoalScorers.size()){
                for (Player p : allGoalScorers) { 
                    if (count > k) {
                        break;
                    } 
                    OutfielderStats actualplayer = (OutfielderStats) p.stats.get(this);
                    System.out.printf("%-20s %-20s %-13s%n", count+"."+p.getName(), actualplayer.player.team.name, actualplayer.getGoals());
                    count++;
                }
            }        

    }
    


    
}
