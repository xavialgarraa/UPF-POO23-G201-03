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
