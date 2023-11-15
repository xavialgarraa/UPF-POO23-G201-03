import java.util.HashMap;

public class Player {
    // Instance variables
    protected boolean gender;
    protected String name;
    protected int age;
    protected Country nationality;
    protected HashMap<Competition,PlayerStats> stats;


    // Constructor
    public Player(boolean gender, String name, int age, Country nationality) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.stats = new HashMap<>();
    }

    // Getters for player attributes
    public boolean getGender() {
            return gender; // Retorna gender
        }
    

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return Country.class.getName();
    }

    

    public void update(Competition c, Match m){  
    }

    public boolean equals(Object o){
        if(o instanceof Player){
            Player c = (Player)o;
            return name == c.name;
        }
        else return false;
    }

}
