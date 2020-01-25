import java.util.*;

public class Soccer {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double homeGoals = 0;
        double awayGoals = 0;
        double homeConceded = 0;
        double awayConceded = 0;
        double homeGames = 0;
        double awayGames = 0;
        String matchName = "";
        int numGames = 0;

        System.out.print("Number of Games to Analyze: ");
        numGames = s.nextInt();

        Match[] matches = new Match[numGames];

        for(int k = 0; k < numGames; k++){
            System.out.print("Home Team Goals Scored: ");
            homeGoals = s.nextDouble();

            System.out.print("Home Team Goals Conceded: ");
            homeConceded = s.nextDouble();

            System.out.print("Number of Games for Home: ");
            homeGames = s.nextDouble();

            System.out.print("Away Team Goals Scored: ");
            awayGames = s.nextDouble();

            System.out.print("Away Team Goals Conceded: ");
            awayConceded = s.nextDouble();

            System.out.print("Number of Games for Away: ");
            awayGames = s.nextDouble();

            System.out.print("Name of the Match: ");
            matchName = s.next();

            Match m = new Match(homeGoals, homeConceded, homeGames, awayGoals, awayConceded, awayGames, matchName);
            matches[k] = m;
        }



    }


}
