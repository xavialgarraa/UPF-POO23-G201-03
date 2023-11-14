public abstract class PlayerStats implements Comparable{
    protected Player player;
    protected int noMatches;
    
    
    public PlayerStats(Player p){
    this.player = p;
}

    public void updateStats(Match m){

}

    public abstract void PrintStats();
}
