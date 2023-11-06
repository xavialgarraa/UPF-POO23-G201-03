import java.util.Random;

public class Outfilder extends Player{
    private int tackles;
    private int passes;
    private int shots;
    private int assists;

    public Outfilder(Boolean gender, String name, int age,  Country nationality){
        super(gender, name, age, nationality);
    }
    
    @Override
    public void updateStats(Match m){
        matchesPlayed++; // Actualiza el número de partidos jugados desde la clase base      
        Random random = new Random();
        this.shots += random.nextInt(7); // Genera un número aleatorio de goles para el equipo local (0-6)
        this.tackles += random.nextInt(20);
        this.passes += random.nextInt(50);
        this.assists += random.nextInt(1);
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
    public void asistir(){
        this.assists++;
    }
    
    public void PrintStats(){
        System.out.println("\nInformación de "+getName()+ ":");
        System.out.println("Partidos jugados: " + getMatchesPlayed());
        System.out.println("Goles: " + getGoals());
        System.out.println("Pases: " + getPasses());
        System.out.println("Asistencias: " + getAssists());
        System.out.println("Entradas: " + getTackles());}
    

}
