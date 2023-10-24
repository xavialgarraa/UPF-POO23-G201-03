import java.util.List;
public class League {
    private String name;
    private Country country;
    private Team.Gender gender;
    private List<Team> team;
    private int numMatches;
    private List<Match> matches;

    public League(String name, Country country, int gender) {
        this.name = name;
        this.country = country;
        this.gender = gender;
        this.teams = new ArrayList<>();
        this.numMatches = 0;
        this.matches = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void generateMatches() {
        for (int i = 0; i < teams.size(); i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                Match match1 = new Match(teams.get(i).getName(), teams.get(j).getName());
                Match match2 = new Match(teams.get(j).getName(), teams.get(i).getName());
                matches.add(match1);
                matches.add(match2);
            }
        }
    }

    public void simulateMatches() {
        for (Match match : matches) {
            match.simulateMatch();
            match.getTeam1().updateStats(match);
            match.getTeam2().updateStats(match);
        }
    }

    // Implement simulateMatch method for simulating individual matches.

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public int getGender() {
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


    private List<Match> matches;
    private List<Team> teams;
    private List<Country> countries;

    public League(List<Country> countries) {
        this.matches = new ArrayList<>();
        this.teams = new ArrayList<>();
        this.countries = countries;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void addMatch(Match match) {
        matches.add(match);
    }

    public void generateMatches() {
        for (Match match : matches) {
            match.generateMatches();
        }
    }

    public void simulateMatches() {
        for (Match match : matches) {
            match.simulateMatches();
        }
    }

    // Implement printLeagueTable method to print the league table.

    // Implement printTopScorers method to print the top scorers.

    // Implement other methods for league management.
}
