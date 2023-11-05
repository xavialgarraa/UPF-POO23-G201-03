import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class GroupPlay extends Competition {
   
    private int noGroups;
    private LinkedList<League> groups;

    public Group(String name, Country country, L_Gender gender, boolean clubs){
        super(name, country, gender, clubs);
        this.noGroups = noGroups;
        this.groups =  new LinkedList<League>();
    }

    public void generateMatches(){
        int noteams = super.teams.size();
        for (int i=1; i<=noGroups; i++){
            League Group = new League("Group " + i, country, gender, clubs);
            groups.add(Group);
        } 

        ArrayList<Team> equipos_mix = new ArrayList<Team>(this.teams);
        Collections.shuffle(equipos_mix);
        int k;
        for (int i = 0 , j = 0; j < noteams; j++, i++){
            k = i % this.noGroups;
            groups.get(k).addTeam(equipos_mix.get(i));

        }
    }
    
    public void simulateMatches(){
        //FER
    }

    public void printTable(){
        //FER
    }


    
}
