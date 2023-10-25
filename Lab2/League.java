import java.util.LinkedList;
import java.util.List;

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
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void generateMatches() {
        for (int i = 0; i < teams.size(); i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                Match match1 = new Match(teams.get(i), teams.get(j));
                Match match2 = new Match(teams.get(j), teams.get(i));
                matches.add(match1);
                matches.add(match2);
            }
        }
    }

    public void simulateMatches() {
        for (Match match : matches) {
            match.simulateMatch();
            match.getHomeTeam().updateStats(match);
            match.getAwayTeam().updateStats(match);
        }
    }

    public void printMatches(Match m){
        System.out.println("Resultado: " + m.getHomeTeam() + " " + m.getHomeGoals() + " - " + m.getAwayGoals());
    }

    // Implement simulateMatch method for simulating individual matches.

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public L_Gender getGender() {
        return gender;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public int getNumMatches() {
        return numMatches;
    }

    public List<Match> getMatches() {
        return matches;
    }
    
    public void printLeagueTable() {
        // Implement logic to print the league table.
        
    }

    public void printTopScorers() {
        // Implement logic to print the top scorers.
    }
}
