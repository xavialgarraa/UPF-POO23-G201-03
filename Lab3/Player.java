public class Player {
    // Instance variables
    protected boolean gender;
    protected String name;
    protected int age;
    protected Country nationality;
    protected int matchesPlayed;
    protected int goals;

    // Constructor
    public Player(boolean gender, String name, int age, Country nationality) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.nationality = nationality;
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

    // Getters for player statistics
    public int getMatchesPlayed() {
        return matchesPlayed;
    }


    public int getGoals() {
        return goals;
    }

    public void marcarGol() {
        this.goals++;
    }

    public void updateStats(Match m){
    }

    public boolean equals(Object o){
        if(o instanceof Player){
            Player c = (Player)o;
            return name == c.name;
        }
        else return false;
    }

}
