import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Cup extends Competition {
    private List<Team> tr;
    private List<CupMatch> mr;

    public Cup(String name, Country country, L_Gender gender, boolean clubs) {
        super(name, country, gender, clubs);
        this.mr = new ArrayList<CupMatch>();
        this.tr = new ArrayList<Team>();
    }

    public void TeamstoCompetition() {
        tr.addAll(teams);
    }

    public void generateMatches() {
        while (tr.size()>1) {
            Collections.shuffle(tr);
            int numTeams = tr.size();
            Team t = null;
            
            if (numTeams % 2 != 0) {
                t = tr.remove(numTeams - 1);
            }
    
            for (int i = 0; i < tr.size(); i += 2) { 
                Team team1 = tr.get(i);
                Team team2 = tr.get(i + 1);
                CupMatch cupmatch = new CupMatch(team1, team2);
                mr.add(cupmatch);
            }
    
            List<Team> winnList = new ArrayList<>();

            for (CupMatch m : mr) {
                m.simulateMatch();
                m.printmatch();
                m.getHomeTeam().updateStats(m);
                m.getAwayTeam().updateStats(m);
                if (m.getHomeGoals() < m.getAwayGoals()) {
                    winnList.add(m.getAwayTeam());
                } else {
                    winnList.add(m.getHomeTeam());
                }
            }
            
            if (t != null){
                winnList.add(t);
            }
            tr = winnList;
            mr.clear();
            
        }
        
        
    }
    
    @Override
    public void simulateMatches() {
        if (!tr.isEmpty()) {
            System.out.println("El ganador de " + this.name + " es:\n" + tr.get(0).name);
        } else {
            System.out.println("No se han simulado partidos en " + this.name);
        }
    }
}
