import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Competition {
        
    public enum L_Gender {
        MASCULINO,
        FEMENINO,
        MIXTO
    }
    protected String name;
    protected Country country;
    protected League.L_Gender gender;
    protected LinkedList<Team> teams;
    protected LinkedList<Match> matches;
    protected Boolean clubs;
    

    public Competition(String name, Country country, L_Gender gender, boolean clubs) {
        this.name = name;
        this.country = country;
        this.gender = gender;
        this.clubs = clubs;
        this.teams = new LinkedList<Team>();
        this.matches = new LinkedList<Match>();

    }

    public void addTeam(Team team) {
        if (clubs){
            if (team.getCountry().equals(this.country)){
                if (this.gender == L_Gender.MIXTO) {
                    // Si la competición es de género mixto, se acepta cualquier equipo.
                    teams.add(team);
                } else if (this.gender == L_Gender.FEMENINO) {
                    // Si la competición es femenina, se verifica si el equipo también es femenino.
                    if (team.getGender() == 1) {
                        teams.add(team);
                    }
                } else if (this.gender == L_Gender.MASCULINO) {
                    // Si la competición es masculina, se verifica si el equipo también es masculino.
                    if (team.getGender() == 0) {
                    teams.add(team);
                }   
            }else {System.out.println("El equipo no cumple con el género de la competición.");}
            }else{System.out.println("El equipo no cumple con el país de la competición.");}
        }else{
            if (this.gender == L_Gender.MIXTO) {
            // Si la competición es de género mixto, se acepta cualquier equipo.
                teams.add(team);
            } else if (this.gender == L_Gender.FEMENINO) {
            // Si la competición es femenina, se verifica si el equipo también es femenino.
                if (team.getGender() == 1) {
                    teams.add(team);
                }
            } else if (this.gender == L_Gender.MASCULINO) {
                // Si la competición es masculina, se verifica si el equipo también es masculino.
                if (team.getGender() == 0) {
                    teams.add(team);
                }        
            } else{ System.out.println("El equipo no cumple con el género de la competición.");}
        }
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
    
    public void printRounds(){
        for (Match m : matches) {
            System.out.println(m.getHomeTeam().getName() + " - " + m.getAwayTeam().getName());
        }
    }
    
    public void simulateMatches() {
    }

    public void printMatches(){
        System.out.println("Resultados de"+ name +": \n" );
        for (Match m : matches) {
            System.out.println("\n");
            m.printmatch(this);
        }
    }

    // Implement simulateMatch method for simulating individual matches.
    public void simulateSingleMatches(Match m) {
        m.simulateMatch(this);
        for (Player p:m.homeTeam.getPlayers()){
            p.update(this, m);
        }
        for (Player p:m.awayTeam.getPlayers()){
            p.update(this, m);
        }
    }
    
    public void printSingleMatches(Match m){
        System.out.println("Resultado: " + m.getHomeTeam() + " " + m.getHomeGoals() + " - " + m.getAwayGoals());
            
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public L_Gender getGender() {
        return gender;
    }

    public LinkedList<Team> getTeams() {
        return teams;
    }


    public LinkedList<Match> getMatches() {
        return matches;
    }
    
    /*public void printLeagueTable() { 
        // Print the league table
        System.out.println("\nLa clasificación de " + this.name + ":");
        System.out.printf("%-20s %-13s %-12s %-12s %-12s %-12s%n", "Team", "Points", "Wins", "Ties", "Goals For", "Goals Against");
        System.out.println("--------------------------------------------------------------------------------------");
        for (int i = 0; i < this.teams.size(); i++) {  
            for (int j = i+1; j < this.teams.size(); j++){
                TeamStats actualTeam = (TeamStats) this.teams.get(i).stats.get(this);
                TeamStats nextTeam = (TeamStats) this.teams.get(j).stats.get(this);
                if (nextTeam.compareTo(actualTeam)==-1){ //nextTeam tiene mas puntos que actualTeam
                    Team temp = this.teams.get(i);
                    this.teams.set(i, this.teams.get(j));
                    this.teams.set(j, temp);
                }
            }
        }
        int count = 1;
        // Print sorted teams
        for (Team team : this.teams) {  
            TeamStats actualTeam = (TeamStats) team.stats.get(this);
            System.out.printf("%-22s %-12s %-12s %-12s %-12s %-12s%n", count+"."+team.getName(), actualTeam.points, actualTeam.getWins(), actualTeam.getTies(), actualTeam.getGoalsScored(), actualTeam.getGoalsAgainst());
            count++;
        }
    }*/

    public void printLeagueTable() { 
        // Sort the teams based on the overridden compareTo method in TeamStats
        Collections.sort(this.teams, (team1, team2) -> {
            TeamStats stats1 = (TeamStats) team1.stats.get(this);
            TeamStats stats2 = (TeamStats) team2.stats.get(this);
            return stats1.compareTo(stats2);
        });

        // Print the league table
        System.out.println("\nLa clasificación de " + this.name + ":");
        System.out.printf("%-20s %-13s %-12s %-12s %-12s %-12s%n", "Team", "Points", "Wins", "Ties", "Goals For", "Goals Against");
        System.out.println("--------------------------------------------------------------------------------------");

        int count = 1;
        // Print sorted teams
        for (Team team : this.teams) {  
            TeamStats actualTeam = (TeamStats) team.stats.get(this);
            System.out.printf("%-22s %-12s %-12s %-12s %-12s %-12s%n", count+"."+team.getName(), actualTeam.points, actualTeam.getWins(), actualTeam.getTies(), actualTeam.getGoalsScored(), actualTeam.getGoalsAgainst());
            count++;
        }
    }

    public void printTopScorers(int k){
        // Crear una lista para almacenar todos los jugadores de la liga
        List<Player> allGoalScorers = new ArrayList<>();

        // Añadir todos los jugadores de todos los equipos a la lista
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
        System.out.printf("%-20s %-16s %-13s%n", "Name", "Nationality", "Goals");
        System.out.println("---------------------------------------------------------");

        int count = 1;
        // Print sorted teams
        while (count<=k && count< allGoalScorers.size()){
            for (Player p : allGoalScorers) { 
                if (count > k) {
                    break;
                } 
                OutfielderStats actualplayer = (OutfielderStats) p.stats.get(this);
                System.out.printf("%-20s %-16s %-13s%n", count+"."+p.getName(), actualplayer.player.nationality.name, actualplayer.getGoals());
                count++;
            }
        }
        

    }

    
    
    
    
    public void printTeams(){
        for (Team t: teams){
            System.out.println(t.getName());
        }
    }
}

    

