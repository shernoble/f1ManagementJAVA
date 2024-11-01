package f1management;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Championship championship = new Championship();

        // Add teams and drivers
        Team team1 = new Team("Red Bull Racing", "Austria");
        Driver driver1 = new Driver("Max Verstappen","Netherlands",24);
        Driver driver2 = new Driver("Sergio Perez","Mexico",31);
        team1.addDriver(driver1);
        team1.addDriver(driver2);

        Team team2 = new Team("Mercedes", "Germany");
        Driver driver3 = new Driver("Lewis Hamilton", "Greate Britain",36);
        Driver driver4 = new Driver("George Russell", "Greate Britain",23);
        team2.addDriver(driver3);
        team2.addDriver(driver4);

        championship.addTeam(team1);
        championship.addTeam(team2);

        // Simulate a race
        Race race1 = new Race("Monaco Grand Prix", new Date());
        race1.addResult(driver1, 1); // Verstappen in 1st
        race1.addResult(driver3, 2); // Hamilton in 2nd
        race1.addResult(driver2, 3); // Perez in 3rd
        championship.addRace(race1);

        // Display current standings
        System.out.println("Current Standings:");
        championship.displayStandings();
    }
}
