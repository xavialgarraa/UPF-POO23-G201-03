import java.util.Random;

public class OutfielderStats extends PlayerStats{
    private int tackles;
    private int passes;
    private int shots;
    private int assists;
    private int goals;
        
    public OutfielderStats(Player p){
        super(p);
    }
    
    @Override
    public void updateStats(Match m){
        this.noMatches++; // Actualiza el número de partidos jugados desde la clase base 
        Random random = new Random();
        this.shots += random.nextInt(7); // Genera un número aleatorio de goles para el equipo local (0-6)
        this.tackles += random.nextInt(20);
        this.passes += random.nextInt(50);
        this.assists += random.nextInt(2);
        for (Player p:m.homeScorers){
            if(p.name == this.player.name){
                goals++;
            }
        }
        for (Player p:m.awayScorers){
            if(p.name == this.player.name){
                goals++;
            }
        }
    }
        
    public int getTackles() {
        return tackles;
    }


    public int getPasses() {
        return passes;
    }

    public int getShots() {
        return shots;
    }

    public int getAssists() {
        return assists;
    }
    

    public int getGoals() {
        return goals;
    }
    
    public void PrintStats(){
        System.out.println("\nInformación de "+super.getPlayer().name+ ":");
        System.out.println("Partidos jugados: " + this.noMatches);
        System.out.println("Goles: " + getGoals());
        System.out.println("Pases: " + getPasses());
        System.out.println("Asistencias: " + getAssists());
        System.out.println("Entradas: " + getTackles());}
    


    @Override
    public int compareTo(PlayerStats o){
        if (o instanceof OutfielderStats){
            OutfielderStats os = (OutfielderStats)o;
            if (this.goals < os.goals) {
                return 1;
            } else if (this.goals > os.goals) {
                return -1;
            } else {
                return 0;
            }
        }
        return 0;
    }
}

