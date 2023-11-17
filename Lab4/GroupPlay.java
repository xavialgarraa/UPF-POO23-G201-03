import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class GroupPlay extends Competition {
   
    private int noGroups;
    private LinkedList<League> groups;

    public GroupPlay(String name, Country country, L_Gender gender, boolean clubs){
        super(name, country, gender, clubs);
        this.noGroups = 2;
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
    
    public void printGroups() {
        System.out.println("Groups in " + this.name + ":");
        int groupNumber = 1;
        for (League group : this.groups) {
            System.out.println("Grupo " + groupNumber + ":");
            group.printTeams();
            groupNumber++;
        }
    }
    public void printGroupPlayMatches(){
        for (League group : this.groups) {
            group.printMatches();
        }
    }
    
    public void simulateMatches(){
        for (League liga:this.groups){
            liga.generateMatches();
            for (Match match : liga.matches){
                match.simulateMatch(this);
                match.printmatch(this);
                match.getHomeTeam().update(this,match);
                match.getAwayTeam().update(this,match);
            }
        }
    }

    public void printTable(){
        //FER
    }


    
}
