
public class Outfilder extends Player {

    public Outfilder(boolean gender, String name, int age, Country nationality){
        super(gender, name, age, nationality);
    }
    
    @Override
    public void update(Competition c, Match m){
        if (!stats.containsKey(c)){
            PlayerStats newStats = new OutfielderStats(this);
            stats.put(c, newStats);
        }
        this.stats.get(c).updateStats(m);
    }
}
