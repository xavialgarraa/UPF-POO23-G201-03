public class Goalkeeper extends Player {

    public Goalkeeper(boolean gender, String name, int age, Country nationality){
        super(gender, name, age, nationality);
    }

    @Override
    public void update(Competition c, Match m){
        if (!stats.containsKey(c)){
            PlayerStats newStats = new GoalkeeperStats(this);
            stats.put(c, newStats);
        }
        this.stats.get(c).updateStats(m);
    }
}