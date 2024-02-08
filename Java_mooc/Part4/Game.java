public class Game {
    private String hTeam;
    private String vTeam;
    private int hPoints;
    private int vPoints;

    public Game(String homeName, String visitName, int homePoints, int visitPoints) {
        this.hTeam = homeName;
        this.vTeam = visitName;
        this.hPoints = homePoints;
        this.vPoints = visitPoints;
    }
    public String getHomeName(){
        return hTeam;
    }
    public String getVisitName(){
        return vTeam;
    }

    public int getHomePoints() {
        return hPoints;
    }
    public int getVisitPoints(){
        return vPoints;
    }
}

