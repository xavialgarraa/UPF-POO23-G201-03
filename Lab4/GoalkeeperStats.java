import java.util.Random;

public class GoalkeeperStats extends PlayerStats{
    private int saves;
    private int goalsAgainst;
        
    public GoalkeeperStats(Player p){
        super(p);
    }

    @Override
    public void updateStats(Match m){
        Random random = new Random();
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
            System.out.println("Paradas: " + getSaves());
            System.out.println("Goles Recibidos: " + getGoalsAgainst());}
        
        public int getSaves() {
            return saves;
        }
        public int getGoalsAgainst() {
            return goalsAgainst;
    }

    @Override
    public int compareTo(PlayerStats o){
        return 3;
    }
}
