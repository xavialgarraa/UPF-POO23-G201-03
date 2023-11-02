import java.util.LinkedList;

public class Group extends Competition {
   
    private int noGroups;
    private LinkedList<Team> groups;

    public Group(String name, Country country, L_Gender gender, boolean clubs){
        super(name, country, gender, clubs);
        this.noGroups = 0;
        this.groups =  new LinkedList<Team>();
    }

    public void generateMatches(){
        //FER
    }
    
    public void simulateMatches(){
        //FER
    }

    public void printTable(){
        //FER
    }


    
}
