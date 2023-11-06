import java.util.LinkedList;

public class Team {
    public enum Gender {
        MASCULINO,
        FEMENINO,
        MIXTO
    }
    
    // Atributos de instancia
    protected String name;
    protected Country country;
    protected Gender gender;
    protected LinkedList<Player> players;
    protected int matchesPlayed;
    protected int wins;
    protected int ties;
    protected int losses;
    protected int goalsScored;
    protected int goalsAgainst;
    protected int points;

    // Constructor
    public Team(String name, Country country, Gender gender) {
        this.name = name;
        this.country = country;
        this.gender = gender;
        this.players = new LinkedList<>();
    }

    // Método para agregar un jugador al equipo
    public void addPlayer(Player player) {
        // Verificar si el jugador es del mismo género que el equipo
        if (this.gender == Gender.MIXTO) {
            players.add(player);
            System.out.println(player.getName()+" fue añadido/a\n");

        } 
        else if (this.gender == Gender.FEMENINO && player.getGender()){
            players.add(player);
            System.out.println(player.getName()+" fue añadido/a\n");

        }
        else if (this.gender == Gender.MASCULINO && player.getGender() == false){
            players.add(player);
            System.out.println(player.getName()+" fue añadido/a\n");

        }
        else{
            System.out.println(player.getName()+" no es del género adecuado\n");
        }
    }
    

    // Método para eliminar un jugador del equipo
    public void removePlayer(Player player) {
        players.remove(player);
    }

    // Getters para los atributos del equipo
    public String getName() {
        return name;
    }

    public String getCountryName() {
        return country.getName();
    }

    public int getGender() {
        return gender.ordinal(); // Obtener el nombre del enum como un int
    }

     public String getGenderStr() {
        return gender.name(); // Obtener el nombre del enum como un int
    }

    public LinkedList<Player> getPlayers() {
        return players;
    }

    // Getters para las estadísticas del equipo
    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getWins() {
        return wins;
    }

    public int getTies() {
        return ties;
    }

    public int getLosses() {
        return losses;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }
    
    public int getPoints() {
        return points;
    }
    public Country getCountry() {
        return country;
    }

    public void updateStats(Match m){
        if (this.name == m.getHomeTeam().getName()) {
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
        else if (this.name == m.getAwayTeam().getName()) {
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
        System.out.println("Nombre: " + getName());
        System.out.println("País: " + getCountry().getName());
        System.out.println("Género: " + getGenderStr());
        System.out.println("Partidos jugados: " + getMatchesPlayed());
        System.out.println("Puntos totales: " + getPoints());
        System.out.println("Victorias: " + getWins());
        System.out.println("Empates: " + getTies());
        System.out.println("Derrotas: " + getLosses());
        System.out.println("Goles a favor: " + getGoalsScored());
        System.out.println("Goles en contra: " + getGoalsAgainst());
    }
}

