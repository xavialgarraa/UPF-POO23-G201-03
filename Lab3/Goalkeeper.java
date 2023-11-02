public class Goalkeeper extends Player {
        private int saves;
        private int goalsAgainst;
        
        public Goalkeeper(boolean gender, String name, int age, Country nationality){
            super(gender, name, age, nationality);
            this.saves = 0;
            this.goalsAgainst = 0;
        
        }

        public void updateStats(){
            this.saves += saves; //random
            this.goalsAgainst += goalsAgainst;
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