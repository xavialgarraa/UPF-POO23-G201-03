
public class TeamStats implements Comparable<TeamStats> {
    protected Team team;
    protected int matchesPlayed;
    protected int wins;
    protected int ties;
    protected int losses;
    protected int goalsScored;
    protected int goalsAgainst;
    protected int points;

    public TeamStats(Team t){
        team = t;
    }

    public void updateStats(Match m){
        if (this.team.name == m.getHomeTeam().getName()) {
            this.matchesPlayed++;
            this.goalsScored += m.getHomeGoals();
            this.goalsAgainst += m.getAwayGoals();
            if (m.getHomeGoals()>m.getAwayGoals()){
                this.points += 3;
                this.wins++;
            } else if (m.getHomeGoals()< m.getAwayGoals()){
                this.losses++;
            } else{
                this.points++;
                this.ties++;
            } 
        }
        else if (this.team.name == m.getAwayTeam().getName()) {
            this.matchesPlayed++;
            this.goalsScored += m.getAwayGoals();
            this.goalsAgainst += m.getHomeGoals();
            if (m.getHomeGoals() < m.getAwayGoals()){
                this.points += 3;
                this.wins++;
            } else if (m.getHomeGoals()> m.getAwayGoals()){
                this.losses++;
            } else{
                this.points++;
                this.ties++;
            } 
        } else{
            System.out.println("El partido llevado a estadísticas no existe.");
        }
    }

    public void PrintStats(){
            System.out.println("\nInformación del equipo:");
            System.out.println("Nombre: " + team.getName());
            System.out.println("País: " + team.getCountry().getName());
            System.out.println("Género: " + team.getGenderStr());
            System.out.println("Partidos jugados: " + getMatchesPlayed());
            System.out.println("Puntos totales: " + getPoints());
            System.out.println("Victorias: " + getWins());
            System.out.println("Empates: " + getTies());
            System.out.println("Derrotas: " + getLosses());
            System.out.println("Goles a favor: " + getGoalsScored());
            System.out.println("Goles en contra: " + getGoalsAgainst());
    }

    //Getters
    public int getGoalsAgainst() {
        return goalsAgainst;
    }
    public int getGoalsScored() {
        return goalsScored;
    }
    public int getLosses() {
        return losses;
    }
    public int getMatchesPlayed() {
        return matchesPlayed;
    }
    public int getPoints() {
        return points;
    }
    public Team getTeam() {
        return team;
    }
    public int getTies() {
        return ties;
    }
    public int getWins() {
        return wins;
    }

    @Override
    public int compareTo(TeamStats o){   
        if (points != o.points) {
            return points > o.points ? -1 : 1;
        }
    
        // Si los puntos son iguales, comparamos la diferencia de goles
        int goalDifference = this.goalsScored - this.goalsAgainst;
        int oGoalDifference = o.goalsScored - o.goalsAgainst;
    
        if (goalDifference != oGoalDifference) {
            return goalDifference > oGoalDifference ? -1 : 1;
        }
    
        // Si la diferencia de goles es igual, comparamos los goles a favor
        if (this.goalsScored != o.goalsScored) {
            return this.goalsScored > o.goalsScored ? -1 : 1;
        }
    
        // Si todos los criterios son iguales, los equipos se pueden ordenar arbitrariamente
        return 0;
    }
}
