package f1management;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private String teamName;
	private String teamPrinciple;
	private List<Driver> drivers;
	
	
	public Team(String teamName, String princi) {
        this.setTeamName(teamName);
        this.setTeamPrinciple(princi);
        this.drivers = new ArrayList<>();
    }
	
	
	public void addDriver(Driver driver)
	{
		drivers.add(driver);
	}
	
	public List<Driver> getDrivers()
	{
		return drivers;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getTeamPrinciple() {
		return teamPrinciple;
	}


	public void setTeamPrinciple(String teamPrinciple) {
		this.teamPrinciple = teamPrinciple;
	}
}
