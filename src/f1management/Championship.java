package f1management;

import java.util.ArrayList;
import java.util.List;

public class Championship {
    private List<Team> teams;
    private List<Race> races;

    public Championship() {
        teams = new ArrayList<>();
        races = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void addRace(Race race) {
        races.add(race);
        race.assignPoints();
    }

    public void displayStandings() {
        teams.stream()
            .flatMap(team -> team.getDrivers().stream())
            .sorted((d1, d2) -> Integer.compare(d2.getPoints(), d1.getPoints()))
            .forEach(driver -> System.out.println(driver.getName() + ": " + driver.getPoints() + " points"));
    }
}
