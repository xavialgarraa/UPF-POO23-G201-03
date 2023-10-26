import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class League {
    
    public enum L_Gender {
        MASCULINO,
        FEMENINO,
        MIXTO
    }
    private String name;
    private Country country;
    private League.L_Gender gender;
    private LinkedList<Team> teams;
    private int numMatches;
    private LinkedList<Match> matches;

    public League(String name, Country country, L_Gender gender) {
        this.name = name;
        this.country = country;
        this.gender = gender;
        this.numMatches = 0;
        this.teams = new LinkedList<Team>();
        this.matches = new LinkedList<Match>();

    }

    public void addTeam(Team team) {
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
        } else{
            System.out.println("El equipo no cumple con el género de la competición.");
        }
    }

    public void generateMatches() {
        for (int i = 0; i < teams.size(); i++) {
            for (int j = 0; j < teams.size(); j++) {
                if (i != j){
                    Match match1 = new Match(teams.get(i), teams.get(j));
                    matches.add(match1); 
                    numMatches++;
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
        for (Match match : matches) {
            match.simulateMatch();
            match.getHomeTeam().updateStats(match);
            match.getAwayTeam().updateStats(match);
        }
    }

    public void printMatches(){
        System.out.println("Resultados de LaLiga: " );
        for (Match m : matches) {
            System.out.println(m.getHomeTeam().getName() + " " + m.getHomeGoals() + " - " + m.getAwayGoals() + " " + m.getAwayTeam().getName());
        }
    }

    // Implement simulateMatch method for simulating individual matches.
    public void simulateSingleMatches(Match m) {
        m.simulateMatch();
        m.getHomeTeam().updateStats(m);
        m.getAwayTeam().updateStats(m);
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

    public int getNumMatches() {
        return numMatches;
    }

    public LinkedList<Match> getMatches() {
        return matches;
    }
    
    /*public void printLeagueTable() {
        / Implement logic to print the league table.
             Collections.sort(allTeams, new Comparator<Team>() {
            public int compare(Team t1, Team t2) {
                // Implement sorting logic based on points and goal difference
                int comparePoints = Integer.compare(t2.getPoints(), t1.getPoints());
    
                if (comparePoints == 0) {
                    // If points are equal, compare by goal difference
                    int goalDifference1 = t1.getGoalsScored() - t1.getGoalsAgainst();
                    int goalDifference2 = t2.getGoalsScored() - t2.getGoalsAgainst();
                    int compareGoalDifference = Integer.compare(goalDifference2, goalDifference1);
    
                    if (compareGoalDifference == 0) {
                        // If goal difference is also equal, compare by the number of goals scored
                        int compareGoalsScored = Integer.compare(t2.getGoalsScored(), t1.getGoalsScored());
                        return compareGoalsScored;
                    }
    
                    return compareGoalDifference;
                }
    
                return comparePoints;
            }
        });
        
    }*/

    public void printTopScorers() {
        System.out.println("\nTop Scorers for " + name);
        System.out.println("-------------------------------");
    
        // Create a list of all players who scored in any match
        List<Player> allScorers = new LinkedList<>();
        Set<Player> addedPlayers = new HashSet<>();
    
        // Add home scorers from all matches
        for (Match match : matches) {
            for (Player homeScorer : match.getHomeScorers()) {
                if (addedPlayers.add(homeScorer)) {
                    allScorers.add(homeScorer);
               }
           }
        }
        
            // Add away scorers from all matches
        for (Match match : matches) {
            for (Player awayScorer : match.getAwayScorers()) {
                if (addedPlayers.add(awayScorer)) {
                    allScorers.add(awayScorer);
                }
            }
        }
    
        // Sort the players based on their goal-scoring statistics
        Collections.sort(allScorers, new Comparator<Player>() {
            public int compare(Player player1, Player player2) {
                // Compare by goals scored
                return Integer.compare(player2.getGoals(), player1.getGoals());
            }
        });
    
        // Print the top scorers
        int count = 1;
        for (Player player : allScorers) {
            if (count >= 11) {
                break; // Print only the top 10 scorers
            }
            System.out.println(count+". "+ player.getName() + " - Goals: " + player.getGoals());
            count++;
        }
    }
    
    
    
    public void printTeams(){
        for (Team t: teams){
            System.out.println(t.getName());
        }
    }
}
