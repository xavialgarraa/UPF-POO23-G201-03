import java.util.HashMap;
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
    protected HashMap<Competition,TeamStats> stats;

    // Constructor
    public Team(String name, Country country, Gender gender) {
        this.name = name;
        this.country = country;
        this.gender = gender;
        this.players = new LinkedList<>();
        this.stats  = new HashMap<>();
    }

    // Método para agregar un jugador al equipo
    public void addPlayer(Player player) {
        // Verificar si el jugador es del mismo género que el equipo
        if (this.gender == Gender.MIXTO) {
            players.add(player);
            player.team=this;
            System.out.println(player.getName()+" fue añadido/a\n");

        } 
        else if (this.gender == Gender.FEMENINO && player.getGender()){
            players.add(player);            
            player.team=this;
            System.out.println(player.getName()+" fue añadido/a\n");

        }
        else if (this.gender == Gender.MASCULINO && player.getGender() == false){
            players.add(player);
            player.team=this;
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

    public void update(Competition c, Match m){
        if (!stats.containsKey(c)){
            TeamStats newStats = new TeamStats(this);
            stats.put(c, newStats);
        }
        this.stats.get(c).updateStats(m);
        for (Player p:this.players){
            p.update(c, m);
        }
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

    public Country getCountry() {
        return country;
    }

}

