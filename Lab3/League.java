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
            match.simulateMatch();
            match.printmatch();
            match.getHomeTeam().updateStats(match);
            match.getAwayTeam().updateStats(match);
        }
    }
    
    public void printRounds(){
        for (Match m : matches) {
            System.out.println(m.getHomeTeam().getName() + " - " + m.getAwayTeam().getName());
        }
    }

    public void printLeagueTable(){
        //falta fer
    }
    
  }