import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Game> teams = new ArrayList<>();
        System.out.println("Filename:");
        String nameOfFile = scanner.nextLine();
        int counter = 0;
        int wins = 0;
        int losses = 0;
        try (Scanner diskreader = new Scanner(Path.of("Part4/" + nameOfFile))) {
            while (diskreader.hasNext()) {
                String row = diskreader.nextLine();
                String[] splits = row.split(",");
                String homeName = splits[0];
                String visitingName = splits[1];
                int homePoints = Integer.parseInt(splits[2]);
                int visitingPoints = Integer.parseInt(splits[3]);

                teams.add(new Game(homeName, visitingName, homePoints, visitingPoints));
            }
            System.out.println("Enter Team Name:");
            String entry = scanner.nextLine();

            for (Game item : teams) {
                if (item.getHomeName().equals(entry) || item.getVisitName().equals(entry)) {
                    counter++;
                    if (item.getHomeName().equals(entry) && item.getHomePoints() > item.getVisitPoints()) {
                        wins++;
                    } else if (item.getVisitName().equals(entry) && item.getVisitPoints() > item.getHomePoints()) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }

            System.out.println("Games: " + counter);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
