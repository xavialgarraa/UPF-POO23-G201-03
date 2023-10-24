public class Player {
    // Instance variables
    private boolean gender;
    private String name;
    private int age;
    public Country nationality;
    private int matchesPlayed;
    private int tackles;
    private int passes;
    private int shots;
    private int assists;
    private int goals;

    // Constructor
    public Player(boolean gender, String name, int age, Country nationality) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    // Method to update player's statistics after a match
    public void updateStatistics(int tackles, int passes, int shots, int assists, int goals) {
        this.matchesPlayed++;
        this.tackles += tackles;
        this.passes += passes;
        this.shots += shots;
        this.assists += assists;
        this.goals += goals;
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
    System.out.println("\nInformación de "+getName()+ ":");
    System.out.println("Goles: " + getGoals());
    System.out.println("Pases: " + getPasses());
    System.out.println("Asistencias: " + getAssists());
    System.out.println("Entradas: " + getTackles());}
}
