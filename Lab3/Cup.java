import java.util.Collections;
import java.util.LinkedList;

public class Cup extends Competition {
    private LinkedList<Team> tr;
    private LinkedList<Match> mr;
    private Team[][] rounds;

    public Cup(String name, Country country, L_Gender gender, boolean clubs) {
        super(name, country, gender, clubs);
        this.tr = new LinkedList<Team>();
        this.mr = new LinkedList<Match>();
        int numTeams = getNumTeams();
        this.rounds = new Team[numTeams][numTeams];
    }

    
    public int getNumTeams() {
        return tr.size();
    }

    public void generateMatches() {
        for(Team t:teams){
            tr.add(t);
        }
        Collections.shuffle(tr);
        int numTeams = tr.size();

        if (numTeams % 2 != 0) {
            Team t = tr.removeLast();
            numTeams--;
        }

        for (int i = 0; i < numTeams; i += 2) {
            Team team1 = tr.get(i);
            Team team2 = tr.get(i + 1);
            CupMatch cupmatch = new CupMatch(team1, team2);
            mr.add(cupmatch);
        }
    }
    
    @Override
    public void simulateMatches() {
        int round = 0;
        while (rounds[round].length > 1) {
            for (int i = 0; i < rounds[round].length; i += 2) {
                Team homeTeam = rounds[round][i];
                Team awayTeam = rounds[round][i + 1];
                for (Match m:mr){
                    m.simulateMatch();
                }
                
    
                // Imprime el resultado del partido y el número de ronda
                System.out.println("Ronda " + (round + 1));
                System.out.println(homeTeam.getName() + " vs. " + awayTeam.getName());
                System.out.println("Resultado: " + homeTeam.getName() + " " + homeTeam.getGoalsScored() + " - " + homeTeam.getGoalsScored() + " " + awayTeam.getName());
                System.out.println("------------------------------------");
            }
    
            round++;
        }
    
        // Al final del bucle while, el ganador del torneo debería estar en rounds[round - 1][0]
        Team tournamentWinner = rounds[round - 1][0];
        System.out.println("El ganador del torneo es: " + tournamentWinner.getName());
    }
    


