import java.util.Random;

public class OutfielderStats extends PlayerStats{
    private int saves;
    private int goalsAgainst;
        
    public OutfielderStats(Player p){
        super(p);
    }

    public void updateStats(Match m){
        super.updateStats(m); // Actualiza el número de partidos jugados desde la clase base            
        Random random = new Random();
        this.noMatches++;
        this.saves += random.nextInt(7); 
        for (Player players : m.getAwayTeam().players){
            if (players.name == this.player.name){
                this.goalsAgainst += m.getHomeGoals();
           }
        }
        for (Player players : m.getHomeTeam().players){
            if (players.name == this.player.name){
                this.goalsAgainst += m.getAwayGoals();
            }
        }
            
    }
        
    public void PrintStats(){
            System.out.println("\nInformación de "+this.player.getName()+ ":");
            System.out.println("Goles: " + this.player.getGoals());
            System.out.println("Paradas: " + getSaves());
            System.out.println("Goles Recibidos: " + getGoalsAgainst());}
        
        public int getSaves() {
            return saves;
        }
        public int getGoalsAgainst() {
            return goalsAgainst;
    }

    @Override
    public int compareTo(Object o){
        return 3;
    }
}

