import java.util.LinkedList;


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
    
    
    
    public void printLeagueTable() { 
        
    }
    
    public void printTopScorers(int k){

    }

    
    
    
    
    public void printTeams(){
        for (Team t: teams){
            System.out.println(t.getName());
        }
    }
}

    

