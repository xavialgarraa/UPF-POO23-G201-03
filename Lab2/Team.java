import java.util.LinkedList;

public class Team {
    public enum Gender {
        MASCULINO,
        FEMENINO,
        MIXTO
    }
    
    // Atributos de instancia
    private String name;
    private Country country;
    private Gender gender;
    private LinkedList<Player> players;
    private int matchesPlayed;
    private int wins;
    private int ties;
    private int losses;
    private int goalsScored;
    private int goalsAgainst;
    private int points;

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

    // Método para actualizar las estadísticas del equipo después de un partido
    public void updateStatistics(int goals_s, int goals_a) {
        this.matchesPlayed++;
        this.goalsScored += goals_s;
        this.goalsAgainst += goals_a;

        if (goals_s>goals_a) {
            this.wins++;
            this.points+=3;
        } else if (goals_s==goals_a) {
            this.ties++;
            this.points+=1;
        } else {
            this.losses++;
        }
    }

    // Getters para los atributos del equipo
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country.getName();
    }

    public String getGender() {
        return gender.name(); // Obtener el nombre del enum como una cadena
    }

    public LinkedList<Player> getPlayers() {
        LinkedList<Player> players = new LinkedList<>();
        // Obtener la lista de jugadores del equipo
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

    public void updateStats(Match m){
        
    }


    public void PrintStats(){
        System.out.println("\nInformación del equipo 1:");
        System.out.println("Nombre: " + getName());
        System.out.println("País: " + getCountry());
        System.out.println("Género: " + getGender());
        System.out.println("Partidos jugados: " + getMatchesPlayed());
        System.out.println("Puntos totales: " + getPoints());
        System.out.println("Victorias: " + getWins());
        System.out.println("Empates: " + getTies());
        System.out.println("Derrotas: " + getLosses());
        System.out.println("Goles a favor: " + getGoalsScored());
        System.out.println("Goles en contra: " + getGoalsAgainst());
    }
}

