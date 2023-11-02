import java.util.LinkedList;
import java.util.Iterator;

public class Cup extends Competition {
    private LinkedList<Team> tr;
    private LinkedList<Match> mr;

    public Cup(String name, Country country, L_Gender gender){
        super(name, country, gender);
        this.tr = new LinkedList<Team>();
        this.mr = new LinkedList<Match>();   
    }

    public int getNumTeams(){
        int numEquipos = 0;
        Iterator<Team> iterator = tr.iterator(); 
        
        while (iterator.hasNext()) {
            Team equipo = iterator.next();
            numEquipos += 1;
        }
        return numEquipos;    

    }
    public int getRounds(){
    
        int rondas = (int) Math.ceil(Math.log(getNumTeams()) / Math.log(2));
        return rondas;


    }
    public void generateMatches(){
        int numMatches = 2^getRounds();
        int Matches2Teams = (getNumTeams()-(numMatches - getNumTeams()))/2;
        for
    }

    public void simulateMatches(){
        //FER
    }

    public void printBracked(){
        //FER
    }


}
