import java.util.Random;

public class Goalkeeper extends Player {
        private int saves;
        private int goalsAgainst;
        
        public Goalkeeper(boolean gender, String name, int age, Country nationality){
            super(gender, name, age, nationality);
            this.saves = 0;
            this.goalsAgainst = 0;
        
        }

        public void updateStats(Match m){
            super.updateStats(m); // Actualiza el número de partidos jugados desde la clase base            
            Random random = new Random();
            this.matchesPlayed++;
            this.saves += random.nextInt(7); 
            for (Player players : m.getAwayTeam().players){
                if (players.name == this.name){
                    this.goalsAgainst += m.getHomeGoals();
                }
            }
            for (Player players : m.getHomeTeam().players){
                if (players.name == this.name){
                    this.goalsAgainst += m.getAwayGoals();
                }
            }
            
        }
        
        public void PrintStats(){
            System.out.println("\nInformación de "+getName()+ ":");
            System.out.println("Goles: " + getGoals());
            System.out.println("Paradas: " + getSaves());
            System.out.println("Goles Recibidos: " + getGoalsAgainst());}
        
        public int getSaves() {
            return saves;
        }
        public int getGoalsAgainst() {
            return goalsAgainst;
        }
}