public class Match {
    private double homeScored;
    private double homeConceded;
    private double homeGames;
    private double awayScored;
    private double awayConceded;
    private double awayGames;
    private double odds;
    private String matchName;

    public Match(){
        homeScored = 0;
        homeConceded = 0;
        homeGames = 0;
        awayScored = 0;
        awayConceded = 0;
        awayGames = 0;
        matchName = "";
        odds = 0;
    }

    public Match(double hS, double hC, double hG, double aS, double aC, double aG, double matchOdds, String mN) {
        homeScored = hS;
        homeConceded = hC;
        homeGames = hG;
        awayScored = aS;
        awayConceded = aC;
        awayGames = aG;
        matchName = mN;
        odds = matchOdds;
    }

    public double getHomeScored(){
        return homeScored;
    }

    public double getHomeConceded(){
        return homeConceded;
    }

    public double getHomeGames(){
        return homeGames;
    }

    public double getAwayScoredScored(){
        return awayScored;
    }

    public double getAwayConcededScored(){
        return awayConceded;
    }

    public double getAwayGamesScored(){
        return awayGames;
    }

    public String getMatchName(){
        return matchName;
    }

    public double expectedHomeGoals(){
        return (homeScored + awayConceded) / (homeGames + awayGames);
    }

    public double expectedAwayGoals(){
        return (homeConceded + awayScored) / (homeGames + awayGames);
    }

    public double[] poisson(double expectedGoals){
        double[] probability = new double[5];
        for(int k = 0; k < 5; k++){
            probability[k] = (Math.pow(Math.E, -expectedGoals) * Math.pow(expectedGoals, k)) / fact(k);
        }
        return probability;
    }

    public double kelly(double odds, double probability){
        return -1;
    }

    public double fact(double n) {
        if (n <= 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public void analyze(Match[] matches){
        int size = matches.length;

        for(int k = 0; k < size; k++){

        }
    }

}
