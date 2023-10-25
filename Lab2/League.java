import java.util.LinkedList;


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

    public void printMatches(){
        for (Match m : matches) {
            System.out.println("Resultado: " + m.getHomeTeam() + " " + m.getHomeGoals() + " - " + m.getAwayGoals());
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
    
    public void printLeagueTable() {
        // Implement logic to print the league table.
        
    }

    public void printTopScorers() {
        // Implement logic to print the top scorers.
    }
    
    public void printTeams(){
        for (Team t: teams){
            System.out.println(t.getName());
        }
    }
}
