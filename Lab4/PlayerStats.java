public abstract class PlayerStats implements Comparable<PlayerStats>{
    protected Player player;
    protected int noMatches;
    
    
    public PlayerStats(Player p){
    this.player = p;
    noMatches = 0;
}

    public void updateStats(Match m){
}

    public abstract void PrintStats();

    public int getNoMatches() {
        return noMatches;
    }

    public Player getPlayer() {
        return player;
    }


}
