public abstract class PlayerStats implements Comparable<PlayerStats>{
    protected Player player;
    protected int noMatches;
    protected int goals;
    
    
    public PlayerStats(Player p){
    this.player = p;
}

    public void updateStats(Match m){
        noMatches++;
}

    public abstract void PrintStats();

    public int getNoMatches() {
        return noMatches;
    }

    public Player getPlayer() {
        return player;
    }

    public int getGoals() {
        return goals;
    }

    public void marcarGol() {
        this.goals++;
    }

}
