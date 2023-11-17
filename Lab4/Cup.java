import java.util.Collections;
import java.util.Arrays;


public class Cup extends Competition {
    private Team[][] tr;
    private CupMatch[][] mr;

    public Cup(String name, Country country, L_Gender gender, boolean clubs) {
        super(name, country, gender, clubs);
        this.tr = new Team[10][]; // Asume un máximo de 10 rondas
        this.mr = new CupMatch[10][];
    }

    public void TeamstoCompetition() {
        tr[0] = teams.toArray(new Team[0]);
    }

    public void generateMatches() {
        System.out.println("\nLos partidos de "+this.name+":");
        for (int round = 0; round < tr.length && tr[round].length > 1; round++) {
            System.out.println("\nRonda " + (round+1) + " donde forman parte:\n" );
            for(Team t: tr[round]){
                System.out.println("-"+t.name);
            }

            Collections.shuffle(Arrays.asList(tr[round]));
            int numTeams = tr[round].length;
            Team t = null;
            
            if (numTeams % 2 != 0) {
                t = tr[round][numTeams - 1];
                tr[round] = Arrays.copyOf(tr[round], numTeams - 1); // Elimina el último equipo
            }
    
            mr[round] = new CupMatch[tr[round].length / 2];
            for (int i = 0; i < tr[round].length; i += 2) { 
                Team team1 = tr[round][i];
                Team team2 = tr[round][i + 1];
                CupMatch cupmatch = new CupMatch(team1, team2);
                mr[round][i / 2] = cupmatch;
            }
    
            tr[round+1] = new Team[mr[round].length + (t != null ? 1 : 0)];
            for (int i = 0; i < mr[round].length; i++) {
                CupMatch m = mr[round][i];
                m.simulateMatch(this);
                m.printmatch(this);
                m.homeTeam.update(this, m);
                m.awayTeam.update(this, m);                
                if (m.getHomeGoals() < m.getAwayGoals()) {
                    tr[round+1][i] = m.getAwayTeam();
                } else {
                    tr[round+1][i] = m.getHomeTeam();
                }
            }
            
            if (t != null){
                tr[round+1][tr[round+1].length - 1] = t;
            }
        }
    }
    
    @Override
    public void simulateMatches() {
        int lastRound = 0;
        for (int i = 0; i < tr.length; i++) {
            if (tr[i] != null && tr[i].length > 0) {
                lastRound = i;
            }
        }
        if (tr[lastRound] != null && tr[lastRound].length > 0) {
            System.out.println("El ganador de " + this.name + " es:\n" + tr[lastRound][0].name);
        } else {
            System.out.println("No se han simulado partidos en " + this.name);
        }
    }
}
