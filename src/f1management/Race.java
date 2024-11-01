package f1management;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Race {
    private String raceName;
    private Date date;
    private Map<Driver, Integer> results; // Driver and finishing position

    public Race(String raceName, Date date) {
        this.raceName = raceName;
        this.date = date;
        this.results = new HashMap<>();
    }

    public void addResult(Driver driver, int position) {
        results.put(driver, position);
    }

    public void assignPoints() {
        for (Map.Entry<Driver, Integer> entry : results.entrySet()) {
            int position = entry.getValue();
            Driver driver = entry.getKey();
            int points = calculatePoints(position);
            driver.addPoints(points);
        }
    }

    private int calculatePoints(int position) {
        switch (position) {
            case 1: return 25;
            case 2: return 18;
            case 3: return 15;
            case 4: return 12;
            case 5: return 10;
            case 6: return 8;
            case 7: return 5;
            case 8: return 3;
            case 9: return 2;
            case 10: return 1;
            default: return 0;
        }
    }
}
